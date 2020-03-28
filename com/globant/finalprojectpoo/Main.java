package com.globant.finalprojectpoo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static ArrayList<Student> students = new ArrayList<Student>();
	public static ArrayList<FullTime> teachersft;
	public static ArrayList<PartTime> teacherspt;
	public static ArrayList<Classes> classes;
	private static ArrayList<Student> classroom1;
	private static ArrayList<Student> classroom2;
	private static ArrayList<Student> classroom3;
	private static ArrayList<Student> classroom4;
	private static ArrayList<Student> classroom5;
	static ArrayList<ArrayList<Student>> classRooms = new ArrayList<>();
	private static Classes class1;
	private static Classes class2;
	private static Classes class3;
	private static Classes class4;
	private static Classes class5;
	public static University university;
	
	public static void initialize() {
		//init Objects
		
		//Init teachers
				FullTime teacher1 = new FullTime("Eugenio Duval", 55000, 4);
				FullTime teacher2 = new FullTime("Pedro Pascal", 60000, 5);
				teachersft.add(teacher1);
				teachersft.add(teacher2);
				PartTime teacher3 = new PartTime("Diego Rivera", 35000, 24);
				PartTime teacher4 = new PartTime("Dora Cadavid", 30000, 18);
				teacherspt.add(teacher3);
				teacherspt.add(teacher4);
				
				//init students
				Student student1 = new Student("Ricardo Ray", 1, 18);
				Student student2 = new Student("Celia Cruz", 2, 20);
				Student student3 = new Student("Roberto Cruz", 3, 19);
				Student student4 = new Student("Ruben Blades", 4, 17);
				Student student5 = new Student("Willie Colon", 5, 18);
				Student student6 = new Student("Hector Lavoe", 6, 19);
				Student student7 = new Student("Jaime Sabater", 7, 20);
				Student student8 = new Student("Ismael Miranda", 8, 21);
				Student student9 = new Student("Roberto Roena", 9, 17);
				Student student10 = new Student("Celina Reutilio", 10, 18);
				
				students.add(student1);
				students.add(student2);
				students.add(student3);
				students.add(student4);
				students.add(student5);
				students.add(student6);
				students.add(student7);
				students.add(student8);
				students.add(student9);
				students.add(student10);
				
				//init classes
				classroom1.add(student1);
				classroom1.add(student2);
				classroom1.add(student3);
				classroom1.add(student4);
				classroom1.add(student5);
				
				classroom2.add(student6);
				classroom2.add(student7);
				classroom2.add(student8);
				classroom2.add(student9);
				classroom2.add(student10);
				
				classroom3.add(student1);
				classroom3.add(student3);
				classroom3.add(student5);
				classroom3.add(student7);
				classroom3.add(student9);
				
				classroom4.add(student2);
				classroom4.add(student4);
				classroom4.add(student6);
				classroom4.add(student8);
				classroom4.add(student10);
				
				classroom5.add(student1);
				classroom5.add(student10);
				classroom5.add(student3);
				classroom5.add(student8);
				classroom5.add(student5);
				
				classRooms.add(classroom1);
				classRooms.add(classroom2);
				classRooms.add(classroom3);
				classRooms.add(classroom4);
				classRooms.add(classroom5);
				
				class1 = new Classes("Mathemathics", 401, teacher1.getName(), classroom1);
				class2 = new Classes("Art History", 302, teacher2.getName(), classroom2);
				class3 = new Classes("English", 101, teacher3.getName(), classroom3);
				class4 = new Classes("Spanish", 203, teacher4.getName(), classroom4);
				class5 = new Classes("Ancient Greek", 404, teacher2.getName(), classroom5);
				
				classes.add(class1);
				classes.add(class2);
				classes.add(class3);
				classes.add(class4);
				classes.add(class5);
				
				//init university
				university = new University(teachersft, teacherspt, students, classes);				
		
	}
		
		
	public static void printTeachers() {
		
		System.out.println("Full Time Teachers: ");
		for (int i = 0; i < teachersft.size(); i++) {
			System.out.println(teachersft.get(i).toString());
		}
		System.out.println("Part Time Teachers");
		for (int i = 0; i < teacherspt.size(); i++) {
			System.out.println(teacherspt.get(i).toString());
		}
		
	}
	
	public static void printClasses() {
		for (int i = 0; i < classes.size(); i++) {
			System.out.println((i+1)+". "+classes.get(i));
		}
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
	    boolean exit1 = false;
		int ind1=0, opc1=0;
		
		while(!exit1){
        	 System.out.println("Do you wish to review the students list? ");
             System.out.println("1. Yes ");
             System.out.println("2. No ");
             System.out.println("Pick a Number: ");
             opc1=sc.nextInt();
             try {
            	 switch(opc1){
                 	case 1:
                 		System.out.println("Write the class ID you want to review: ");
                 		ind1=sc2.nextInt();
                 		System.out.println(classes.get(ind1-1).getStudents());
                 		
                 		break;
                 	case 2:
                 		exit1 = true;
                 		break;
                
                 	default:
                 		System.out.println("Invalid Option");

            	 }
             } catch (InputMismatchException e) {
                 System.out.println("You have to enter a number!");
                 sc.next();
             }
             sc.close();
             sc2.close();

          }
		
       
	}
	
	public static void createStudent() {
		Scanner sc3 = new Scanner(System.in);
		String name2 = null;
		int idstu = 0, ages = 0, ind1=0;
		
		System.out.println("Enter the student's name: ");
		name2 = sc3.nextLine();
        System.out.println("Enter the student's ID: ");
        idstu = sc3.nextInt();
        System.out.println("Enter the student's age: ");
        ages = sc3.nextInt();
        Student newStu = new Student(name2, idstu, ages);
        students.add(newStu);
        
        for (int i = 0; i < classes.size(); i++) {
			System.out.println((i+1)+". "+classes.get(i));
		}
        System.out.println("Write the class ID where you wish to susbcript the student: ");
 		ind1=sc3.nextInt();
 		
 		classRooms.get(ind1-1).add(newStu);
        
		sc3.close();
		
	}
	
	
	public static void createClasses() {
		Scanner sc4 = new Scanner(System.in);
		String namecl2 = null, nameteah = null;
		int idclass = 0, indt = 0, inds = 0;
		Student newstud;
		ArrayList<Student> classroomt = new ArrayList();
		String teachType = "";
				
		System.out.println("Enter the class's name: ");
		namecl2 = sc4.nextLine();
        System.out.println("Enter the classroom: ");
        idclass = sc4.nextInt();
        System.out.println("Select a Teacher: ");
        System.out.println("Enter ft for fulltime or pt for parttime: ");
        teachType = sc4.nextLine();
        if(teachType == "ft") {
        	for (int i = 0; i < teachersft.size(); i++) {
			System.out.println((i+1)+". "+teachersft.get(i).toString());
        	}
        	indt = sc4.nextInt();
            nameteah = teachersft.get(indt-1).getName();
        }
       	else {
        		System.out.println("Part Time Teachers");
        		for (int i = 0; i < teacherspt.size(); i++) {
        			System.out.println(teacherspt.get(i).toString());
        		}
        		indt = sc4.nextInt();
                nameteah = teacherspt.get(indt-1).getName();
       	}
        
        for (int i = 0; i < students.size(); i++) {
			System.out.println((i+1)+ ". "+ students.get(i).getNameStudent());
		}
        System.out.println("Pick the students for class by number, for exit, enter 0: ");
        boolean finish = false;
        while(!finish) {
        	inds = sc4.nextInt();
        	newstud = new Student(students.get(inds-1).getNameStudent(), students.get(inds-1).getId(), students.get(inds-1).getAge());
        	classroomt.add(newstud);
        	
        	if(inds == 0) {
        		finish = true;
        	}
        }
        classRooms.add(classroomt);
				
		sc4.close();
		
		
	}
	
	public static void listClasses() {
		Scanner sc5 = new Scanner(System.in);
		int indst = 0;
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).getId()+". "+students.get(i).getNameStudent());
		}
		System.out.println("Pick the student you wish find by ID: ");
		indst = sc5.nextInt();
		for (Classes classess : classes) {
			boolean exists = classes.contains(students.contains(indst));
			if (exists == true) {
				System.out.println(classes.toString());
				
			}
			
		}
			
		sc5.close();
		
	}

	public static void main(String[] args) {
		
		initialize();
		
		Scanner scan = new Scanner(System.in);
	    boolean exit = false;
	    int option; 
	    
	    while(!exit){
	    	System.out.println("1. Print all the professors with its data");
	        System.out.println("2. Print all the classes");
	        System.out.println("3. Create a new student and add it to an existing class");
	        System.out.println("4. Create a new class and add a teacher, students and its relevant data");
	        System.out.println("5. List all the classes in which a given student is included");
	        System.out.println("6. Exit");
	        
	        try {
	           
	        	System.out.println("Choose one of the options: ");
	        	option = scan.nextInt();
	        
	        	switch(option){
	        	case 1:
	        		printTeachers();
	        		break;
	        	case 2:
	        		printClasses();
	        		break;
	        	case 3:
	        		createStudent();
	        		break;
	        	case 4:
	        		createClasses();
	        		break;
	        	case 5:
	        		listClasses();
	        		break;
	        	case 6: 
	        		exit=true;
	        		break;
	        	default:
	        		System.out.println("You must enter a number between 1 and 6");
	        	}
	        } catch (InputMismatchException e) {
                System.out.println("You have to enter a number!");
                scan.next();
	           
	       }
	    scan.close();

	    }

	}
}
