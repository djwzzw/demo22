package com.example.demo2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {

    @PostMapping("/helloword")
    public String helloWorld(){
        String s = "hello world";
        System.out.println("jinlaile ");
        return s;
    }
}
