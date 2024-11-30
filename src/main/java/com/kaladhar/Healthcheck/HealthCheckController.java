package com.kaladhar.Healthcheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/api/health/ping")
    public String ping() {
        return "pong";
    }
}
