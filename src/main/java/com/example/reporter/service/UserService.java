package com.example.reporter.service;

import java.util.Optional;

import com.example.reporter.dao.UserDao;
import com.example.reporter.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userdao;

    public Iterable<User> getAllUsers() {
        return userdao.findAll();
    }

    public Optional<User> getUserById(int userid) {
        return userdao.findById(userid);
    }

    public User registerUser(User newuser) {
        userdao.save(newuser);
        return newuser;
    }

    public Optional<User> deleteUser(int userid) {
        Optional<User> user = userdao.findById(userid);
        userdao.deleteById(userid);
        return user;
    }
    
}