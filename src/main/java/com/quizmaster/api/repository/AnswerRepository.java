package com.quizmaster.api.repository;

import com.quizmaster.api.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

    List<Answer> findByQuestionId(int questionId);
    List<Answer> findByCorrect(boolean correct);
    List<Answer> findByQuestionIdAndCorrect(int questionId, boolean correct);

}
