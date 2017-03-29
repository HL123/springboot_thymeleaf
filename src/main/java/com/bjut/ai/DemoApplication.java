package com.bjut.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class DemoApplication {
//
//	@RequestMapping("/")
//	String home() {
//		return "Hello World!";
//	}

	@RequestMapping("/")
	public String hello(Model model){
		return "hello";
	}

//	@RequestMapping("/")
//	public String hello() {
//		return "hello";
//	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
