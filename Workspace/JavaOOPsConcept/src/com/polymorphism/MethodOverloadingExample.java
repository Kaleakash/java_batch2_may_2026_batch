package com.polymorphism;

class Operation {
	
	void add() {
		System.out.println(10+20);
	}
	void add(int x) {
		System.out.println(x+20);
	}
	void add(int x, int y) {
		System.out.println(x+y);
	}
	void add(int x, int y, int z) {
		System.out.println(x+y+z);
		
	}
	void add(float x, float y) {
		System.out.println(x+y);
	}
	void add(String s1, String s2) {
		System.out.println(s1+s2);
	}
}
public class MethodOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation op = new Operation();
		op.add(1, 2, 3);
		op.add();
		op.add(1,2);
		op.add("1","2");
		System.out.println(10+20);
		System.out.println(10);
		System.out.println("Hello");
	}

}
