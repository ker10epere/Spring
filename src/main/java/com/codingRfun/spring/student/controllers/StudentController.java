package com.codingRfun.spring.student.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingRfun.spring.student.models.Student;

@RequestMapping("/student")
@Controller
public class StudentController {
	@GetMapping("/showForm")
	public String showForm(Model student) {
		student.addAttribute("student", new Student("foo","foo@gmail.com"));
		return "student-form";
	}
	
	@PostMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		System.out.println(student);
		return "student-process-form";
	}
}
