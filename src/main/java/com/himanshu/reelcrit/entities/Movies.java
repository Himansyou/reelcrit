package com.himanshu.reelcrit.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Movies {

    @Id
    private int id;

    private String name;

    private String type;

    private int year;

    private String imageUrl;

}
