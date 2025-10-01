package com.example.hello_api;

import java.time.ZonedDateTime;


public class HelloResponse {

    // 1. private final 필드 선언
    // 외부에서 직접 접근할 수 없도록 private으로, 값이 변경되지 않도록 final로 선언합니다.
    private final ZonedDateTime koreaTime;
    private final long timestamp;
    private final String message;

    // 2. 생성자 (Constructor)
    // 객체가 생성될 때 모든 필드의 값을 초기화합니다.
    public HelloResponse(ZonedDateTime koreaTime, long timestamp, String message) {
        this.koreaTime = koreaTime;
        this.timestamp = timestamp;
        this.message = message;
    }

    // 3. Getter 메서드
    // private 필드의 값을 외부에서 읽을 수 있도록 public 메서드를 제공
    // Spring(내부적으로 Jackson 라이브러리)이 이 메서드들을 호출하여 JSON을 만든다.
    public ZonedDateTime getKoreaTime() {
        return koreaTime;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }
}
