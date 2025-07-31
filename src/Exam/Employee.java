package Exam;

public class Employee {
    
	String name;
	int id;
	
	public Employee(String name,int id)
	{
		this.name = name;
		this.id = id ;
	}
	
	public void displayEmployeeInfo()
	{
		System.out.println("Employee name is:"+name);
		System.out.println("Employee id is id"+id);
	}
}

class Manager extends Employee
{
	String department;
	
	public Manager(String name,int id,String department)
	{
		super(name,id);
		this.department = department;
	}
	
	public void manageTeam()
	{
		super.displayEmployeeInfo();
		System.out.println("Departement is "+department);
	}
}

class SeniorManager extends Manager
{
	int numTeams;
	
	public SeniorManager(String name,int id ,String department,int numTeams)
	{
		super(name,id,department);
		this.numTeams = numTeams;
	}
	
	public void handleMultipleTeams()
	{
		super.manageTeam();
		System.out.println("Senior manager Handels"+ numTeams +"Teams");
	}
}
