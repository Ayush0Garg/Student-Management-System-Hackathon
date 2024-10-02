package com.example.Student.Management.System.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "Teacher")
public class TeacherModel {
    @Id
    private String id;
    private String name;
    private String [] classes;
    private int [] scores;
    private int [] Scount;

    public TeacherModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getClasses() {
        return classes;
    }

    public void setClasses(String[] classes) {
        this.classes = classes;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public int[] getScount() {
        return Scount;
    }

    public void setScount(int[] scount) {
        Scount = scount;
    }
}
