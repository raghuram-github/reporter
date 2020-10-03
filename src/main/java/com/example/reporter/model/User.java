package com.example.reporter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userid")
    private int userid;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;

    public int getUserId() {
        return userid;
    }

    public String getUserName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUserId(final int userId) {
        this.userid = userId;
    }

    public void setUserName(final String userName) {
        this.username = userName;
    }

    public void setPassword(final String password) {
        this.password = password;
    }
    
    
}