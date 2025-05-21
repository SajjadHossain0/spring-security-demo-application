package com.example.rolebasedapp.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/default")
    public String redirectAfterLogin(Authentication authentication) {
        String role = authentication.getAuthorities().iterator().next().getAuthority();

        if (role.equals("ROLE_ADMIN")) {
            return "redirect:/admin";
        } else if (role.equals("ROLE_USER")) {
            return "redirect:/user";
        }
        return "redirect:/error";
    }
    @GetMapping("/user")
    public String userPage() {
        return "user";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "admin";
    }
    @GetMapping("/error")
    public String errorPage() {
        return "error";
    }
}
