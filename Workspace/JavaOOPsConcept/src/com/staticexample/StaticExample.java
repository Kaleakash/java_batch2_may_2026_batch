package com.staticexample;
class Employee {
	int id;
	String name;
	float salary;
	static int mgrId;
	static 
	{
		System.out.println("static block - this code execute only once when class loaded...");
	}
	static void display1() {
		System.out.println("static method");
	}
}
class Abc {
	int x;
	static int y;			// static memory only one copy and y is a part of static memory. y=0
	void display1() {
		System.out.println("non static method");
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	static void display2() {
		System.out.println("static method");
		System.out.println("y "+y);
		//System.out.println("x "+x);
	}
}
public class StaticExample {
	static int x;
	static {
		System.out.println("main method static block");
	}
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Abc obj1 = new Abc();		// new heap memory created x = 0
//		Abc obj2 = new Abc();		// new heap memory created x=0
//		obj1.x=100;
//		Abc.y=200;
//		obj2.x=300;
//		Abc.y=400;
//		obj1.y=500;
//		obj2.y=600;
//		obj1.display1();	// x=100,	y=600 
//		obj2.display1();	// x=300		y=600
//		Abc.display2();
		System.out.println("main method");
		Employee.display1();
//		Employee.display1();
	}

}
