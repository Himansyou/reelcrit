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

    @ManyToOne
    @JoinColumn(name = "user_id" , nullable = false)
    private Users user;
    @ManyToOne
    @JoinColumn(name = "movie_id" , nullable = false)
    private Movies movies;

    private int rating ;
}
