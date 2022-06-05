package com.example.sb_test2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SimpleController {
    @GetMapping("/add-user")
    public String sendForm(User user) {
        return "add-user";
    }
    @PostMapping("/add-user")
    public String processForm(User user) {
        return "showMessage";
    }
    @GetMapping("/new-visit")
    public String sendFormVisit(Visits visits) {
        return "new-visit";
    }
    @PostMapping("/new-visit")
    public String processFormVisit(Visits visits) {
        return "showVisits";
    }
    @GetMapping("/")
    public String sendFormHome() {
        return "showHome";
    }
}