package com.example.Student.Management.System.Services;

import com.example.Student.Management.System.Models.QuestionModel;
import com.example.Student.Management.System.Repository.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    Questions questions;

    public List<QuestionModel> getall(){

        return questions.findAll();
    }

    public Optional<QuestionModel> idQuestion(String id) {

        return questions.findById(id);
    }

    public String addQuestion(QuestionModel question){
        questions.save(question);
        return "Question added";
    }
}
