package com.himanshu.reelcrit.repo;

import com.himanshu.reelcrit.entities.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewsRepo extends JpaRepository<Reviews,Integer> {
    List<Reviews> findByUserId(int userId);
}
