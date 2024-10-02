package com.example.Student.Management.System.Controllers;

import com.example.Student.Management.System.Models.QuestionModel;
import com.example.Student.Management.System.Models.QuestionWrapper;
import com.example.Student.Management.System.Models.QuizModel;
import com.example.Student.Management.System.Services.QuizService;
import com.example.Student.Management.System.Models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    QuizService quizService;

    @PostMapping("/create/{num}")
    public ResponseEntity<List<QuestionModel>> create(@PathVariable String num){
        return quizService.create(num);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuestionQuiz(@PathVariable String id){
        return quizService.getQuestionQuiz(id);
    }

    @PostMapping("submit/{id}")
    public ResponseEntity<Integer> submit(@PathVariable String id, @RequestBody List<Response> response){
        return quizService.submit(id, response);
    }


}
