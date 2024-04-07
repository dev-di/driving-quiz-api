package com.quizmaster.api.model;

public record Answer(long id, long questionId, String answer, boolean correct) {
}
