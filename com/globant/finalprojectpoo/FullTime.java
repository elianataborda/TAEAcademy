package com.globant.finalprojectpoo;

public class FullTime extends Teacher{
	private static String name;
	private static long basesalary;
	private static int expYears;
		

	public FullTime(String name, long basesalary, int expYears) {
		// TODO Auto-generated constructor stub
		super(name, basesalary);
		FullTime.setExpYears(expYears);		
	}

	public static int getExpYears() {
		return expYears;
	}

	public static void setExpYears(int expYears) {
		FullTime.expYears = expYears;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		FullTime.name = name;
	}
	
	@Override
	public long calculateSalary() {
		// TODO Auto-generated method stub
		return basesalary*getExpYears()*110;
	}
	
	@Override
	public String toString() {
		return name + ", " + basesalary + ", " + calculateSalary();
	}

}
