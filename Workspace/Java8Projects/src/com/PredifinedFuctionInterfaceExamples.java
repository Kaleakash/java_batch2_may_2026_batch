package com;

import java.util.function.Predicate;

class MyPredicate implements Predicate<Integer>{
	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t>18;
	}
}

public class PredifinedFuctionInterfaceExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1 = new MyPredicate();
		System.out.println(p1.test(20));
		
		Predicate<Integer> p2 = (t)->t>18;
		System.out.println(p2.test(12));
		
		Predicate<String> p3 = (name)->name.length()>10;
		System.out.println(p3.test("Welcoem to Java Training"));
	}

}
