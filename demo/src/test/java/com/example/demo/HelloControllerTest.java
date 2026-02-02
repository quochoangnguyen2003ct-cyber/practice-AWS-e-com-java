package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class HelloControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void testHelloEndpoint() throws Exception {
		mockMvc.perform(get("/api/"))
			.andExpect(status().isOk())
			.andExpect(content().string("Spring Boot is running!"));

		mockMvc.perform(get("/api/hello"))
			.andExpect(status().isOk())
			.andExpect(content().string("Hello CI/CD"));
	}

}