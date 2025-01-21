package com.example.socialmedia.services;

import com.example.socialmedia.model.Post;
import java.util.*;

public class PostService {
    private Map<Integer, Post> posts;
    private int postCounter;

    public PostService() {
        this.posts = new HashMap<>();
        this.postCounter = 1;
    }

    public String uploadPost(int userId, String content) {
        int postId = postCounter++;
        Post post = new Post(postId, userId, content);
        posts.put(postId, post);
        return "Upload Successful with post id: " + postId;
    }

    public List<Post> getAllPosts() {
        return new ArrayList<>(posts.values());
    }
}
