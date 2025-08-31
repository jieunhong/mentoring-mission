package org.example.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "test API")
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
