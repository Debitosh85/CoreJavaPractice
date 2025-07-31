package com.inheritance.Has_A_Relation;

public class Employee {
	
	int id;
	String name;
	double basicSalary;
	double HRAPer;
	double DAPer;
	
	public Employee(int id,String name,double basicSalary,double HRAPer,double DAPer)
	{
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.HRAPer = HRAPer;
		this.DAPer = DAPer;
	}
	
	public double calculateGrossSalary()
	{
		double totalGross = basicSalary +HRAPer +DAPer;
    	System.out.println("Total gross is :"+totalGross);
		return totalGross;
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", HRAPer=" + HRAPer
				+ ", DAPer=" + DAPer + "]";
	}
	
	
}

class Manager extends Employee
{
	double projectAllowance;
	
	public Manager(int id,String name,double basicSalary,double HRAPer,double DAPer,double projectAllowance)
	{
		super(id,name,basicSalary,HRAPer,DAPer);
		this.projectAllowance = projectAllowance;
	}
	
	public double calculateGrossSalary()
	{
		return super.calculateGrossSalary() + projectAllowance ;
		
	}
}

class Trainer extends Employee
{
	int batchCount;
	double perkPerBatch;
	
	public Trainer(int id,String name,double basicSalary,double HRAPer,double DAPer,int batchCount,double perkPerBatch)
	{
		super(id,name,basicSalary,HRAPer,DAPer);
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}
	
	public double calculateGrossSalary()
	{
		return super.calculateGrossSalary() +(batchCount * perkPerBatch);
	}
}

class Sourcing extends Employee
{
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;
	
	public Sourcing(int id,String name,double basicSalary,double HRAPer,double DAPer,int enrollmentTarget,int enrollmentReached,double perkPerEnrollment)
	{
		super(id,name,basicSalary,HRAPer,DAPer);
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}
	
	public double calculateGrossSalary()
	{
		return super.calculateGrossSalary() +((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment;
		
	}
}

class TaxUtil
{
	static double tax;
	public static double calculateTax(Employee emp)
	{
		if (emp.calculateGrossSalary() > 30000)
		{
		    tax = emp.calculateGrossSalary() *0.20;
		}
		else
		{
			tax = emp.calculateGrossSalary() *0.05;
		}
		return tax;	
	}
	
	public static double calculateTax(Manager mng) 
	{
		if(mng.calculateGrossSalary()>30000)
		{
			tax = mng.calculateGrossSalary() *0.20;
		}
		else
		{
			tax = mng.calculateGrossSalary() * 0.05;
		}
		
		return tax;
	}
	
	public static double calculateTax(Trainer tnr)
	{
		if(tnr.calculateGrossSalary() > 30000)
		{
			tax = tnr.calculateGrossSalary() * 0.20;
		}
		
		else
		{
			tax = tnr.calculateGrossSalary() * 0.05;
		}
		
		return tax;
	}
	
	public static double calculateTax(Sourcing sng)
	{
		if(sng.calculateGrossSalary()>30000)
		{
			tax = sng.calculateGrossSalary()*0.20;
		}
		else
		{
			tax = sng.calculateGrossSalary()*0.05;
		}
		
		return tax;
	}
}

