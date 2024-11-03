package com.gofar.oauth2_soc_log.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecController {

    @GetMapping("/secure")
    public String securePage(Authentication authentication, Model model) {
        if (authentication != null && authentication.isAuthenticated()) {
            Object principal = authentication.getPrincipal();
            if (principal instanceof User user) {
                model.addAttribute("username", user.getUsername());
            }
            if (principal instanceof OAuth2User oAuth2User) {
                model.addAttribute("username", oAuth2User.getAttribute("name"));
            }
        }
        return "secure";
    }

}
