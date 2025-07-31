package Exam;


public class BookMain {

	public static void main(String[] args) {
		
		Book b1 = new Book("Indian","Cbhagat",250.00);
		b1.getDetails();
		b1.applyDiscount(15.00);
		
		System.out.println("______________");
		
		Ebook E1 = new Ebook("Super","Jbn",356.00,2,"PDF");
		E1.EbookgetDetails();
		E1.applyDiscount(56);
		
		System.out.println("______________");
		
		Audiobook a2 = new Audiobook("Shiv","Cbn",560.00,4.5,"Singham story");
		a2.AudiobookDetails();
		a2.applyDiscount(34);
		
		

	}

}
