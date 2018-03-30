package com.jeya.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello") // by default it specify get request: post, delete and put are needed to be specified explicitly
	public String sayHi()
	{
		return "Hi";
	}
}