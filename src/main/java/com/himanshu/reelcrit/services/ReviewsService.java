package com.himanshu.reelcrit.services;

import com.himanshu.reelcrit.entities.Reviews;
import com.himanshu.reelcrit.entities.Users;
import com.himanshu.reelcrit.entities.Movies;
import com.himanshu.reelcrit.repo.ReviewsRepo;
import com.himanshu.reelcrit.repo.UsersRepo;
import com.himanshu.reelcrit.repo.MoviesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class ReviewsService {
    private static final Logger logger = Logger.getLogger(ReviewsService.class.getName());

    @Autowired
    private ReviewsRepo reviewsRepo;

    @Autowired
    private UsersRepo usersRepo;

    @Autowired
    private MoviesRepo moviesRepo;

    @Transactional
    public void addReview( Reviews review) {
        int userId = review.getUserId();
        int movieId = review.getMovieId();
        logger.info("Adding review for user ID: " + userId);

        // Check if user exists
        Users user = usersRepo.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));





        // Set relationships
        review.setUserId(userId);
        review.setMovieId(movieId);
        review.setUsername(user.getUsername());
        review.setContent(review.getContent());

        // Save review
        reviewsRepo.save(review);
        logger.info("Review added successfully!");
    }
   public List<Reviews> findByUserId(int userId){
        return reviewsRepo.findByUserId(userId);
   }

}
