package com.codingRfun.spring.student.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingRfun.spring.student.models.Student;
import com.codingRfun.spring.student.models.enums.Country;

@RequestMapping("/student")
@Controller
public class StudentController {
	@GetMapping("/showForm")
	public String showForm(Model model) {
		final Map<String, String> country = new HashMap<String, String>() {
			{
				put(Country.Korea.name(), Country.Korea.name());
				put(Country.UnitedStatesOfAmerica.name(), Country.UnitedStatesOfAmerica.name());
				put(Country.Japan.name(), Country.Japan.name());
				put(Country.Philippines.name(), Country.Philippines.name());
			}
		};
		model.addAttribute("student", new Student("foo", "foo@gmail.com", Country.Philippines));
		model.addAttribute("country", country);
		return "student-form";
	}

	@PostMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		System.out.println(student);
		return "student-process-form";
	}
}
