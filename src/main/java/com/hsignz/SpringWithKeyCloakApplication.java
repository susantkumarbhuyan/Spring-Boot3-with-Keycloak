package com.hsignz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.hsignz")
public class SpringWithKeyCloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithKeyCloakApplication.class, args);
	}

}
