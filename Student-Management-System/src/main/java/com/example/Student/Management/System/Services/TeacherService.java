package com.example.Student.Management.System.Services;

import com.example.Student.Management.System.Models.TeacherModel;
import com.example.Student.Management.System.Repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepo teacherRepo;

    public ResponseEntity<HttpStatus> addTeacher(TeacherModel teacherModel) {
        try {
            teacherRepo.save(teacherModel);  // Save the teacher model to the repository
            return new ResponseEntity<>(HttpStatus.CREATED);  // Return a CREATED status
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);  // In case of any failure
        }
    }

    public ResponseEntity<List<TeacherModel>> findallTeacher() {
        return new ResponseEntity<>(teacherRepo.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<int[]> getScountById(String id) {
        Optional<TeacherModel> teacher = teacherRepo.findById(id);
        return new ResponseEntity<>(teacher.get().getScount(), HttpStatus.OK);
    }

    public ResponseEntity<String[]> getClassesById(String id) {
        Optional<TeacherModel> teacher = teacherRepo.findById(id);
        return new ResponseEntity<>(teacher.get().getClasses(), HttpStatus.OK);
    }


    public ResponseEntity<int[]> getScoresbyId(String id) {
        Optional<TeacherModel> teacher = teacherRepo.findById(id);
            return new ResponseEntity<>(teacher.get().getScores(), HttpStatus.OK);

    }
}

