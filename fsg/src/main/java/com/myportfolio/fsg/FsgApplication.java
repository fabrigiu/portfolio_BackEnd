package com.myportfolio.fsg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.myportfolio.fsg.Controller"+"com.myportfolio.fsg.Dto"+"com.myportfolio.fsg.Entity"
+"com.myportfolio.fsg.Interface"+"com.myportfolio.fsg.Repository"+"com.myportfolio.fsg.Security"
        +"com.myportfolio.fsg.Security.Controller"+"com.myportfolio.fsg.Security.Dto"+"com.myportfolio.fsg.Security.Entity"
        +"com.myportfolio.fsg.Security.Enums"+"com.myportfolio.fsg.Security.Repository"+"com.myportfolio.fsg.Security.Service"
        +"com.myportfolio.fsg.Security.jwt"+"com.myportfolio.fsg.Service"})
public class FsgApplication {

	public static void main(String[] args) {
		SpringApplication.run(FsgApplication.class, args);
	}

}
