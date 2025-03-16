package com.himanshu.reelcrit.services;

import com.himanshu.reelcrit.entities.Reviews;
import com.himanshu.reelcrit.entities.UserDTO;
import com.himanshu.reelcrit.entities.Users;
import com.himanshu.reelcrit.repo.ReviewsRepo;
import com.himanshu.reelcrit.repo.UserProjection;
import com.himanshu.reelcrit.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {
    @Autowired
    private UsersRepo usersRepo;



    @Autowired
    private ReviewsRepo reviewsRepo;

    public void createUser(UserDTO userDTO) {
        Users user = new Users();
        user.setUsername(userDTO.getUsername());
        usersRepo.save(user);
    }



    public Optional<UserProjection> getUserById(int id) {
        return Optional.ofNullable(usersRepo.findProjectedById(id));
    }

    public Optional<Reviews> getReviewsByUser(int id){
       return reviewsRepo.findById(id);

    }
}
