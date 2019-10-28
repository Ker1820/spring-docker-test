package com.codedinn.docker.controllers;

import com.codedinn.docker.entities.UserDetails;
import com.codedinn.docker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    private final UserRepository repo;

    @Autowired
    public MainController(UserRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public /*List<UserDetails> */ String getUser(){
        return "all is working fine";
    }

    @PostMapping
    public String postUser(@RequestBody UserDetails userDetails){
        repo.save(userDetails);
        return "success";
    }

}
