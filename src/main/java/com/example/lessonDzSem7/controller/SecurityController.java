package com.example.lessonDzSem7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/")
    public String home(){
        return "home";
    }


    @GetMapping("/public-data")
    public String userPage(){
        return "public_page";
    }

    @GetMapping("/private-data")
    public String adminPage(){
        return "private_page";
    }


    @GetMapping("/access-denied")
    public String accessDenied(){
        return "access-denied";
    }


    @GetMapping("/login")
    public String auth(){
        return "login-page";
    }
}
