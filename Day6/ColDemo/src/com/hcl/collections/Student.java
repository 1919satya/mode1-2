package com.hcl.collections;

public class Student {
	String firstName;
	String lastName;
	String City;
	Double cgp;
	public Student(String firstName, String lastName, String city, Double cgp) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.City = city;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", City=" + City + ", cgp=" + cgp + "]";
	}
	
	}

