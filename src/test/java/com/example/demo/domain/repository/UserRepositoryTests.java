package com.example.demo.domain.repository;

import com.example.demo.domain.model.User;
import com.example.demo.domain.model.UserId;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class UserRepositoryTests{

    @Autowired
    private UserRepository userRepository;

    @Test
    public void findByIdTest() {
        final User user = userRepository.findById(new UserId(1));
        assertThat(user.getUserId().getValue()).isEqualTo(1);
        assertThat(user.getUserName().getValue()).contains("Nocchi");
        assertThat(user.getRegisterDate().getValue()).isEqualTo("2020-02-01");
    }  
}