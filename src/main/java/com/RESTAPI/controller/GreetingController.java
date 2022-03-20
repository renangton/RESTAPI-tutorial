package com.RESTAPI.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.RESTAPI.service.GreetingService;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
//	AtomicLong:Long型を持っているWrappingクラス
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public GreetingService greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new GreetingService(counter.incrementAndGet(), String.format(template, name));
	}
}
