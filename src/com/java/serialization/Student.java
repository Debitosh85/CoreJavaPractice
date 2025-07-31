package com.java.serialization;


import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Student implements Serializable{
	
	private int studentId;
	private String studentName;
	private double studentFees;
	private Date dateOfAdmission;
	
	
	
	public Student(int studentId,String studentName,double studentfees,Date dateOfAdmission) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentfees;
		this.dateOfAdmission = dateOfAdmission;
		
	}
	
	public static Student getStudentObject() throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter studentId");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter StudentName");
		String name = sc.nextLine();
		System.out.println("Enter Student fees");
		double fees = sc.nextDouble();
//		System.out.println("Enter dateOfAdmission (dd/mm/yy)");
//		String date = sc.nextLine();
//		DateFormat format = new SimpleDateFormat("dd/mm/yy");
//		Date date2 = format.parse(date);
		
		return new Student(id,name,fees,new Date());
		
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
	

}
