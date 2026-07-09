package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class FirstExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//List<Integer> ll = new ArrayList<Integer>();
		//List<Integer> ll = new CopyOnWriteArrayList<Integer>();
		//Set<Integer> ll = new HashSet<Integer>();
		Set<Integer> ll = new CopyOnWriteArraySet<Integer>();
		Runnable r1 = ()-> {
			for(int i=0;i<1000;i++) {
				ll.add(i);
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r2 = ()-> {
			for(int i=0;i<1000;i++) {
				ll.add(i);
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("size "+ll.size());
	}

}
