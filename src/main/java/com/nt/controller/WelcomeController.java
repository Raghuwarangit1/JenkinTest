package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class WelcomeController {
@GetMapping
	public String welocme() {
	return "welcome to java ";
}
}
