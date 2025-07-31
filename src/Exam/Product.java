package Exam;

	class product {
	    protected String name;
	    protected double price;

	    public product (String name,double price)
	    {
	        this.name = name;
	        this.price = price;
	    }

	    public void displayInfo()
	    {
	    System.out.println("Product name is" + name);
	    System.out.println("Product price is"+price);
	    }
	    
	    public int calculateTotalcost(int quantity)
		{
			int  totalcost = (int)  price * quantity;
			
			return totalcost;
		}
	}
	
	class Electronics extends product
	{
	   private String brand;

	     public Electronics(String name,double price,String brand)
	      {
	        super(name,price);
	        this.brand = brand;
	      }

	  public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

	public void displayInfo()
	  {
		 super.displayInfo();
	     System.out.println("Brand is "+brand);
	      
	  }
	}
	
	class Clothing extends product
	{
		private String size;
		
		public Clothing(String name,double price,String size)
		{
			super(name,price);
			this.size = size;
		}
		
		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public void displayInfo()
		{
			super.displayInfo();
			System.out.println("Product Size is"+size);
			
		}

		
		}
	




