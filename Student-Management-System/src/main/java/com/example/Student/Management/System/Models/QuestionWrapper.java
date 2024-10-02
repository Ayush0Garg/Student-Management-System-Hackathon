package com.example.Student.Management.System.Models;

import org.springframework.data.annotation.Id;


public class QuestionWrapper {
        @Id
        private String id;
        private String title;
        private String question;
        private String [] options;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public QuestionWrapper(String id, String title, String[] options) {
        this.id = id;
        this.title = title;
        this.question = question;
        this.options = options;
    }
}
