package com.codingRfun.spring.student.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.codingRfun.spring.student.models.enums.Country;

public class Student {
	private String firstName;
	@NotNull(message = "lastname is required")
	@Size(min = 3, message = "size must be above 3 characters")
	private String lastName;
	private Integer age;
	private Country country;

	public Student() {
		super();
	}

	public Student(String firstName, String lastName, Integer age, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.country = Country.findCountry(country);
	}

	public Student(String firstName, String lastName, Integer age, Country country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void setCountry(String country) {
		this.country = Country.findCountry(country);
	}

	@Override
	public String toString() {
		return String.format("Student [firstName=%s, lastName=%s, age=%s, country=%s]", firstName, lastName, age,
				country);
	}

}
