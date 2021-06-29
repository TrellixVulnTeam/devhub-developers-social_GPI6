package com.devhub.core.devhubdeveloperssocial.controller;

import com.devhub.core.devhubdeveloperssocial.domain.User;
import com.devhub.core.devhubdeveloperssocial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public void saveUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
