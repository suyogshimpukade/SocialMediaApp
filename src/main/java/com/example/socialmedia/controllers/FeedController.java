package com.example.socialmedia.controllers;

import com.example.socialmedia.model.Post;
import com.example.socialmedia.services.FeedService;

import java.util.List;

public class FeedController {
    private final FeedService feedService;

    public FeedController(FeedService feedService) {
        this.feedService = feedService;
    }

    public void showFeed(int userId) {
        List<Post> feed = feedService.showFeed(userId);
        if (feed.isEmpty()) {
            System.out.println("No posts to show.");
            return;
        }
        for (Post post : feed) {
            System.out.println("User: " + post.getUserId());
            System.out.println("Post: " + post.getContent());
            System.out.println("Timestamp: " + post.getTimestamp());
            System.out.println();
        }
    }
}
