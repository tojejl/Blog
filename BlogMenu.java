package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlogMenu {

    private List<User> userLog;
    private List<Post> postLog;
    private Scanner keyboard;


    public BlogMenu() {
        this.userLog = new ArrayList();
        this.postLog = new ArrayList();
        this.keyboard = new Scanner(System.in);
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

    }

    private void welcome() {
        System.out.println("Main Menu");
    }

    private void processSelection(int selection) {
        BlogGenerator blogGenerator = new BlogGenerator();
        BlogMenu blogMenu = new BlogMenu();
        switch (selection) {
            case 1:
                User newuser = blogGenerator.generateUser();
                userLog.add(newuser);
                break;
            case 2:
                int selection1;
                System.out.println("Please select a user from the list below.");
                for (int index = 0; index < userLog.size(); index++) {
                    System.out.println(index+ " " + userLog.get(index).getUserName());
                }
                selection1 = keyboard.nextInt();
                keyboard.skip("\n");
                Post newpost = blogGenerator.createPost(userLog.get(selection1));
                postLog.add(newpost);

                break;
            case 3:
                viewPosts();
                break;
            case 4:
                viewUsers();

                break;
        }
    }

    //Loops through the list of posts, pulling out each post
    //and storing it into a variable. This prints the results
    //of the toStringPost method
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
    public void viewUsers() {
        for (User user : userLog) {
            System.out.println("------------------------------------------");
            System.out.println(user.toString());
        }
        System.out.println("------------------------------------------");
        System.out.println("");
    }

    public User selectUserName() {
       User user = new User();
        int selection;
        System.out.println("Please select a user from the list below.");
        for (int index = 0; index < userLog.size(); index++) {
            System.out.println(userLog.get(index).getUserName());

            }
        return user;
    }






    //public Post generatePost1() {
        //User user = getUserName();
        //String validate;
        //Post newPost;
        //do {
            //newPost = createPost(user);
            //System.out.println("\n" + newPost.toStringPost() + "\n");
           // System.out.println("Is this correct? (Enter \"y\" for yes)");
            //validate = keyboard.nextLine();
        //} while (!validate.toLowerCase().equals("y"));
        //return newPost;
   // }

    //private User selectUser() {
        //User newUser = new User();
        //System.out.println("Please begin typing your the body of your blog post below this line.");
        //newPost.setPostContent(keyboard.nextLine());
        //int selection = 0;
        //Scanner keyboard = new Scanner(System.in);
        //System.out.println("Please select a user from the list below.");
        //for (int index = 0; index < userLog.size(); index++) {
            //ystem.out.println(userLog.get(index).getUserName());
            //selection = keyboard.nextInt();
            //System.out.println(userLog.get(0));
            }
        //System.out.println("1) " +userLog.get(0));

        //return selection;
    //
//}


//currentuser = get.username? list.get


// end class BlogMenu
