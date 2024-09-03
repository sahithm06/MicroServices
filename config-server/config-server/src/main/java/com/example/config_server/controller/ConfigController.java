package com.example.config_server.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @GetMapping("/controller")
    public String getMessage(){
        return "Hi, this is config Controller";
    }
}
