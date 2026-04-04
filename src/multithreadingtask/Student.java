package multithreadingtask;

public class Student {
	
	private String name;
	
	private EducationInstitute institute;
	
	public Student(String name,EducationInstitute institute) {
		
		this.name = name;
		this.institute = institute;
	}
	
	public void viewCourseAndFess() {
		for(Course c :institute.course) {
		    System.out.println(c.getCourseName()+"-"+"Fee:"+c.getCoursefee());
		}
	}
	
	public void viewOffers() {
		
		Offers[] offer = institute.getOffers();
		
		for(Offers off:offer) {
			System.out.println(off.getofferText());
		}
	}
	
	public void enrollInCourse(int CourseId) {
		institute.enrollStudentCourse(CourseId, name);
	}
}
