package com.example.socialmedia.controllers;

import com.example.socialmedia.services.PostService;

public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    public String uploadPost(int userId, String content) {
        return postService.uploadPost(userId, content);
    }
}
