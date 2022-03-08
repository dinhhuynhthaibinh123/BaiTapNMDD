package com.example.notification;



public class User {
    private String fullName;
    private String username;
    private String password;
    private String dateOfBirth;
    private String describe;

    public User(String fullName, String username, String password, String dateOfBirth, String describe) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.describe = describe;
    }
    public User () {
        this.fullName = "";
        this.username = "";
        this.password = "";
        this.dateOfBirth = "";
        this.describe = "";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
