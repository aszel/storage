package com.martin.demo.controller;

import com.martin.demo.domain.User;
import com.martin.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAll() {
        return this.userService.getAllUsers();
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable("id") Long id) {
        if (this.userService.findById(id).isPresent()) {
            return this.userService.findById(id).get();
        }
        return null;
    }
}
