package com.himanshu.reelcrit.repo;

import com.himanshu.reelcrit.entities.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoviesRepo extends JpaRepository<Movies, Integer> {
}
