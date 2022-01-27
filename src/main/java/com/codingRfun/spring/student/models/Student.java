package com.codingRfun.spring.student.models;

import com.codingRfun.spring.student.models.enums.Country;

public class Student {
	private String firstName;
	private String lastName;
	private Country country;

	public Student() {
		super();
	}

	public Student(String firstName, String lastName, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = Country.findCountry(country);
	}

	public Student(String firstName, String lastName, Country country) {
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
		return String.format("Student [firstName=%s, lastName=%s, country=%s]", firstName, lastName, country);
	}

}
