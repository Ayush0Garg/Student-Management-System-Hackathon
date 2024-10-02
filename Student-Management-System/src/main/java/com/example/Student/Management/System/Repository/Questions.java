package com.example.Student.Management.System.Repository;

import com.example.Student.Management.System.Models.QuestionModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Questions extends MongoRepository<QuestionModel, String> {

}
