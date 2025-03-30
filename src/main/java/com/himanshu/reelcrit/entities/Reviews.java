package com.himanshu.reelcrit.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String content;
    private int rating;

    @Column(name = "user_id", nullable = false)
    private int userId;

    @Column(name = "movie_id", nullable = false)
    private int movieId;
}

