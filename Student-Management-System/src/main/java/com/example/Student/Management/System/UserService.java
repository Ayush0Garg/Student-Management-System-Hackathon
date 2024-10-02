// UserService.java
package com.example.Student.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepository;

    public boolean authenticateUser(String email, String password) {
        // Fetch the user by email
        UserModel user = userRepository.findByEmail(email).orElse(null);

        // If user exists, validate the password
        return user != null && password.equals(user.getPassword());
    }
}
