package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Creates an list of posts to store each post object
        List<Post> postList = new ArrayList<>();


        //Loops through the list of posts, pulling out each post
        //and storing it into a variable. Then prints the results
        //of the toString method.
        for(Post post: postList){
            System.out.println(post.toString());
            System.out.println("");
        }

        //Loops through the list of posts, pulling out each post
        //and storing it into a variable. Then prints the results
        //of the toString method.
        for(Post post: postList){
            System.out.println(post.toString());
            System.out.println("");
        }

        BlogMenu blogmenu = new BlogMenu();

        blogmenu.run();
    }
}
