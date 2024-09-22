package com.quizmaster.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record Question(@Id long id, String question) {
}
