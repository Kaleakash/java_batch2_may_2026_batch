package com.inheritance;

class Bike {
	static void speed() {
		System.out.println("90km/hr");
	}
}
class Honda extends Bike {
	//@Override
	static void speed() {
		System.out.println("100km/hr");
	}
}
public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike hh = new Honda();
		hh.speed();
	}

}
