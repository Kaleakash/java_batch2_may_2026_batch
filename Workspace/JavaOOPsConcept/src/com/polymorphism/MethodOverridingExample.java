package com.polymorphism;
class Bike {
	void speed() {
		System.out.println("60km/hr");
	}
}
class Honda extends Bike {
	void milage() {
		System.out.println("70km/lt");
	}
	@Override
	void speed() {
		System.out.println("50km/hr");
	}
}
public class MethodOverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda hh = new Honda();
		hh.speed();
		hh.milage();
		Bike bb = new Honda();// run time polymorphism 
		bb.speed();// we can call only those method which belong to super class or overrided methods 
		
	}

}
