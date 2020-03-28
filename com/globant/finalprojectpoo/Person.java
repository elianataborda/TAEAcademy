package com.globant.finalprojectpoo;

public class Person {
	private static String name;
	
	public Person(String name) {
		Person.name = name;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		Person.name = name;
	}

}
