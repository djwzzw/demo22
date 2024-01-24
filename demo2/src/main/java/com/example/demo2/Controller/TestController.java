package com.example.demo2.Controller;

import com.example.demo2.entity.PushEvent;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class TestController {

    @PostMapping("/helloword")
    public ResponseEntity<String> helloWorld( @RequestHeader("X-GitHub-Event") String eventType,
                                              @RequestBody PushEvent pushEvent){

        // 处理 Webhook 事件的逻辑
        // 提取有关 PR 的信息
        if (pushEvent.getCommits() != null && !pushEvent.getCommits().isEmpty()) {
            pushEvent.getCommits().forEach(commit -> {
                System.out.println("Authors: " + commit.getAuthor().getName());
                System.out.println("Comment: " + commit.getMessage());
                System.out.println("Files changed:");
                commit.getAdded().forEach(file -> System.out.println("- Added: " + file));
                commit.getModified().forEach(file -> System.out.println("- Modified: " + file));
                commit.getRemoved().forEach(file -> System.out.println("- Removed: " + file));
            });
        } else {
            System.out.println("No commits in push event.");
        }

        // 返回 JSON 响应
        String jsonResponse = "{\"status\":\"Accepted\",\"message\":\"Webhook event successfully received.\"}";
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(jsonResponse);
    }
}
