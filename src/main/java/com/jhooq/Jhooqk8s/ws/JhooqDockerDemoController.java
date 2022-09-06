package com.jhooq.Jhooqk8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JhooqDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Wonderful | Good going";
    }
    @GetMapping("/contact")
    public String contact() {
        return "Ping me on 9481386938";
    }
}
