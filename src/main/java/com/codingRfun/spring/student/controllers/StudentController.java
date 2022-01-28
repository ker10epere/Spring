package com.codingRfun.spring.student.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingRfun.spring.student.models.Student;
import com.codingRfun.spring.student.models.enums.Country;

@SuppressWarnings("serial")
@RequestMapping("/student")
@Controller
public class StudentController {
	// when argument doesn't provided, it will target all (command/form attributes
	// and/or request parameters)
	@InitBinder("student")
	public void initBinder(WebDataBinder databinder) {
		System.out.println("\n\n");
		System.out.println("getObjectName: \n" + databinder.getObjectName()); // attribute name = student
		System.out.println("getTarget: \n" + databinder.getTarget()); // Student [firstName=foo, lastName=foo@gmail.com,
																	// country=Philippines]
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

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
		model.addAttribute("student", new Student("foo", "foo@gmail.com", 18, Country.Philippines));
		model.addAttribute("country", country);
		return "student-form";
	}

	@PostMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
		System.out.println("\n\n");
		System.out.println("Binding Result: \n" + bindingResult);
		if (bindingResult.hasErrors()) {
			return "student-form";
		}

		System.out.println("\n\nprocess form: " + student);
		return "student-process-form";
	}
}
