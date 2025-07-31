package Exam;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Manager m1 = new Manager("Jibann",65,"Production");
		m1.manageTeam();
		
	        
		System.out.println("-------------------");
		
		SeniorManager s1 = new SeniorManager("Rakesh",304,"HR",4);
		s1.handleMultipleTeams();
		}

}
