package com.java.collectioninterface;
import java.util.ArrayList;
import java.util.Collections;

record Product(int id, String name) {}
public class CollectionTest {

	public static void main(String[] args) 
	{
		ArrayList<Product> listOfProduct = new ArrayList<Product>();
		listOfProduct.add(new Product(333, "Laptop"));
		listOfProduct.add(new Product(111, "Mobile"));
		listOfProduct.add(new Product(222, "Camera"));
		
		System.out.println("Original Data :");
		listOfProduct.forEach(System.out::println);
			
		System.out.println("Sorted Data based on the Id :");
		Collections.sort(listOfProduct, (p1,p2)->Integer.compare(p1.id(), p2.id()));		
		listOfProduct.forEach(System.out::println);
		
		
		System.out.println("Sorted Data based on the Name :");
		Collections.sort(listOfProduct, (p1,p2)-> p1.name().compareTo(p2.name()));
		listOfProduct.forEach(System.out::println);
		
		
	}

}