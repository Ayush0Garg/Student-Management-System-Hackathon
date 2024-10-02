package com.example.Student.Management.System.Services;

import com.example.Student.Management.System.Models.StudentModel;
import com.example.Student.Management.System.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public StudentModel addStudent(StudentModel studentModel) {
        return studentRepo.save(studentModel);
    }

    public StudentModel updateStudent(@RequestBody StudentModel studentModel) {
        StudentModel std = new StudentModel(studentModel);
        return studentRepo.save(std);
    }

    public List<StudentModel> findallStudent() {
        return studentRepo.findAll();
    }

    public Optional<StudentModel> findStudentbyId(String id){
        return studentRepo.findById(id);
    }

}
