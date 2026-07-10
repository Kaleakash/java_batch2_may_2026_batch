package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer> {
	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("Value is "+t);
	}
}
public class StreamAPIExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(100); ll.add(150); ll.add(21); ll.add(25); ll.add(8);
//		System.out.println(ll);  // display as string format
//		System.out.println("display element using loop");
//		for(int n : ll) {
//			System.out.println(n);
//		}
//		Consumer<Integer> cc = new MyConsumer();
//		ll.forEach(cc);	// consumer reference as parameter 
		
//		System.out.println("display the value using lambda");
//		ll.forEach((t)->System.out.println("VAlue is "+t));
		
		ll.stream().forEach(c->System.out.println("Value is "+c));
		System.out.println("display only even number");
		ll.stream().filter(t->t%2==0).forEach(c->System.out.println(c));
		System.out.println("display modified number");
		ll.stream().map(v->v+100).forEach(c->System.out.println(c));
	}

}
