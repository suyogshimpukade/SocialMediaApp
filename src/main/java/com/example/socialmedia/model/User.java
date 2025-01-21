package com.example.socialmedia.model;

import java.util.*;

public class User {
    private int userId;
    private String username;
    private Set<Integer> followers;
    private List<Integer> posts;

    public User(int userId, String username) {
        this.userId = userId;
        this.username = username;
        this.followers = new HashSet<>();
        this.posts = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public Set<Integer> getFollowers() {
        return followers;
    }

    public List<Integer> getPosts() {
        return posts;
    }

    public void followUser(int userId) {
        followers.add(userId);
    }

    public void unfollowUser(int userId) {
        followers.remove(userId);
    }
}
