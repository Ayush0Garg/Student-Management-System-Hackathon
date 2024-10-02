package com.example.Student.Management.System.Repository;

import com.example.Student.Management.System.Models.QuizModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuizRepo extends MongoRepository <QuizModel, String> {

}
