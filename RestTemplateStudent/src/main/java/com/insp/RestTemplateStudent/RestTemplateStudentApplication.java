package com.insp.RestTemplateStudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestTemplateStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestTemplateStudentApplication.class, args);
	}

	@Bean
	public RestTemplate m1(){
		return  new RestTemplate();
	}
}
