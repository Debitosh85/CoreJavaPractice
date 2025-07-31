package com.nit.oop;

public class Student {
	
	 int studentid;
     String studentname;
	 int studentMarks;
	 char Grade;
	
	
	public void setStudentData (int id,String name,int marks)
	{
		studentid=id;
		studentname=name;
		studentMarks=marks;
	}
	
	public void displayStudent ()
	{
		if (studentMarks >= 90)
		{
			Grade='A';
		}
		
		else if (studentMarks >=81 && studentMarks<=90)
		{
			Grade='B';
		}
		
		else if (studentMarks >=71 && studentMarks <=80)
		{
			Grade='C';
		}
		
		else if (studentMarks >=61 && studentMarks <=70)
		{
			Grade='D';
		}
		
		else 
		{
			Grade='E';
		}
	}
	
	
	public void getStudentInfo ()
	{
		System.out.println("Student id is:"+studentid);
		System.out.println("Student name is :" + studentname);
		System.out.println("Student marks is :"+studentMarks);
		System.out.println("Student grade is : "+Grade);
	}
	

}
