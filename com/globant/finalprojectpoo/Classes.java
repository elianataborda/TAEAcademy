package com.globant.finalprojectpoo;

import java.util.ArrayList;

public class Classes{
	private static String className;
	private static int classroom;
	private static String nameTeacher;
	private ArrayList<Student> students;

	public Classes(String className, int classroom, String nameTeacher, ArrayList<Student> students) {
		Classes.className = className;
		Classes.classroom = classroom;
		Classes.nameTeacher = nameTeacher;
		this.students = students;
	}

	public static String getClassName() {
		return className;
	}

	public static void setClassName(String className) {
		Classes.className = className;
	}

	public static int getClassroom() {
		return classroom;
	}

	public static void setClassroom(int classroom) {
		Classes.classroom = classroom;
	}

	public static String getNameTeacher() {
		return nameTeacher;
	}

	public static void setNameTeacher(String nameTeacher) {
		Classes.nameTeacher = nameTeacher;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return className + ", " + classroom + ", " +nameTeacher;
	}
	
	

}
