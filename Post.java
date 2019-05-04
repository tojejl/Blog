package com.company;


public class Post {
    //Static variable that stores how many posts have been created
    //so the id of each post is unique
    private static int postIdCounter = 0;

    private User user;
    private int id;
    private String content;
    private String url;

    //Constructor to create new Post object with just user and content
    public Post(User user, String content) {
        //Updates static post counter variable by 1
        postIdCounter++;
        //Sets post id to current post counter value
        this.id = postIdCounter;
        //Fills fields with data added with the constructor
        this.user = user;
        this.content = content;
    }

    //Constructor to create new Post object with user, content, and url
    public Post(User user, String content, String url) {
        //Updates static post counter variable by 1
        postIdCounter++;
        //Sets post id to current post counter value
        this.id = postIdCounter;
        //Fills fields with data added with the constructor
        this.user = user;
        this.content = content;
        this.url = url;
    }

    public Post() {
        postIdCounter++;
        this.id = postIdCounter;
    }

    //Getter to return the post id
    public int getId() {
        return this.id;
    }

    public void setPostIdCounter (int postIdCounter) { this.id = id;}

    public String getPostContent(){return content;}

    public void setPostContent(String content) { this.content = content;}




    //Method to override the built-in toString method
    //and display a post in a format of our choosing
    public String toStringPost() {
        return "Post number: " + this.id + "\n" +
                this.content + "\n" +
                //"Written by: " + this.user.getUserName() + "\n" +
                //The expression below checks if the url
                //field is null. If not, it displays the url.
                //If it is, it just displays an empty string
                "URL: " + (this.url != null ? this.url : "");
    }

}// end class Post
