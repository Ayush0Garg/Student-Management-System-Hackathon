package com.example.Student.Management.System.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document (collection = "Student")
public class StudentModel {

    @Id
    private String id;
    private String nameStudent;
    private String classId;
    private String[] attendance;
    private int score;

    public StudentModel() {
    }

    public StudentModel(StudentModel studentModel) {
        this.id = id;
        this.nameStudent = nameStudent;
        this.classId = classId;
        this.score = score;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String[] getAttendance() {
        return attendance;
    }

    public void setAttendance(String[] attendance) {
        this.attendance = attendance;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
