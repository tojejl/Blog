package com.company;

public class User {

    private String avatarUrl;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;

    public User( String avatarUrl, String userName, String firstName, String lastName, String email) {
        this.avatarUrl = avatarUrl;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email= email;
    }


    public User() {}
    //Getters and setters for each field:
    public String getAvatarUrl() {return avatarUrl;}

    public void setAvatarUrl(String avatarUrl) {this.avatarUrl = avatarUrl;}

    public String getUserName() {return userName;}

    public void setUserName(String userName) {this.userName = userName;}

    public String getFirstName() {return firstName;}

    public void setFirstName (String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}




    //Method to override the built-in toString method
    //and display a post in a format of our choosing
    @Override
    public String toString() {
        return "Username: " + this.userName + "\n" +
                "First Name: " + this.firstName + "\n" +
                "Last Name: " + this.lastName + "\n" +
                "Email Address: " + this.email + "\n" +
                "Avatar Url: " + this.avatarUrl + "\n";
    }
} // end class User





