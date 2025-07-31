package com.nit.oop;

import java.util.*;
public class Employee {
	
	int empid;
    String empname;
    double empsalary;
    
    Scanner sc = new Scanner (System.in);
    
    public void setEmployeeData ()
    {
    	System.out.println("Enter employee id:");
    	
    	 empid =sc.nextInt();
    	
    	System.out.println("Enter employee name:");
    	
    	 empname = sc.nextLine();
    	 empname =sc .nextLine();
    	
    	
    	System.out.println("Enter employee Salary");
    	
    	empsalary = sc.nextDouble();
    	sc.close();
    	
    }
    
    public void getEmployeeInfo ()
    
    {
    	System.out.println("Employee id is :"+empid);
    	System.out.println("Employee name is : "+empname);
    	System.out.println("Employee salary is :"+empsalary);
    }
    
      
    
    
	

}
