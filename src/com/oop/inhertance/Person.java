package com.oop.inhertance;

public class Person {
	
	String name;
	int age;
	
	public Person(String name,int age)
	{
		this.name= name;
		this.age = age;
	}
	
	public void displayInfo()
	{
		System.out.println("Person name is :"+name);
		System.out.println("person age is :"+age);
	}
}
	class Employee extends Person
	{
		String employeeId;
		
		public Employee(String employeeId,String name,int age)
		{
			super(name,age);
			this.employeeId=employeeId;
			
			
		}
		
		public void displayEmployeeInfo(String employeeId)
		{
			super.displayInfo();
			System.out.println("The Employee id is :"+employeeId);
		
		}
	}
		
		class Manager extends Employee
		{
			String departmentName;
			
			
			public Manager(String departmentName,String employeeId,String name,int age)
			{
				super(employeeId,name,age);
				this.departmentName = departmentName;
				
			}
			
			public void displayManagerInfo(String employeeId,String departmentName)
			{
				super.displayEmployeeInfo(employeeId);
				System.out.println("Department name is "+departmentName);
			}
		}
		
		

	

