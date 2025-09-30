package com.example.hello_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse getHello() {
        // ZonedDateTime을 사용하여 서울 시간대의 현재 시간을 가져옵니다.
        ZonedDateTime seoulTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

        // 응답 객체를 생성하여 반환합니다.
        // Spring Boot가 자동으로 이 객체를 JSON으로 변환해줍니다.
        return new HelloResponse(
            seoulTime,
            System.currentTimeMillis(), // 현재 시간을 Unix 타임스탬프(밀리초)로 가져옵니다.
            "Hello, World!"
        );
    }
}