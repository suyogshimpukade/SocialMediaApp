package com.example.socialmedia.model;

import java.time.LocalDateTime;

public class Post {
    private int postId;
    private int userId;
    private String content;
    private LocalDateTime timestamp;
    private int likes;
    private int dislikes;

    public Post(int postId, int userId, String content) {
        this.postId = postId;
        this.userId = userId;
        this.content = content;
        this.timestamp = LocalDateTime.now();
        this.likes = 0;
        this.dislikes = 0;
    }

    public int getPostId() {
        return postId;
    }

    public int getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void likePost() {
        likes++;
    }

    public void dislikePost() {
        dislikes++;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }
}
