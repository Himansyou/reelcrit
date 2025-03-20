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
    public void addReview(int userId, Reviews review) {
        logger.info("Adding review for user ID: " + userId);

        // Check if user exists
        Users user = usersRepo.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // Check if movie exists
        if (review.getMovies() == null || review.getMovies().getMovies_id() == 0) {
            throw new RuntimeException("Movie ID is missing in the request");
        }

        Movies movie = moviesRepo.findById(review.getMovies().getMovies_id())
                .orElseThrow(() -> new RuntimeException("Movie not found"));

        // Set relationships
        review.setUser(user);
        review.setMovies(movie);

        // Save review
        reviewsRepo.save(review);
        logger.info("Review added successfully!");
    }
   public List<Reviews> findByUserId(int userId){
        return reviewsRepo.findByUserId(userId);
   }
}
