package com.java.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.Scanner;

public class StoreObject {

	public static void main(String[] args) throws IOException, ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int size=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the file path : ");
		String path = sc.nextLine();
		FileOutputStream fos = new FileOutputStream(new File(path)) ;
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		for(int i=1;i<=size;i++)
		{
			Student student = Student.getStudentObject();
			oos.writeObject(student);
		}

	}

}
