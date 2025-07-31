package com.nit.m1;
import java.util.*;
public class Employee1Demo {

	public static void main(String[] args) {
		
		Employee1 growth = new Employee1();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee name:");
		String Employeename = sc.nextLine();
		
		System.out.println("Enter Employee Adress:");
		String EmployeeAdress = sc.nextLine();
		
		System.out.println("Enter Employee Mobileno:");
		int EmpMobilno = sc.nextInt();
		
		System.out.println("Enter Employee Salary");
		double Empsalary = sc.nextDouble();
		
		System.out.println("Enter Employee NO :");
		int Empno = sc.nextInt();
		
		System.out.println("Enter Employee Experience");
		int EmpExp = sc.nextInt();
		
		growth.setEmployeeData(Employeename, EmployeeAdress, EmpMobilno, Empsalary, Empno, EmpExp);
		growth.increment();
		System.out.println(growth);
		
		
		
		sc.close();
		
		
		

	}

}
