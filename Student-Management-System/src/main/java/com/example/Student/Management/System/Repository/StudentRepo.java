package com.example.Student.Management.System.Repository;

import com.example.Student.Management.System.Models.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<StudentModel, String> {

}
