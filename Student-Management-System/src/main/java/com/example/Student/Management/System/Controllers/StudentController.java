package com.example.Student.Management.System.Controllers;

import com.example.Student.Management.System.Models.StudentModel;
import com.example.Student.Management.System.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    //add
    @PostMapping("/add")
    public ResponseEntity<StudentModel> addStudent(@RequestBody StudentModel studentModel){
        return new ResponseEntity<>(studentService.addStudent(studentModel), HttpStatus.OK);
    }
    //update
    @PostMapping("/update/{id}")
    public ResponseEntity<StudentModel> updateStudent(@RequestBody StudentModel studentModel){
        return new ResponseEntity<>(studentService.updateStudent(studentModel), HttpStatus.OK);
    }
    //find all
    @GetMapping("/find")
    public ResponseEntity<List<StudentModel>> findallStudent(){
        return new ResponseEntity<>(studentService.findallStudent(), HttpStatus.OK);
    }

    //find one
    @GetMapping("/find/{id}")
    public ResponseEntity<Optional<StudentModel>> findStudentbyId(@PathVariable String id){
        return new ResponseEntity<>(studentService.findStudentbyId(id), HttpStatus.OK);
    }
}
