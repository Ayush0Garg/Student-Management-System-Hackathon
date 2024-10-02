package com.example.Student.Management.System.Services;

import com.example.Student.Management.System.Models.QuestionModel;
import com.example.Student.Management.System.Models.QuizModel;
import com.example.Student.Management.System.Models.QuestionWrapper;
import com.example.Student.Management.System.Repository.Questions;
import com.example.Student.Management.System.Repository.QuizRepo;
import com.example.Student.Management.System.Models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class QuizService {

    @Autowired
    QuizRepo quizRepo;
    @Autowired
    Questions questions;

    public ResponseEntity<List<QuestionModel>> create(String num) {
        try {
            long limit = Long.parseLong(num);

            List<QuestionModel> quiz = questions.findAll();
            if (limit > quiz.size()) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);            }

            Collections.shuffle(quiz);
            QuizModel quizModel = new QuizModel();
            quiz = quiz.stream().limit(limit).collect(Collectors.toList());

            quizModel.setId(UUID.randomUUID().toString());
            quizModel.setQuiz(quiz);
            quizRepo.save(quizModel);

            return new ResponseEntity<>(quiz, HttpStatus.OK);
        } catch (NumberFormatException e) {

            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<List<QuestionWrapper>> getQuestionQuiz(String id) {
        Optional<QuizModel> optionalQuiz = quizRepo.findById(id);
        if (optionalQuiz.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        List<QuestionModel> questionsDB = optionalQuiz.get().getQuiz();
        List<QuestionWrapper> questionForUser = new ArrayList<>();

        for (QuestionModel q : questionsDB) {
            QuestionWrapper qws = new QuestionWrapper(q.getId(),  q.getQuestion(), q.getOptions());
            questionForUser.add(qws);
        }
        return new ResponseEntity<>(questionForUser, HttpStatus.OK);
    }

    public ResponseEntity<Integer> submit(String id, List<Response> response) {
        Optional<QuizModel> quiz = quizRepo.findById(id);
        List<QuestionModel> ques = quiz.get().getQuiz();
        int result = 0;
        int i = 0;
        for (Response res : response){
            if (res.getResponse().equals(ques.get(i).getAnswer()))
                result++;
            i++;
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
