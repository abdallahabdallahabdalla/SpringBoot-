package com.example.FirstProject.Model;

public class user {
    private String name;
    private String email;

    // Getters and Setters are required for Spring to bind the data!
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}