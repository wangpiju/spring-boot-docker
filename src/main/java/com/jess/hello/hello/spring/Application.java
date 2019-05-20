package com.jess.hello.hello.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("forward:/hello");
	}
	@RequestMapping("/hello")
	public String hello(){
		return "Hello Spring";
	}
}
