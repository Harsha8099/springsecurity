package com.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/")
	public String welcome() {
		System.out.println("From Main Controller");
		return "Welcome Harsha!!!";
	}
}
