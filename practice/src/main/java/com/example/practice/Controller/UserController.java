package com.example.practice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.Entity.User;
import com.example.practice.Service.UserService;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @GetMapping("/getUser")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/getUser/{id}")
    public User getUserById(@PathVariable("id") long id){
        return userService.getUserById(id);
    }
    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable("id") long id,@RequestBody User user){
        return userService.updateUserById(id,user);
    }
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") long id){
        return userService.deleteUserById(id);
    }


}
