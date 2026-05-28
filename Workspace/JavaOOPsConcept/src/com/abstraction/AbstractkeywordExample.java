package com.abstraction;

abstract class Bike {
	abstract void speed();
	Bike() {}
}
abstract class Honda extends Bike {
	void milage() {
		System.out.println("70km/lt");
	}
}
class Activa extends Honda {
	@Override
	void speed() {
		System.out.println("50km/hr");
	}
}
class Pulsar extends Bike {
	void milage() {
		System.out.println("40km/lt");
	}
	@Override
	void speed() {
		System.out.println("90km/hr");
	}
}
public class AbstractkeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bb = new Activa();
		bb.speed();
		//bb.milage();
	}

}
