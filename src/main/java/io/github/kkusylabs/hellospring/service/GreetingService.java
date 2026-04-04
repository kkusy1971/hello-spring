package io.github.kkusylabs.hellospring.service;

import org.springframework.stereotype.Service;

/**
 * Service responsible for providing greeting messages.
 *
 * <p>This class contains the business logic for generating greetings.
 * It is used by controllers to return responses to HTTP requests.</p>
 *
 * @author kkusy
 */
@Service
public class GreetingService {


    /**
     * Returns a greeting message.
     *
     * @return a greeting string (e.g., "Hello, World!")
     */
    public String getGreeting() {
        return "Hello, World!";
    }
}