package com.example.demo2.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {

    @PostMapping("/helloword")
    public ResponseEntity<String> helloWorld(String payload){
        // 处理 Webhook 事件的逻辑
        System.out.println("Received Webhook event:\n" + payload);

        // 返回 JSON 响应
        String jsonResponse = "{\"status\":\"Accepted\",\"message\":\"Webhook event successfully received.\"}";
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(jsonResponse);
    }
}
