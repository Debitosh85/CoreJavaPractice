package com.java.arraylist;



public class Tester {

	public static void main(String[] args) {
	
		String[]arr1 = {"Apple","orange","Banana"};
		String[]arr2 = {};
		String []arr3 = null;
		
		try{

			System.out.println("List1:"+ArrayToList.convertToList(arr1));
			System.out.println("List2:"+ArrayToList.convertToList(arr2));
			System.out.println("List2:"+ArrayToList.convertToList(arr3));
			
		}
		catch(NullPointerException e) {
			System.out.println("Null Value not allowed");
		}
	}

}
