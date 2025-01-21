# Social Media Application

A simple Java-based social media application that allows users to register, post messages, follow/unfollow other users, and view their feed through a command-line interface.

## Features

- **Register users** with a unique user ID and username.
- **Post messages** on behalf of users.
- **Follow and unfollow** other users.
- **View feed** showing posts from followed users.

## How to Run

1. **Clone the repository:**

    ```bash
    git clone https://github.com/your-username/social-media-application.git
    cd social-media-application
    ```

2. **Compile the Java code:**

    ```bash
    javac -d bin src/main/java/com/example/socialmedia/main/SocialMediaApplication.java
    ```

3. **Run the application:**

    ```bash
    java -cp bin com.example.socialmedia.main.SocialMediaApplication
    ```

## Available Commands

- `register <userId> <username>` - Register a new user.
- `post <userId> <content>` - Create a new post.
- `follow <userId1> <userId2>` - User1 follows User2.
- `unfollow <userId1> <userId2>` - User1 unfollows User2.
- `feed <userId>` - View the feed of a user.
- `exit` - Exit the application.

## Example

