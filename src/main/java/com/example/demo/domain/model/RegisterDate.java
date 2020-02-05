package com.example.demo.domain.model;

import java.time.LocalDate;

public class RegisterDate {
    private final LocalDate value;

    public RegisterDate(LocalDate value) {
        this.value = value;
    }

    public LocalDate getValue() {
        return this.value;
    }
}