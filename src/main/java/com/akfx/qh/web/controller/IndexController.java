package com.akfx.qh.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String handleIndex(Model model) {
        return "indexpage";
    }

    @GetMapping("/login")
    public String handleLogin(Model model) {
        return "loginpage";
    }

    @GetMapping("/register")
    public String handleRegister(Model model) {
        return "registerpage";
    }
}
