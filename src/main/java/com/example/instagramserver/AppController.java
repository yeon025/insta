package com.example.instagramserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String home() {
        return "Hi, Github Action! 수정 2 => 자동갱신?";
    }
}
