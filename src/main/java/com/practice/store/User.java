package com.practice.store;

public class User {

    private String name;
    private String email;
    private String password;
    private Long id;

    public User(String name, String email, String password, Long id) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.id = id;
    }


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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
