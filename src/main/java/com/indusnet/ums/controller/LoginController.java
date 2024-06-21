package com.indusnet.ums.controller;


import com.indusnet.ums.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        
        // Handle login logic here
        return "login";
    }

    @GetMapping("/logout")
    public String dashboard() {
        // Handle dashboard logic here
        return "LogOut";
    }
}

