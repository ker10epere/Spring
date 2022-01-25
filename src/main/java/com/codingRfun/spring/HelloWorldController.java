package com.codingRfun.spring;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	public String letsShoutDude(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		model.addAttribute("name", name.toUpperCase());
		return "helloworld-shout";
	}
	
}
