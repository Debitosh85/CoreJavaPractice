package com.java.stream4;

public class Student {
	
	private String name;
	private String gender;
	private String department;
	private double gpa;
	private int years_of_study;
	
	public Student(String name,String gender,String department,double gpa,int years_of_study) 
	{
		if(gpa<0.0 || gpa > 10.0) {
			throw new IllegalArgumentException("GPA must be between 0.0 and 10.0");
		}
		if(years_of_study< 0) {
			throw new IllegalArgumentException("Year of Study can't be negative");
		}
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.gpa = gpa;
		this.years_of_study = years_of_study;
		
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getYears_of_study() {
		return years_of_study;
	}

	public void setYears_of_study(int years_of_study) {
		this.years_of_study = years_of_study;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", department=" + department + ", gpa=" + gpa
				+ ", years_of_study=" + years_of_study + "]";
	}
	
	
}
