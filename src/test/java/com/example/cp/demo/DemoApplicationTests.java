package com.example.cp.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	private String name = "Test";

	@Test
	void contextLoads() {
		System.out.println("Este es: "+ name);
	}

}
