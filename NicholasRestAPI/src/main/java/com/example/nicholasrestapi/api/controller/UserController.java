package com.example.nicholasrestapi.api.controller;

import com.example.nicholasrestapi.api.model.User;
import com.example.nicholasrestapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public User getUser(@RequestParam int id) {
        if (userService.getUser(id) != null) {
            return userService.getUser(id);
        }
        return null;
    }
}
