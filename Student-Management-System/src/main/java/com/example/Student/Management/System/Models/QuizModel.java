package com.example.Student.Management.System.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "quizes")
public class QuizModel {

    @Id
    private String id;
    private List<QuestionModel> quiz;
    private String num;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public QuizModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public List<QuestionModel> getQuiz() {
        return quiz;
    }

    public void setQuiz(List<QuestionModel> quiz) {
        this.quiz = quiz;
    }
}
