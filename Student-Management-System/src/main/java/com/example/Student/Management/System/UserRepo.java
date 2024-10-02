// UserRepo.java
package com.example.Student.Management.System;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepo extends MongoRepository<UserModel, String> {
    // Fetch a user by email
    Optional<UserModel> findByEmail(String email);
}
