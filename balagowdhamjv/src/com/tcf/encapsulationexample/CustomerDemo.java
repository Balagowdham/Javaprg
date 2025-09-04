package com.tcf;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setCid(101);
		c1.setName("Bala");
		c1.setCity("Pondy");
		System.out.println(c1);
		c1.setCid(102);
		c1.setName("Gowdham");
		c1.setCity("Chennai");
		System.out.println(c1);
	}
	
	
}
