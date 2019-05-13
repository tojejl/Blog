package com.company;
import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;


public class BlogGenerator {

    private Scanner keyboard;


    public BlogGenerator() {
        this.keyboard = new Scanner(System.in);
    }// does not take in any parameters, creates a new keyboard for each instances

    public Post generatePost() {
        User user = createUser();
        String validate;
        Post newPost;
        do {
            newPost = createPost(user);
            System.out.print("\n" + newPost.toStringPost() + "\n");
            System.out.println("Is this correct? (Enter \"y\" for yes)");
            validate = keyboard.nextLine();
        } while (!validate.toLowerCase().equals("y"));
        return newPost;
    }



    public User generateUser() {
        User newUser = createUser();
        String validate;
        do {
            System.out.println("\n" + newUser.toString() + "\n");
            System.out.println("Is this correct?(Enter \"y\" for yes)");
            validate = keyboard.nextLine();
        } while (!validate.toLowerCase().equals("y"));
        return newUser;
    }

    //Gather information to create new users for a blog
    private User createUser() {
        User user = new User();
        System.out.println("What is your first name?");
        user.setFirstName(keyboard.nextLine());
        System.out.println("What is your last name?");
        user.setLastName(keyboard.nextLine());
        System.out.println("Please enter a username.");
        user.setUserName(keyboard.nextLine());
        System.out.println("Please enter your email address");
        user.setEmail(keyboard.nextLine());
        System.out.println("Please provide a url for an avatar picture.");
        user.setAvatarUrl(keyboard.nextLine());
        return user;
    }


    public Post createPost(User user) {

        Post newPost = new Post();
        newPost.setUser(user);
        System.out.println("Please select a user from the list below.");
        newPost.setPostContent(keyboard.nextLine());

        //System.out.println("What is your username?");
        //user.setUserName(keyboard.nextLine());
        return newPost;
    }





}// end class BlogGenerator












