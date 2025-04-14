package com.himanshu.reelcrit.api;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TmdbMedia {

    private Long id;
    private String title;
    private String name;
    private String overview;
    private String poster_path;
    private String tagline;
    private String backdrop_path;
    private String release_date;
    private List<Genres> genres;
    
    private String first_air_date;
    @Getter
    @Setter
    public static class Genres {
        private int id;
        private String name;
    }
}
