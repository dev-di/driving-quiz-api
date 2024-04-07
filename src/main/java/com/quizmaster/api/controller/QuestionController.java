package com.quizmaster.api.controller;

import com.quizmaster.api.model.Answer;
import com.quizmaster.api.model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// TODO: Do not hard code questions and answers
@RestController
public class QuestionController {

    @GetMapping("/api/question")
    public Question getQuestion() {
        return new Question(1,"Hur långt syns en mörkklädd person i halvljus?");
    }

    @GetMapping("/api/answer")
    public List<Answer> getAnswer(@RequestParam(value="id") long id) {
        return Arrays.asList(
                new Answer(1, 1,"20 - 30 meter", true),
                new Answer(2, 1,"50 - 60 meter", false),
                new Answer(2, 1,"60 - 70 meter", false)
        );
    }

    private void initiateQuestions() {
        List<Question> questions = new LinkedList<>();
        List<Answer> answers   = new LinkedList<>();

        questions.add(new Question(1,"Hur långt syns en mörkklädd person i halvljus?"));
        answers.add(new Answer(1, 1,"20 - 30 meter", true));
        answers.add(new Answer(2, 1,"50 - 60 meter", false));
        answers.add(new Answer(3, 1,"60 - 70 meter", false));

        questions.add(new Question(2,"Hur många viltolyckor sker det per år?"));
        answers.add(new Answer(4, 2,"60 000", true));
        answers.add(new Answer(5, 2,"100 000", false));
        answers.add(new Answer(6, 2,"150 000", false));

        questions.add(new Question(3,"Hur många personer omkommer årligen i trafiken i Sverige?"));
        answers.add(new Answer(7, 3,"Ca 100 personer", true));
        answers.add(new Answer(8, 3,"Ca 200 personer", false));
        answers.add(new Answer(9, 3,"Ca 300 personer", false));
        answers.add(new Answer(10, 3,"Ca 400 personer", false));

    }

}
