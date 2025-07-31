package Exam2;

public class Person {
	
	String name;
	int age;
	
	public Person(String name,int age)
	{
		super();
		this.name = name;
		this.age = age;
	}
	
	public void displayDetails()
	{
		System.out.println("name of the Person is:"+name);
		System.out.println("age of the Person is:"+age);
	}
	
}
	
	class Student extends Person
	{
		int rollNumber;
		
		public Student(String name,int age,int rollNumber)
		{
			super(name,age);
			this.rollNumber = rollNumber;
		}
		
		public void study()
		{
			super.displayDetails();
			System.out.println("Roll no is :"+ rollNumber + "is Studying");
			
		}
	}
	
	class Teacher extends Person
	{
		String subJect;
		
		public Teacher(String name,int age,String subject)
		{
			super(name,age);
			this.subJect = subject;
		}
		
		public void teach()
		{
			super.displayDetails();
			System.out.println("He is Teaching:"+ subJect +"subJect");
		}
	}
	
	


