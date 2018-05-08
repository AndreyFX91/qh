package com.akfx.qh.web.controller.rest;

import com.akfx.qh.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private final RegistrationService registrationService;

    @Autowired
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/register-new-user")
    public String handleNewUserRegistrationRequest(@RequestParam("login") String login, @RequestParam("password")
            String password, Model model) {
        registrationService.registerNewUser(login, password);
        return "registered";
    }
}
