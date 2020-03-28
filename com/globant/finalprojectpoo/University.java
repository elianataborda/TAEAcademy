package com.globant.finalprojectpoo;

import java.util.ArrayList;

public class University {
	private ArrayList<FullTime> teacherfts;
	private ArrayList<PartTime> teacherpts;
	private ArrayList<Student> students;
	private ArrayList<Classes> classes;
	

	public University(ArrayList<FullTime> teacherfts, ArrayList<PartTime> teacherpts, ArrayList<Student> students, ArrayList<Classes> classes) {
		// TODO Auto-generated constructor stub
		this.teacherfts = teacherfts;
		this.teacherpts =teacherpts;
		this.students = students;
		this.classes = classes;
	}


	public ArrayList<FullTime> getTeachers() {
		return teacherfts;
	}


	public void setTeachers(ArrayList<FullTime> teacherfts) {
		this.teacherfts = teacherfts;
	}


	public ArrayList<Student> getStudents() {
		return students;
	}


	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}


	public ArrayList<Classes> getClasses() {
		return classes;
	}


	public void setClasses(ArrayList<Classes> classes) {
		this.classes = classes;
	}


	public ArrayList<PartTime> getTeacherpts() {
		return teacherpts;
	}


	public void setTeacherpts(ArrayList<PartTime> teacherpts) {
		this.teacherpts = teacherpts;
	}

}
