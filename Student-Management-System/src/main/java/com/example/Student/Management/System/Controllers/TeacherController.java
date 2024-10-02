package com.example.Student.Management.System.Controllers;

import com.example.Student.Management.System.Models.TeacherModel;
import com.example.Student.Management.System.Services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
@CrossOrigin(origins = "http://localhost:5173/")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    //add
    @PostMapping("/add")
    public ResponseEntity<HttpStatus> addTeacher(@RequestBody TeacherModel teacherModel) {
        return teacherService.addTeacher(teacherModel);
    }

    //show teacher
    @GetMapping("/find")
    public ResponseEntity<List<TeacherModel>> findallTeacher() {
        return teacherService.findallTeacher();
    }

    // Fetch classes
    @GetMapping("/classes/{id}")
    public ResponseEntity<String[]> getClassesById(@PathVariable String id) {
        return teacherService.getClassesById(id);
    }

    // Fetch Scores
    @GetMapping("/scount/{id}")
    public ResponseEntity<int[]> getScountById(@PathVariable String id) {
        return teacherService.getScountById(id);
    }

    @GetMapping("/scores/{id}")
    public ResponseEntity<ResponseEntity<int[]>> getScoresbyId(@PathVariable String id) {
        return new ResponseEntity<>(teacherService.getScoresbyId(id), HttpStatus.OK);
    }
}

