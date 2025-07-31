package com.oop.inhertance;

public class Library {
	
	String Title;
	
	public Library(String Title)
	{
		this.Title = Title;
	}
	
	public void displayInfo()
	{
		System.out.println("Title of the Library item is :"+Title);
	}
}

 class Book extends Library
 {
	 String authorOfTheBook;
	 
	 public Book(String authorOfTheBook,String Title)
	 {
		 super(Title);
		 this.authorOfTheBook = authorOfTheBook;
	 }
	 
	 public void displayBookInfo()
	 {
		 super.displayInfo();
		 System.out.println("The author is :"+authorOfTheBook);
	 } 
 }
 
 class Ebook extends Book
 {
	 String fileFormat;
	 
	 public Ebook(String fileFormat,String authorOfTheBook,String Title)
	 {
		 super(authorOfTheBook,Title);
		 this.fileFormat = fileFormat;
	} 
	 
	 public void displayEbookInfo()
	 {
		 super.displayBookInfo();
		 System.out.println("File Format is "+fileFormat);
	 }
 }
