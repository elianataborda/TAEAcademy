package com.globant.finalprojectpoo;

public class PartTime extends Teacher{
	private static String nameteacher;
	private static long basesalary;
	private int actHoursPerWeek;
	

	public PartTime(String nameteacher, long basesalary, int actHoursPerWeek) {
		// TODO Auto-generated constructor stub
		super(nameteacher, basesalary);
		this.actHoursPerWeek = actHoursPerWeek;
		
	}
	
	public long getBaseSalary() {
		return getBasesalary();
	}

	public void setBaseSalary(long basesalary) {
		PartTime.setBasesalary(basesalary);
	}

	public int getActHoursPerWeek() {
		return actHoursPerWeek;
	}

	public void setActHoursPerWeek(int actHoursPerWeek) {
		this.actHoursPerWeek = actHoursPerWeek;
	}

	public static long getBasesalary() {
		return basesalary;
	}

	public static void setBasesalary(long basesalary) {
		PartTime.basesalary = basesalary;
	}
	
	public static String getNameteacher() {
		return nameteacher;
	}

	public static void setNameteacher(String nameteacher) {
		PartTime.nameteacher = nameteacher;
	}
	
	@Override
	public long calculateSalary() {
		// TODO Auto-generated method stub
		return basesalary*actHoursPerWeek;
	}
		
	@Override
	public String toString() {
		return nameteacher + ", " + basesalary + ", " + calculateSalary();
	}

}
