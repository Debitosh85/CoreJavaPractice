
 package com.nt.Literals;
 
 
	/*public class AssigningSmalltoBig {
	
	public static void main(String[] args) {
	
	byte b = 125;
	
	Short s = 32767;
	
	System.out.println("Byte value:"+b+"Short Value:"+s);
	
	}
	
	}*/
  
 

public class AssigningSmalltoBig{
	public static void main(String[] args) {
		
		byte b = 125;
		
		short s = b; //[Assigning Small to Big]
		
		System.out.println("Value of Short is:"+s);
		
	}
}