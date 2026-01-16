package com.example.task1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello from Task 1 (Spring MVC)!";
    }

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("title", "Task 1 - Greeting Page");
        model.addAttribute("message", "This page is rendered by Thymeleaf.");
        return "greeting";
    }
}
