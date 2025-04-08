package com.himanshu.reelcrit.services;


import com.himanshu.reelcrit.api.TmdbMedia;
import com.himanshu.reelcrit.api.TmdbApi;
import com.himanshu.reelcrit.entities.Reviews;
import com.himanshu.reelcrit.repo.ReviewsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class MoviesService {
    @Value("${api.key.watchmode}")
    private String apiKey;
    private String searchApi = "https://api.themoviedb.org/3/search/multi?api_key=API_KEY&query=NAME";

    private String popularApi = "https://api.themoviedb.org/3/trending/all/week?api_key=API_KEY";

    private String byIdApi = "https://api.themoviedb.org/3/TYPE/ID?api_key=API_KEY";

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ReviewsRepo reviewsRepo;


    public TmdbApi getResults(String name) {
        String finalApi = searchApi.replace("API_KEY", apiKey).replace("NAME", name);


        ResponseEntity<TmdbApi> response = restTemplate.exchange(
                finalApi, HttpMethod.GET, null, TmdbApi.class
        );

        return response.getBody();
    }

    public TmdbApi getPopularMovies() {
        String finalApi = popularApi.replace("API_KEY", apiKey);
        ResponseEntity<TmdbApi> response = restTemplate.exchange(
                finalApi, HttpMethod.GET, null, TmdbApi.class);
        return response.getBody();
    }


    public List<Reviews> getReviewsForMovie(int id) {
        return reviewsRepo.getByMoviesId(id);
    }
    public TmdbMedia getMediaDetails(String type , Long id) {
        String finalApi = byIdApi.replace("API_KEY", apiKey).replace("TYPE", type).replace("ID", String.valueOf(id));
        ResponseEntity<TmdbMedia> response = restTemplate.exchange(
                finalApi, HttpMethod.GET, null, TmdbMedia.class
        );
        return response.getBody();
    }
}
