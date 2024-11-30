package com.kaladhar.Healthcheck;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HealthCheckUIController {

    @GetMapping("/health-check")
    public String healthCheckPage() {
        return "health-check"; // Refers to health-check.html in resources/templates/
    }
}
