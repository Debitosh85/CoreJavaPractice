package com.nit.m1;

public class Employee1 {

	String Employeename;
	String EmployeeAddress;
	int EmpMobileno;
	double EmpSalary;
	int Empno;
	int EmpExp;
	
	public void setEmployeeData (String Employeename,String EmployeeAddress,int EmpMobileno,double Empsalary,int Empno,int EmpExp)
	{
		this.Employeename = Employeename;
		this.EmployeeAddress= EmployeeAddress;
		this.EmpMobileno = EmpMobileno;
		this.EmpSalary= Empsalary;
		this.Empno = Empno;
		this.EmpExp = EmpExp;
		
		
	}
	
	public void increment ()
	{
		if (this.EmpExp >=1 && this.EmpExp <=5)
		{
			this.EmpSalary+=3000;
		}
		
		else if (this.EmpExp > 5 && this.EmpExp <=7)
		{
			this.EmpSalary+=5000;
		}
		
		else if (this.EmpExp > 7)
		{
			this.EmpExp+=10000;
		}
	}

	@Override
	public String toString() {
		return "Employee1 [Employeename=" + Employeename + ", EmployeeAddress=" + EmployeeAddress + ", EmpMobileno="
				+ EmpMobileno + ", EmpSalary=" + EmpSalary + ", Empno=" + Empno + ", EmpExp=" + EmpExp + "]";
	}
	
	
	
}
