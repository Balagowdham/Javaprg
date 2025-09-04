package com.tcf;

public class CustomerDemo {
	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setCid(101);
		c1.setName("Bala");
		c1.setCity("Pondy");
		System.out.println(c1);
		Customer c2=new Customer();
		c2.setCid(102);
		c2.setName("Gowdham");
		c2.setCity("Chennai");
		System.out.println(c2);
	}
	
	
}
