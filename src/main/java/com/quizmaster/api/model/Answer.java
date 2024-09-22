package com.quizmaster.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record Answer(@Id long id, long questionId, String answer, boolean correct) {
}
