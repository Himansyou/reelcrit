package com.himanshu.reelcrit.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true) // Ignore extra fields in JSON
public class TmdbApi {

    @JsonProperty("results")  //  JSON mapping
    private List<Result> results;

    @Getter
    @Setter
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {
        @JsonProperty("adult")
        private boolean adult;

        @JsonProperty("id")
        private int id;

        @JsonProperty("overview")
        private String overview;

        @JsonProperty("poster_path")
        private String imageUrl;

        @JsonProperty("release_date")
        private String releaseDate;

        @JsonProperty("title")
        private String title;
        @JsonProperty("name")
        private String name;
        @JsonProperty("media_type")
        private String mediaType;
        @JsonProperty("first_air_date")
        private String firstAirDate;
    }
}
