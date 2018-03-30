package com.jeya.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // it tells spring boot this is the starting point of
						// application
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args); // it will create a servlet container and deploy this application to that.
	}
}