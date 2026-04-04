package multithreadingtask;

public class EducationInstitute {

	Course[] course ;
	Offers[] offer;
	
	public EducationInstitute(Course[]course,Offers[]offer) {
		
		this.course = course;
		this.offer = offer;
	}
	
	public Course[] getcourse(){
		return course;
	}
	
	public Offers[] getOffers() {
		return offer;
	}
	
	public void enrollStudentCourse(int courseId,String studentName) {
		
		for(int i=0;i<=course.length-1;i++) {
			if(courseId==course[i].getCourseid()) {
				System.out.println(studentName+"enrolled in:"+course[i].getCourseName());
			}
		}
	}
}
