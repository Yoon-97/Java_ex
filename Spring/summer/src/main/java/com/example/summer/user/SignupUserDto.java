package com.example.summer.user;

public class SignupUserDto {

    private String id;
    private String password;
    private String name;

    public SignupUserDto(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }

    public User convertToUser() {
        return new User(this.id, this.password, this.name);
    }

}
