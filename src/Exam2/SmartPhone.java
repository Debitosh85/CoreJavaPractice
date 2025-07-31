package Exam2;

public class SmartPhone {
	
	private String brand;
	private String model;
	private int releaseYear;
	private User user;
	
	public SmartPhone(String brand, String model, int releaseYear,User user)
	{
		super();
		this.brand = brand;
		this.model = model;
		this.releaseYear = releaseYear;
		this.user =  user;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	void changeUser(User newUser)
	{
		System.out.println("New smart phone user is "+newUser );
	}
	
	public void displayDetails()
	{
		System.out.println("SPhone brand is "+brand);
		System.out.println("Sphone model is :"+model);
	    System.out.println("Sphone release year is :"+releaseYear);
	    user.userDetails();
	}

}
