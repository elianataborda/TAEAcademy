package com.globant.finalprojectpoo;

public abstract class Teacher{
	private String nameTeacher;
	private long basesalary;
	

	public Teacher(String nameteacher, long basesalary) {
		this.nameTeacher = nameteacher;
		this.basesalary = basesalary;		
	}

	public long getBaseSalary() {
		return basesalary;
	}

	public void setBaseSalary(long basesalary) {
		this.basesalary = basesalary;
	}
		
	public void setName(String nameteacher) {
		this.nameTeacher = nameteacher;
	}
	
	protected String getName() {
		// TODO Auto-generated method stub
		return nameTeacher;
	}

	public abstract long calculateSalary();
	

}
