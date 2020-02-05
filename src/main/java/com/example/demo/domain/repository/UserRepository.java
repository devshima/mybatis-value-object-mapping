package com.example.demo.domain.repository;

import com.example.demo.domain.model.User;
import com.example.demo.domain.model.UserId;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserRepository {
    User findById(@Param("userId") UserId userId);
}