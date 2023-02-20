package com.user.BasicAuth.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class HelloController {
    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from API");
    }

    @GetMapping("/otherpage")
    public ResponseEntity<String> goodBye(){
        return ResponseEntity.ok("This is the other page.");
    }

}
