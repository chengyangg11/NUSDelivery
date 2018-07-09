package com.example.chengyang.nusdelivery.Model;

public class User {
    private String name;
    private String password;

    public User() {
    }

    public User(String password, String name) {
        this.password = password;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
