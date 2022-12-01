package com.myportfolio.fsg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.myportfolio.fsg.Controller"})
public class FsgApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsgApplication.class, args);
	}

}
