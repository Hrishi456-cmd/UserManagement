package com.geekster.UserManagement.controller;

import com.geekster.UserManagement.model.User;
import com.geekster.UserManagement.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    //read
    @GetMapping("users")
    List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    //create

    @PostMapping("users")
    String addUsers(@RequestBody List<User> users)
    {
        return userService.createUsers(users);
    }

    @PostMapping("user")
    String addUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }

    @GetMapping("users/{userId}")
    User findUserById(@PathVariable Integer userId)
    {
        return userService.getUserById(userId);
    }


}
