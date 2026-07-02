package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("Raj");
		list.add("Ravi");
		list.add("Ramesh");
		//list.remove
		Iterator<String> li = list.iterator();
		li.hasNext();
		
		String name = li.next();
		System.out.println(name);
		li.hasNext();
		String name1 = li.next();
		System.out.println(name1);
//		while(li.hasNext()) {
//			String name = li.next();
//			System.out.println(name);
//			//list.remove(0);
//			li.remove();
//		}
		System.out.println(list.size());
		
	}

}
