package com.oop.shallow_copy;

public class DeepCopy {
	
	private int productid;
	private String productname;
	
	
	
	public DeepCopy ()
	{
	    @SuppressWarnings("unused")
		int productid= 0;
		@SuppressWarnings("unused")
		String productname = null;
	}
	
	public DeepCopy(int productid, String productname) {
		super();
		this.productid = productid;
		this.productname = productname;
	}



	public int getProductid() {
		return productid;
	}



	public void setProductid(int productid) {
		this.productid = productid;
	}



	public String getProductname() {
		return productname;
	}



	public void setProductname(String productname) {
		this.productname = productname;
	}



	@Override
	public String toString() {
		return "DeepCopy [productid=" + productid + ", productname=" + productname + "]";
	}



	

}
