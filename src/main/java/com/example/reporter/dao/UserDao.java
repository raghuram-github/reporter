package com.example.reporter.dao;

import com.example.reporter.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer>{
    
}