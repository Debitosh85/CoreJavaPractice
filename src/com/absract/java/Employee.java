package com.absract.java;

public interface Employee {

	public double calculateSalary(double salary);
	public void generatePayroll();
}

class FullTimeEmployee implements Employee
{
	private int employeeId;
	private String employeeName;
	private double monthlySalary;
	private double benefits;
	
	
	public FullTimeEmployee(int employeeId,String employeeName,double monthlySalary,double benefits)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.monthlySalary = monthlySalary;
		this.benefits = benefits;
		
		if(monthlySalary < 0 )
		{
			System.out.println("Monthly salary cannot be negative");
		}
		
		else if(employeeName.isEmpty() || employeeName.isBlank()||employeeName==null)
		{
			System.err.println("Employee name can't be Empty");
		}
		
		else
		{
			System.out.println("MonthlySalary is:"+this.calculateSalary(monthlySalary));
			this.generatePayroll();
		}
	}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public double getMonthlySalary() {
		return monthlySalary;
	}


	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}


	public double getBenefits() {
		return benefits;
	}


	public void setBenefits(double benefits) {
		this.benefits = benefits;
	}
	
	public double calculateSalary(double salary)
	{
		this.monthlySalary+=this.benefits;
		return this.monthlySalary;
	}
	
	public void generatePayroll()
	{
		System.out.println("Employee id is :"+this.employeeId);
		System.out.println("EmployeeName is :"+this.employeeName);
		System.out.println("Employee Monthlysalry is :"+this.monthlySalary);
		System.out.println("Benefits is :"+this.benefits);
	}
}