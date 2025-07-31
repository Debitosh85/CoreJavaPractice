package com.oop.inhertance;

public class Staff {
	
	String name;
	int id;
	
	
	public Staff(String name,int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public void displayInfo()
	{
		System.out.println("Staff name is:"+ name);
		System.out.println("Staff id is :"+id);
	}
}

class Faculty extends Staff
{
	String department;
	
	public Faculty(String name,int id,String department)
	{
		super(name,id);
		this.department = department;
	}
	
	public void teachSubject()
	{
		System.out.println(name + " is teaching in the " + department + " department.");
	}
}

class Proffesor extends Faculty
{
	String researchArea;
	
	public Proffesor(String name,int id,String department,String researchArea)
	{
		super(name,id,department);
		this.researchArea = researchArea;
	}
	
	public void conductResearch()
	{
		System.out.println(name + " is conducting research in the area of " + researchArea + ".");
	}
}
