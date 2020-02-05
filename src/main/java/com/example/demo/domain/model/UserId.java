package com.example.demo.domain.model;

public class UserId {
    private final int value;

    public UserId() {
        this.value = 0;
    }

    public UserId(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}