package com.jp.azure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/")
@Slf4j
public class GreetingController {

	@GetMapping
	public String hello() {
		log.info("---------------hello------------------");
		return "hello";
	}
	
	@GetMapping("api/hello/{name}")
	public String greet(@PathVariable String name) {
		log.info("---------------greeting------------------");
		return "hello"+name;
	}
}
