package com.codingRfun.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/funny")
@Controller
public class HelloWorldController {
	@GetMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@PostMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@PostMapping("/processFormShout")
	public String letsShoutDude(@RequestParam String name, Model model) {
		model.addAttribute("name", name.toUpperCase());
		return "helloworld-shout";
	}

}
