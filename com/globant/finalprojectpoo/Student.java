package com.globant.finalprojectpoo;

public class Student{
	private String nameStudent;
	private int id;
	private int age;

	public Student(String namestudent, int id, int age) {
		this.setNameStudent(namestudent);
		this.id = id;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNameStudent() {
		return nameStudent;
	}

	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	@Override
	public String toString() {
		return  nameStudent + ", " + id + ", " + age ;
	}
	
	
	

}
