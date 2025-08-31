package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @GetMapping("/health")
    public String health() {
        return "API 서버가 정상적으로 실행 중입니다.";
    }

    @GetMapping("/info")
    public String info() {
        return "주문 시스템 API 서버 v1.0";
    }
}
