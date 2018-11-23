package com.yulu.wang.controller;

import com.yulu.wang.entity.User;
import com.yulu.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yulu on 2018/11/23.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUserById")
    public User showUserInfo(@RequestParam(value = "id", required = true) Long id) {
        User user = userService.getUserById(id);
        return user;
    }
}
