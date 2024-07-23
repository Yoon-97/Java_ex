package com.example.summer.user;

public class User {
    private String id;
    private String password;
    private String name;

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public User(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }
}
