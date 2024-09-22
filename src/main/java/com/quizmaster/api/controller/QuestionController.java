package com.quizmaster.api.controller;

import com.quizmaster.api.model.Answer;
import com.quizmaster.api.model.Question;
import com.quizmaster.api.repository.AnswerRepository;
import com.quizmaster.api.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class QuestionController {

    @Autowired
    AnswerRepository answerRepository;

    @Autowired
    QuestionRepository questionRepository;

    @GetMapping("/questions")
    public  List<Question> getQuestions() {
        return questionRepository.findAll();
    }

    @GetMapping("/question")
    public Question getQuestion(@RequestParam(value="id") int id) {
        Optional<Question> optionalQuestion = questionRepository.findById(id);
        return optionalQuestion.orElse(null);
    }

    @GetMapping("/answer")
    public Answer getAnswer(@RequestParam(value="id") int id) {
        return answerRepository.findById(id).orElse(null);
    }

    @GetMapping("/answers")
    public List<Answer> getAnswers(
            @RequestParam(value="questionId") Integer questionId, // TODO: How to make params NON-required?
            @RequestParam(value="correct") Boolean correct)
    {
        if (questionId==null && correct==null) {
            return answerRepository.findAll();
        }
        if (correct == null) {
            return answerRepository.findByQuestionId(questionId);
        }
        if (questionId == null) {
            return answerRepository.findByCorrect(correct);
        }
        return answerRepository.findByQuestionIdAndCorrect(questionId, correct);
    }

}
