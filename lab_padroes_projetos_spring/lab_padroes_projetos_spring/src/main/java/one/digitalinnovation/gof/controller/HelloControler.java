package one.digitalinnovation.gof.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
	@GetMapping("/hello")
    public String hello() {
        return "Hello, Swagger com Spring Boot 3 🚀";
    }

}
