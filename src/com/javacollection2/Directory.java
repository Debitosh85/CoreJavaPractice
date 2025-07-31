package com.javacollection2;

import java.util.ArrayList;
import java.util.List;


public class Directory {
	
	
	private List<Employee> li;
	
	public Directory()
	{
		li = new ArrayList<>();
	}
	
	
	public void addEmployee(Employee emp)
	{
		li.add(emp);
		System.out.println("Employee Added"+emp);
	}
	
	public void displayAllEmployees()
	{
		System.out.println("All employee information");
		
		for(Employee emp:li)
		{
			System.out.println(emp);
		}
	}
	
	public void deleteEmployee(int index)
	{
		if(index>=0 && index< li.size())
		{
			Employee removed = li.remove(index);
			System.out.println("Employee Removed"+ removed);
		}
		else
		{
			System.out.println("Invalid index position.No Employee removed");
		}
	}
	
	public void updateEmployee(int index, Employee updatedEmployee) {
        if (index >= 0 && index < li.size()) {
            li.set(index, updatedEmployee);
            System.out.println("Employee updated at index " + index + ": " + updatedEmployee);
        } else {
            System.out.println("Invalid index. No employee updated.");
        }
    }
	

}
