package com.himanshu.reelcrit.controllers;

import com.himanshu.reelcrit.entities.Reviews;
import com.himanshu.reelcrit.entities.UserDTO;
import com.himanshu.reelcrit.entities.Users;
import com.himanshu.reelcrit.services.ReviewsService;
import com.himanshu.reelcrit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Users")
public class UserController {

 @Autowired
 private UserService userService;
 @Autowired
 private ReviewsService reviewsService;


 @PostMapping("/create")
 public ResponseEntity<?> createUser(@RequestBody UserDTO userDTO) {
  userService.createUser(userDTO);
  return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully");
 }


 @GetMapping("/{id}")
 public ResponseEntity<Users> getUser(@PathVariable int id) {
  return userService.getUserById(id)
          .map(ResponseEntity::ok)
          .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
 }
 @GetMapping("/{userId}/reviews")
  public List<Reviews> findByUserId(@PathVariable int userId){
  return reviewsService.findByUserId(userId);
 }

}
