package com.himanshu.reelcrit.api;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TmdbMedia {

    private Long id;
    private String title;
    private String name;
    private String overview;
    private String poster_path;
    private String tagline;

}
