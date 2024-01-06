package com.QC.demoQC.controller;

import com.QC.demoQC.model.Question;
import com.QC.demoQC.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions") // declaring path
    public  ResponseEntity<List<Question>> getAllQuestions(){
        //return "Hi, this is the test" ;
        return questionService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>>getQuestionByCategory(@PathVariable String category){ // based on path asking it will redirect
        return questionService.getAllQuestionsByCategory(category);

    }
    @PostMapping("add")
    public  ResponseEntity <String> addQuestion(@RequestBody Question question){
        questionService.addQuestion(question);
        //questionDao.save(question);
        return questionService.addQuestion(question);

    }
}
