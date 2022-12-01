package com.myportfolio.fsg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.myportfolio.fsg.Controller"+"com.myportfolio.fsg.Dto"+"com.myportfolio.fsg.Entity"
+"com.myportfolio.fsg.Interface"+"com.myportfolio.fsg.Repository"+"com.myportfolio.fsg.Security"+"com.myportfolio.fsg.Service"})
public class FsgApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsgApplication.class, args);
	}

}
