package com.example.nicholasrestapi.service;

import com.example.nicholasrestapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "niekw", "Nicholas", "Ekwom", "ekwomnick@gmail.com", "5875689074");
        User user2 = new User(2, "jdoe", "John", "Doe", "johndoe@gmail.com", "1234567890");
        User user3 = new User(3, "asmith", "Alice", "Smith", "alicesmith@gmail.com", "0987654321");
        User user4 = new User(4, "bwayne", "Bruce", "Wayne", "brucewayne@wayneindustries.com", "1112223333");
        User user5 = new User(5, "ckent", "Clark", "Kent", "clarkkent@dailyplanet.com", "2223334444");

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    public User getUser(Integer id){
        for (User user : userList) {
            if (id == user.getID()){
                return user;
            }
        }
        return null;
    }
}
