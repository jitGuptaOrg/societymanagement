package com.society.mangement.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SocietyController {

	@RequestMapping("/hello")
	public String getHello() {

		return "I am in society controller";
	}

}
