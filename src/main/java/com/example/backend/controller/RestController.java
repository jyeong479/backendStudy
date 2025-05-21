package com.example.backend.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {
    @GetMapping("/restApi")
    public String rest() {
        return "restApi/rest";
    }
}
