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
Welcome to the Social Media Application!

Please enter a command (type 'exit' to quit):
register 1 suyog
suyog Registered!

Please enter a command (type 'exit' to quit): 
post 1 "Im working at xyz company"
Upload Successful with post id: 1

Please enter a command (type 'exit' to quit):
register mahesh
Usage: register <userId> <username>

Please enter a command (type 'exit' to quit):
register Mahesh 2
Invalid user ID format.

Please enter a command (type 'exit' to quit):
register 2 Mahesh
Mahesh Registered!

Please enter a command (type 'exit' to quit):
post 2 "Im working at roctstar studio"
Upload Successful with post id: 2

Please enter a command (type 'exit' to quit):
follow 1 2
Followed Mahesh!

Please enter a command (type 'exit' to quit):
feed 1
User: 2
Post: post 2 "Im working at roctstar studio"
Timestamp: 2025-01-21T21:51:29.764898300

User: 1
Post: post 1 "Im working at xyz company"
Timestamp: 2025-01-21T21:49:54.940756500


Please enter a command (type 'exit' to quit):
feed 2
User: 2
Post: post 2 "Im working at roctstar studio"
Timestamp: 2025-01-21T21:51:29.764898300

User: 1
Post: post 1 "Im working at xyz company"
Timestamp: 2025-01-21T21:49:54.940756500


Please enter a command (type 'exit' to quit):
exit
Exiting Social Media Application.

