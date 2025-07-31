package Exam;

public class Book {
	
	String Title;
	String author;
	double price;
	
	
	public Book(String title, String author, double price) {
		super();
		Title = title;
		this.author = author;
		this.price = price;
	}
	
	public void getDetails()
	{
		System.out.println("Book title is "+Title);
		System.out.println("author is "+author);
		System.out.println("price is "+price);
	}
	
	public double applyDiscount(double percentage)
	{
	 double discount =  price * percentage/100;
//	 System.out.println(price + "%" +discount);
	 System.out.println("discount is "+discount);
	 return discount; 
	}
}

class Ebook extends Book
{
	double filesize;
	String format;
	
	public Ebook(String Title,String author,double price,double filesize,String format)
	{
		super(Title,author,price);
		this.filesize = filesize;
		this.format = format;
	}
	public void EbookgetDetails()
	{
		System.out.println("The file size of the Ebook is :"+filesize);
		System.out.println("The format is :"+format);
	}
	
}
	
	class Audiobook extends Book
	{
		double duration;
		String narrator;
		
		public Audiobook(String Title,String author,double price,double duration,String narrator)
		{
			super(Title,author,price);
			this.duration = duration;
			this.narrator = narrator;
		}
		
		public void AudiobookDetails()
		{
			super.getDetails();
			System.out.println("Duration of the Book is:"+duration);
			System.out.println("Narrator of the book is :"+narrator);
		}
		
		
	}

