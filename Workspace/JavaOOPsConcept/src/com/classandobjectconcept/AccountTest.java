package com.classandobjectconcept;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account();
		acc1.setAccno(100);
		acc1.setName("Raj");
		acc1.setPrice(1000);
		System.out.println("accno "+acc1.getAccno());
		System.out.println("name "+acc1.getName());
		System.out.println("amount "+acc1.getPrice());
		Account acc2 = new Account(101, "mahesh", 1200);
		System.out.println(acc2);
	}

}
