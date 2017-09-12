package com.cf.env;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClient {

	@Value("${user.role}")
	private String role;
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigClient.class, args);
	}
	
	
	public String whoami(@PathVariable("username") String username){
		return String.format("Hello You're %s and you'll become a(n) %s...\n", username, role  );
	}
}
