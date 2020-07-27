package com.test.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostMassageController {

    @PostMapping("/post")
    String postMassage(Model model){
        return "home";
    }
}
