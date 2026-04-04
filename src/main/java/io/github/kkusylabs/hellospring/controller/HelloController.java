package io.github.kkusylabs.hellospring.controller;

import io.github.kkusylabs.hellospring.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller that exposes a simple hello endpoint.
 *
 * <p>This controller handles HTTP requests to the <code>/hello</code> path
 * and returns a greeting message provided by {@link GreetingService}.</p>
 *
 * @author kkusy
 */
@RestController
public class HelloController {
    private final GreetingService greetingService;

    /**
     * Constructs a new {@code HelloController} with the given {@link GreetingService}.
     *
     * @param greetingService the service used to generate greeting messages
     */
    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    /**
     * Handles HTTP GET requests to <code>/hello</code>.
     *
     * @return a greeting message (e.g., "Hello, World!")
     */
    @GetMapping("/hello")
    public String sayHello() {
        return greetingService.getGreeting();
    }
}
