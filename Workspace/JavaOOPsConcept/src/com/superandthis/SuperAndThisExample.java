package com.superandthis;

class A {
	int a=10;
	void dis1() {
		System.out.println("super class method");
	}
}
class B extends A {
	int a=20;
	void dis() {
		int a=30;
		System.out.println("a "+a); // local 
		System.out.println("instance "+this.a); // refer to instance 
		System.out.println("super "+super.a);  // refer to super 
	}
	void dis1() {			// merge super class and sub class method
		super.dis1();   // calling super class method
		System.out.println(" sub class override method");
	}
}
public class SuperAndThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.dis();
		obj.dis1();
	}

}
