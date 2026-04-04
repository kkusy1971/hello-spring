package io.github.kkusylabs.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the Hello Spring Boot application.
 *
 * <p>This class bootstraps and launches the Spring Boot application.
 * The {@code @SpringBootApplication} annotation enables auto-configuration,
 * component scanning, and configuration support.</p>
 *
 * @author kkusy
 */
@SpringBootApplication
public class HelloSpringApplication {

    /**
     * Main method used to start the Spring Boot application.
     *
     * @param args command-line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
    }
}
