package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ui")
public class ExampleController {

	@GetMapping("/secured/hello")
	public String secured() {
		return "Hello (secured)";
	}
	@GetMapping("/open/hello")
	public String open() {
		return "Hello (open)";
	}
	
}
