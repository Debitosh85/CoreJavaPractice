package multithreadingtask;

public class EducationMain {
	
	public static void main(String[] args) {
		
		Course[] c = {new Course(1,"MatheMatics",1200),new Course(2,"Science",1000),
				     new Course(3,"Physics",2000),new Course(4,"Biology",500),
				     new Course(5,"History",400)};
		Offers[] offer = {	
		  new Offers("Special Discount:Get 20% off on all Courses"),
		  new Offers("Limited time offer:Enroll in any Two Course and get one Course Free"),	
		};
				
		EducationInstitute e = new EducationInstitute(c,offer);
		
		Student s = new Student("Alice",e);
		Student s1 = new Student("Max",e);
		
		
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("Available Course and Fees:");
				s.viewCourseAndFess();
				System.out.println("View Available Offers:");
				s.viewOffers();
				s.enrollInCourse(1);
			}	
		};
		
		Thread t1 = new Thread() {
			
			@Override
			public void run() {
				System.out.println("Available Course and Fees:");
				s1.viewCourseAndFess();
				System.out.println("View Available Offers:");
				s1.viewOffers();
				s1.enrollInCourse(2);
			}
		};
		t.start();
		try {
			t.join();
		}catch(InterruptedException e1) {
			System.out.println(e1.getMessage());
		}
		System.out.println("------------------------------");
		t1.start();
	}

}
