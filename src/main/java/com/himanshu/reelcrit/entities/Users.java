package com.himanshu.reelcrit.entities;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;

    @OneToMany(mappedBy = "user")
    private List<Reviews> review;


    
}
