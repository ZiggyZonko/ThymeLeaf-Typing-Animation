package org.example.thymeleaftrail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {


    @GetMapping({"/","home"})
    public String getIndex(Model model) {
        model.addAttribute("name", "Ziggy");
        return "index";

    }

}
