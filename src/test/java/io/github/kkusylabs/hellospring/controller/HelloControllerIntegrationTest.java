package io.github.kkusylabs.hellospring.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


/**
 * Integration test for {@link HelloController}.
 *
 * <p>This test starts the full Spring application context and verifies
 * that the /hello endpoint returns the expected response.</p>
 */
@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Verifies that GET /hello returns "Hello, World!".
     *
     * @throws Exception if the request fails
     */
    @Test
    void shouldReturnHelloWorld() throws Exception {
        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, World!"));
    }
}
