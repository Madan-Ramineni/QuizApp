package com.telusko.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.telusko.service", "com.telusko.controller"})
@EntityScan("com.telusko.model")
@EnableJpaRepositories("com.telusko.dao")
public class RetrieveQuestionsApplication extends SpringBootServletInitializer  {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RetrieveQuestionsApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(RetrieveQuestionsApplication.class, args);
	}
}
