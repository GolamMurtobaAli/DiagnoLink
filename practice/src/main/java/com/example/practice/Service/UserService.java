package com.example.practice.Service;

import java.util.List;

import com.example.practice.Entity.User;

public interface UserService {
    User getUserById(long id);
    User createUser(User user);
    List<User> getAllUsers();
    User updateUserById(Long id, User user);
    String deleteUserById(Long id);
    User updateUserById(long id, User user);
    String deleteUserById(long id);


}

