package com.example.restapi;

import java.util.Map;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.ZonedDateTime; // ⬅️ 추가! 시간대별 날짜/시간 정보를 가져오기 위해 필요해요.
import java.time.ZoneId;       // ⬅️ 추가! 시간대 정보를 지정하기 위해 필요해요.

@RestController
public class SimpleController {

    @GetMapping("/hello")
    public Map<String, Object> sayHello() { // ⬅️ 반환 타입을 Map<String, Object>로 수정!
        return Map.of(
                "message", "Hello World!",
                "timestamp", ZonedDateTime.now().toString(),
                "koreatime", ZonedDateTime.now(ZoneId.of("Asia/Seoul")).toString()
        );
    }
}
