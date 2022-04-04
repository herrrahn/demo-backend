package com.rafaelrahn.demobackend.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/demo")
public class Controller {

    @GetMapping
    public String test() {
        return "demo working";
    }
}
