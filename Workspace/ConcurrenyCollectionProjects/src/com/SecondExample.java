package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SecondExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Integer> ll = new ArrayList<Integer>();
				List<Integer> ll = new CopyOnWriteArrayList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		Iterator<Integer> li = ll.iterator();
		while(li.hasNext()) {
			int n = li.next();
			ll.add(100);
		}
		System.out.println("size "+ll.size());
	}

}
