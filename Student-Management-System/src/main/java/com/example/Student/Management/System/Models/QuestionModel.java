package com.example.Student.Management.System.Models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "questions")
public class QuestionModel {
    private String id;
    private String question;
    private String [] options;
    private String answer;

    public QuestionModel() {
    }

    public QuestionModel(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
