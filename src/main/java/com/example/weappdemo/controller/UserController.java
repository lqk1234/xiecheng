package com.example.weappdemo.controller;

import com.example.weappdemo.bean.User;
import com.example.weappdemo.commer.ResponseData;
import com.example.weappdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author lqk
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/saveUser")
    public ResponseData saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

}
