package multithreadingtask;

public class Course {
private int courseId;
private String courseName;
private double courseFee;

public Course(int courseId,String courseName,double courseFee) {
	
	this.courseId = courseId;
	this.courseName = courseName;
	this.courseFee = courseFee;
}

public int getCourseid() {
	return courseId ;
}

public String getCourseName() {
	return courseName;
}

public double getCoursefee() {
	return courseFee;
}		
			

}


