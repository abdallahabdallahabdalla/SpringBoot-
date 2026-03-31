package com.example.FirstProject.Controller; 

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

// Note: You will need to import your User class here once you create it!
// import com.example.FirstProject.Model.User; 

@Controller
public class UserController {

    // Show form
    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    // Handle form submission
    @PostMapping("/register")
    public String submitForm(@ModelAttribute User user, Model model) {
        // Here you could save to DB, etc.
        model.addAttribute("message", "User registered successfully!");
        return "result";
    }
}