package com.myportfolio.fsg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class FsgApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsgApplication.class, args);
	}

}
