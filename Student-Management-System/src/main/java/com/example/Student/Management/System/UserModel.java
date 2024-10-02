package com.example.Student.Management.System;// UserModel.java
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class UserModel {

    @Id
    private String id;

    private String pass;

    // Getters and setters

    public void setEmail(String email) {
        this.id = email;
    }
    public String getEmail(){
        return id;
    }

    public String getPassword() {
        return pass;
    }

    public void setPassword(String password) {
        this.pass = password;
    }
}
