package com.himanshu.reelcrit.repo;

import com.himanshu.reelcrit.repo.UserProjection;
import com.himanshu.reelcrit.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {
    @Query("SELECT u FROM Users u WHERE u.id = :id")
    UserProjection findProjectedById(@Param("id") int id);
}
