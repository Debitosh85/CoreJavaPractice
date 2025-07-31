package Exam2;


public class PersonMain {

	public static void main(String[] args) {
		
		Student s1 = new Student("Scott",24,101);
		s1.study();
		
		System.out.println("------------------");
		
		Teacher t1 = new Teacher("Alex",25,"Java");
		t1.teach();
		
		
		

	}

}
