package Exam2;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		
		User user1 = new User("scott",23);
		SmartPhone Vivo = new SmartPhone("Vivo","V30pro",2024,user1);
		Vivo.displayDetails();
		
		User user2 = new User("Bob",30);
		Vivo.changeUser(user2);
        
		
		
	}

}
