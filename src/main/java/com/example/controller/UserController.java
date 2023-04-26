package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {
    @GetMapping("/user-hello")
    public String sayHello() {
        log.info("hello zhudp");
        return "hello zhudp";
    }
}

