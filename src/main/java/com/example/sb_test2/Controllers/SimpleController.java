package com.example.sb_test2.Controllers;

import com.example.sb_test2.Model.User;
import com.example.sb_test2.Model.Visits;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SimpleController {
    @GetMapping("/add-user")
    public String sendForm(User user) {
        User.users.add(user);
        if(User.users.contains(user)) {
            return "showUser";
        }
        return "add-user";
    }
    @PostMapping("/add-user")
    public String processForm(User user) {
        return "showUser";
    }
    @GetMapping("/new-visit")
    public String sendFormVisit(Visits visits, User users) {
        Visits.visits.add(visits);
        if(Visits.visits.contains(visits)) {
            return "showVisits";
        }
        return "new-visit";
    }
    @PostMapping("/new-visit")
    public String processFormVisit(Visits visits, User users) {
        return "showVisits";
    }
    @GetMapping("/")
    public String sendFormHome(Visits visits, User users) {
        return "showHome";
    }
    @RequestMapping(value="/new-visit")
    public String createVisitForUser(Visits visits, User user) {
        return "new-visit";
    }
}