package com.example.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public ResponseEntity<?> helloGet() {
        return ResponseEntity.ok("Hello world");
    }

    @PostMapping
    public ResponseEntity<?> helloPost(@RequestParam String message) {
        return ResponseEntity.ok("message: " + message);
    }
}
