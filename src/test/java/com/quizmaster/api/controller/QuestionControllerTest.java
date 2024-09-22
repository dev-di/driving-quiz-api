package com.quizmaster.api.controller;

import com.quizmaster.api.model.Question;
import com.quizmaster.api.repository.QuestionRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class QuestionRepositoryTest {

    @Autowired
    QuestionRepository repository;

    @Test
    void testFindById() {
        Optional<Question> optionalQuestion = repository.findById(3);
        assertTrue(optionalQuestion.isPresent());
        assertEquals(3, optionalQuestion.get().getId());
        assertEquals("Hur många personer omkommer årligen i trafiken i Sverige?", optionalQuestion.get().getQuestion());
    }

}