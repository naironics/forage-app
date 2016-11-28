package com.naironics.forageapp.domain;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class User implements Serializable{

    @Id
    private String id;

    private String email;

    private String password;

    private String role;

    public String getId() {
        return id;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email.replaceFirst("@.*", "@***") +
                ", password='" + password.substring(0, 10) +
                ", role=" + role +
                '}';
    }
}