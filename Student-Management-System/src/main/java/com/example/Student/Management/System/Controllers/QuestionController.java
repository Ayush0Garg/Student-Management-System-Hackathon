package com.example.Student.Management.System.Controllers;

import com.example.Student.Management.System.Models.QuestionModel;
import com.example.Student.Management.System.Repository.Questions;
import com.example.Student.Management.System.Services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ques")
public class QuestionController {

    @Autowired
    private QuestionService questionService;
    @Autowired
    private  Questions questions;

    @GetMapping("/get")
    public List<QuestionModel> getallQuestions(){
        return questionService.getall();
    }
    @PostMapping("/add")
    public HttpStatus add(@RequestBody QuestionModel questionModel){
        questions.save(questionModel);
        return HttpStatus.ACCEPTED;
    }


    @GetMapping("/questions/{id}")
    public Optional<QuestionModel> idQuestion(@PathVariable String id){
        return questionService.idQuestion(id);
    }

}