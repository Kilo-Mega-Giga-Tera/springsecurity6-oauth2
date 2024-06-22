package com.app.securityoauth2.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String MainPage(OAuth2AuthenticationToken token) {
        System.out.println("token -> " + token.getPrincipal());
        return "index.html";
    }

}
