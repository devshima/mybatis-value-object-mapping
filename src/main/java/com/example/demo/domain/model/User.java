package com.example.demo.domain.model;

import lombok.Data;

@Data
public class User {
    private UserId userId;
    private UserName userName;
    private RegisterDate registerDate;
}