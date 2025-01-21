package com.example.socialmedia.controllers;

import com.example.socialmedia.services.UserService;
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public String registerUser(int userId, String username) {
        return userService.registerUser(userId, username);
    }

    public String followUser(int userId1, int userId2) {
        if (userService.getUser(userId1) == null || userService.getUser(userId2) == null) {
            return "Invalid user(s).";
        }
        userService.getUser(userId1).followUser(userId2);
        return "Followed " + userService.getUser(userId2).getUsername() + "!";
    }

    public String unfollowUser(int userId1, int userId2) {
        if (userService.getUser(userId1) == null || userService.getUser(userId2) == null) {
            return "Invalid user(s).";
        }
        userService.getUser(userId1).unfollowUser(userId2);
        return "Unfollowed " + userService.getUser(userId2).getUsername() + "!";
    }
}
