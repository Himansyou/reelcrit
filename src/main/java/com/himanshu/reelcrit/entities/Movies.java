package com.himanshu.reelcrit.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int movies_id ;
    private String name;
    private String description;

    @OneToMany(mappedBy = "movies")
    private List<Reviews> review;
}
