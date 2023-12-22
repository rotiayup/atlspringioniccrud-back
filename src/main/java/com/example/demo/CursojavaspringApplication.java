package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CursojavaspringApplication {

	private static final Logger loggerX = LoggerFactory.getLogger(CursojavaspringApplication.class);

	public static void main(String[] args) {

		//loggerX.debug("Starting application: Aitorrrrr debug");
		//loggerX.info("Starting application: Aitorrrrr info");
System.out.println("Starting application: Systemooutprintln:Aitorrrrr");

		SpringApplication.run(CursojavaspringApplication.class, args);
	}

	@Bean
	public Logger loggerXX() {
		return loggerX;
	}
}
