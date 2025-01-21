package com.example.socialmedia.services;

import com.example.socialmedia.model.User;
import java.util.*;

public class UserService {
    private Map<Integer, User> users;

    public UserService() {
        this.users = new HashMap<>();
    }

    public String registerUser(int userId, String username) {
        if (users.containsKey(userId)) {
            return "User ID already exists!";
        }
        users.put(userId, new User(userId, username));
        return username + " Registered!";
    }

    public User getUser(int userId) {
        return users.get(userId);
    }
}
