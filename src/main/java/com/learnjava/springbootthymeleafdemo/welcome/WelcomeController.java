package com.learnjava.springbootthymeleafdemo.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/")
	public String showHome() {
		return "home";
	}

}
