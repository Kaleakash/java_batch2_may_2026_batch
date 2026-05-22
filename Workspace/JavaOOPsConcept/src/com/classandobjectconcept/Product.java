package com.classandobjectconcept;

public class Product {
private int pid;
private String pname;
private float price;

void display() {
	System.out.println("pid is "+pid);
	System.out.println("pname is "+pname);
	System.out.println("price is "+price);
}
Product() {
	pid = 123;
	pname="Uknown";
	price = 4500;
}
Product(int pid, String pname, float price){
	this.pid=pid;
	this.pname=pname;
	this.price=price;
}
void setValue(int pid, String pname, float price){
	this.pid=pid;
	this.pname=pname;
	if(price<0) {
		this.price = 10000;
	}else {
	this.price=price;
	}
}
}
