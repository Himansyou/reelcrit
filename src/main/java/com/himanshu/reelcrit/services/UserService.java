package com.himanshu.reelcrit.services;

import com.himanshu.reelcrit.entities.Reviews;
import com.himanshu.reelcrit.entities.Users;
import com.himanshu.reelcrit.repo.ReviewsRepo;
import com.himanshu.reelcrit.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.himanshu.reelcrit.entities.UserDTO;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UsersRepo usersRepo;





    public void createUser(UserDTO userDTO) {
        Users user = new Users();
        user.setUsername(userDTO.getUsername());
        usersRepo.save(user);
    }

    public Optional<Users> getUserById(int id) {
        return usersRepo.findById(id);
    }




}
