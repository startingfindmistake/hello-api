package com.example.hello_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse getHello() {
        // 요청하신 특정 시간으로 ZonedDateTime 객체를 생성합니다.
        ZonedDateTime fixedSeoulTime = ZonedDateTime.parse("2025-09-30T15:58:50.972057829+09:00[Asia/Seoul]");

        // 응답 객체를 생성하여 반환합니다.
        return new HelloResponse(
            fixedSeoulTime,
            1759215530972L, 
            "Hello, World!"
        );
    }
}