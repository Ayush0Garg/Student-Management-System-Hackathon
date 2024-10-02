package com.example.Student.Management.System.Repository;

import com.example.Student.Management.System.Models.TeacherModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepo extends MongoRepository<TeacherModel, String>{
}
