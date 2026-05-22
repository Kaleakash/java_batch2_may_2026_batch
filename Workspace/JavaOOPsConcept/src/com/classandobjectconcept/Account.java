package com.classandobjectconcept;

public class Account {
private int accno;
private String name;
private float price;
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(int accno, String name, float price) {
	super();
	this.accno = accno;
	this.name = name;
	this.price = price;
}
@Override
public String toString() {
	return "Account [accno=" + accno + ", name=" + name + ", price=" + price + "]";
}



}
