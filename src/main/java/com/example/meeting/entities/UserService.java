package com.example.meeting.entities;



public interface UserService {
    User register(User user);
    User login(String email, String password);
}

