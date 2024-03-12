package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("file:C:/Temp/application.properties")
//@PropertySource("file:/var/www/springioniccrud/application.properties")
@PropertySource("file:${JAVA_APPL_PROPS_FOLDER}/springioniccrud/application.properties")
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
