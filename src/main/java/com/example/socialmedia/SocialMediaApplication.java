package com.example.socialmedia;

import com.example.socialmedia.controllers.*;
import com.example.socialmedia.services.*;

import java.util.Scanner;

public class SocialMediaApplication {
    public static void main(String[] args) {
        UserService userService = new UserService();
        PostService postService = new PostService();
        FeedService feedService = new FeedService(userService, postService);

        UserController userController = new UserController(userService);
        PostController postController = new PostController(postService);
        FeedController feedController = new FeedController(feedService);

        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Social Media Application!");
        
        while (true) {
            System.out.println("\nPlease enter a command (type 'exit' to quit): ");
            command = scanner.nextLine().trim();

            if (command.equalsIgnoreCase("exit")) {
                break;
            }

            String[] commandArgs = command.split(" ");
            String action = commandArgs[0];

            switch (action.toLowerCase()) {
                case "register":
                    if (commandArgs.length == 3) {
                        try {
                            int userId = Integer.parseInt(commandArgs[1]);
                            String username = commandArgs[2];
                            System.out.println(userController.registerUser(userId, username));
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid user ID format.");
                        }
                    } else {
                        System.out.println("Usage: register <userId> <username>");
                    }
                    break;

                case "post":
                    if (commandArgs.length > 2) {
                        try {
                            int userId = Integer.parseInt(commandArgs[1]);
                            String content = String.join(" ", commandArgs);
                            System.out.println(postController.uploadPost(userId, content));
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid user ID format.");
                        }
                    } else {
                        System.out.println("Usage: post <userId> <content>");
                    }
                    break;

                case "follow":
                    if (commandArgs.length == 3) {
                        try {
                            int userId1 = Integer.parseInt(commandArgs[1]);
                            int userId2 = Integer.parseInt(commandArgs[2]);
                            System.out.println(userController.followUser(userId1, userId2));
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid user ID format.");
                        }
                    } else {
                        System.out.println("Usage: follow <userId1> <userId2>");
                    }
                    break;

                case "unfollow":
                    if (commandArgs.length == 3) {
                        try {
                            int userId1 = Integer.parseInt(commandArgs[1]);
                            int userId2 = Integer.parseInt(commandArgs[2]);
                            System.out.println(userController.unfollowUser(userId1, userId2));
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid user ID format.");
                        }
                    } else {
                        System.out.println("Usage: unfollow <userId1> <userId2>");
                    }
                    break;

                case "feed":
                    if (commandArgs.length == 2) {
                        try {
                            int userId = Integer.parseInt(commandArgs[1]);
                            feedController.showFeed(userId);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid user ID format.");
                        }
                    } else {
                        System.out.println("Usage: feed <userId>");
                    }
                    break;

                default:
                    System.out.println("Unknown command. Available commands are: register, post, follow, unfollow, feed, exit.");
            }
        }

        System.out.println("Exiting Social Media Application.");
        scanner.close();
    }
}
