package com.example.socialmedia.services;

import com.example.socialmedia.model.Post;
import com.example.socialmedia.model.User;

import java.util.*;
import java.util.stream.Collectors;

public class FeedService {
    private UserService userService;
    private PostService postService;

    public FeedService(UserService userService, PostService postService) {
        this.userService = userService;
        this.postService = postService;
    }

    public List<Post> showFeed(int userId) {
        User user = userService.getUser(userId);
        if (user == null) return Collections.emptyList();

        Set<Integer> followedUsers = user.getFollowers();
        List<Post> allPosts = postService.getAllPosts();

        return allPosts.stream()
                .sorted((p1, p2) -> {
                    boolean isFollowed1 = followedUsers.contains(p1.getUserId());
                    boolean isFollowed2 = followedUsers.contains(p2.getUserId());
                    if (isFollowed1 != isFollowed2) {
                        return isFollowed1 ? -1 : 1;
                    }
                    return p2.getTimestamp().compareTo(p1.getTimestamp());
                })
                .collect(Collectors.toList());
    }
}
