package com.himanshu.reelcrit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
@RestController
@RequestMapping("auth/health")
public class DbPing {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/ping-db")
    public ResponseEntity<String> pingDatabase() {
        try {
            jdbcTemplate.queryForObject("SELECT 1", Integer.class);
            return ResponseEntity.ok("MySQL DB is alive");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("MySQL DB ping failed: " + e.getMessage());
        }
    }
}
