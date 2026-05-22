package com.classandobjectconcept;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.display();
		Product p2 = new Product();
		p2.display();
		Product p3 = new Product(100, "TV", 55000);
		Product p4 = new Product(101, "Computer", 35000);
		p3.display();
		p4.display();
		p4.display();
		//p4.price=-56000;
		p4.setValue(104, "Laptop", -98000);
		p4.display();
	}

}
