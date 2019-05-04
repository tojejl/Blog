package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlogMenu {

    private List<User> userLog;
    private List<Post> postLog;


    public BlogMenu() {
        this.userLog = new ArrayList();
        this.postLog = new ArrayList();
    }

    public void run() {

        welcome();

        int selection;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("1) Create a new user");
            System.out.println("2) Create a post as the current user");
            System.out.println("3) Print all posts");
            System.out.println("4) Print all users");
            System.out.println("0) Exit program");
            selection = keyboard.nextInt();
            //keyboard.skip("\n");
            if (selection != 0) {
                processSelection(selection);
                //If user selects 0 user exists the program
            }

        } while (selection != 0);


        //uses user list to scroll through users
        // for (int i = 0; i < userLog.size(); i++)
        //{
        //System.out.println(userLog.get(i).name);
        //menu system to select users from list to create post using selected user
        //System.out.println("User Menu")
        //System.out.println("You have selected user +placeholder for correct user code here +", what would you like to do?");
        //int userSelection;
        //scanner keyboard = new Scanner(System.in);






    }

    private void welcome() {
        System.out.println("Main Menu");
    }

    private void processSelection(int selection) {
        BlogGenerator blogGenerator = new BlogGenerator();
        switch (selection) {
            case 1:
                User newuser = blogGenerator.generateUser();
                userLog.add(newuser);
                break;
            case 2:
                Post newpost = blogGenerator.generatePost();
                postLog.add(newpost);
                break;
            case 3:
                //for (int index = 0; index < postLog.size(); index++) {
                    //System.out.println(postLog.get(index).getPostContent());}
                viewPosts();
                break;
            case 4:
                //for (int index = 0; index < userLog.size(); index++){
                    //System.out.println(userLog.get(index).getUserName());}
                viewUsers();
                break;
        }
    }

    //Loops through the list of posts, pulling out each post2
    //and storing it into a variable. This prints the results
    //of the toString method
    private void viewPosts() {
        for (Post post : postLog) {
            System.out.println("------------------------------------------");
            System.out.println(post.toStringPost());
        }
        System.out.println("------------------------------------------");
        System.out.println("");

    }

    //Loops through the list of users, pulling out each user
    //and storing in into a variable. This prints the results
    //of the user toString method
    private void viewUsers() {
        for (User user : userLog) {
            System.out.println("------------------------------------------");
            System.out.println(user.toString());
        }
        System.out.println("------------------------------------------");
        System.out.println("");
    }




    // }
}// end class BlogMenu
