package com.example.securing_web;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.BDDAssertions.then;

@SpringBootTest
class SecuringWebApplicationTests {

	@Test
	void contextLoads(ApplicationContext context) {
		then(context).isNotNull();
	}

}
