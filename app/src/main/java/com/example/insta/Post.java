package com.example.insta;

public class Post {
    private String name;
    private String message;
    private boolean isLiked;

    public Post(String name, String message, boolean isLiked) {
        this.name = name;
        this.message = message;
        this.isLiked = isLiked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }
}
