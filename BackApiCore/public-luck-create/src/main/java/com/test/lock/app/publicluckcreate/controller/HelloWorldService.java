package com.test.lock.app.publicluckcreate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldService {
	
    @GetMapping("/holamundo")
    String hellow(){
        return "Hello World!";
    }

}
