package com.io.SBWebMVCApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String getWelcomeMsg(Model model){
        String msgtext= "Welcome to our world..";
        model.addAttribute("msg",msgtext);
        return "welcome";
    }

}
