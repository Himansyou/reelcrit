package com.himanshu.reelcrit.controllers;

import com.himanshu.reelcrit.entities.Reviews;
import com.himanshu.reelcrit.entities.UserDTO;
import com.himanshu.reelcrit.entities.Users;
import com.himanshu.reelcrit.repo.UserProjection;
import com.himanshu.reelcrit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

 @Autowired
 private UserService userService;


 @PostMapping("/create")
 public ResponseEntity<?> createUser(@RequestBody UserDTO userDTO) {
  userService.createUser(userDTO);
  return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully");
 }


 @GetMapping("/{id}")
 public ResponseEntity<UserProjection> getUser(@PathVariable int id) {
  return userService.getUserById(id)
          .map(ResponseEntity::ok)
          .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
 }


}
