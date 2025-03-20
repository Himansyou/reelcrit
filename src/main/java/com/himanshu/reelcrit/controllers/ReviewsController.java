package com.himanshu.reelcrit.controllers;


import com.himanshu.reelcrit.entities.Reviews;
import com.himanshu.reelcrit.services.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/Reviews")

public class ReviewsController {
    @Autowired
  private ReviewsService reviewsService;

    @PostMapping("{userId}/add")
    public void addReview(@PathVariable int userId ,@RequestBody Reviews review){
            reviewsService.addReview(userId,review);
    }
}
