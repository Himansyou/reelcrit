package com.himanshu.reelcrit.controllers;

import com.himanshu.reelcrit.api.TmdbApi;
import com.himanshu.reelcrit.entities.Reviews;
import com.himanshu.reelcrit.services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/movies")
public class MoviesController {
    @Autowired
    private MoviesService moviesService;


    @GetMapping("/search/{name}")
    public ResponseEntity<?> getResults(@PathVariable String name) {

        TmdbApi tmdbApi =  moviesService.getResults(name);
        ArrayList<TmdbApi.Result> result = (ArrayList<TmdbApi.Result>) tmdbApi.getResults();

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    @GetMapping("/reviews/{id}")
    public ResponseEntity<?> getReviewsForMovie(@PathVariable int id){

       List<Reviews> reviews  = moviesService.getReviewsForMovie(id);
       return new ResponseEntity<>(reviews,HttpStatus.OK);

    }
    @GetMapping("/popular")
    public TmdbApi getPopularMovies() {
        return moviesService.getPopularMovies();
    }

}
