package com.example.reporter.api;

import java.util.Optional;

import com.example.reporter.service.UserService;
import com.example.reporter.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")

public class UserController {
    
    @Autowired
    private UserService userservice;

    @GetMapping(path ="/listall")
    public Iterable<User> getAllUsers() {
        return userservice.getAllUsers();
    }

    @PostMapping(path = "/registeruser")
    public User registerUser(@RequestBody User newuser) {
        return userservice.registerUser(newuser);
    }

    @GetMapping(path = "/getuser/{userid}")
    public Optional<User> getUser(@PathVariable Integer userid){
        return userservice.getUserById(userid);
    }

    @DeleteMapping(path = "/deleteuser/{userid}")
    public Optional<User> deleteuser(@PathVariable Integer userid){
        return userservice.deleteUser(userid);
    }

    @PostMapping(path = "/updateuser/{userid}")
    public ResponseEntity<Object> updateUser(@RequestBody User updateduser, @PathVariable Integer userid) {
        Optional<User> user= userservice.getUserById(userid);
        if(!user.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        
        updateduser.setUserId(userid);
        userservice.registerUser(updateduser);

        return ResponseEntity.noContent().build();
    }
    
}