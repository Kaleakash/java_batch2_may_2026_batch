package com;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class DemoTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//RandomGeneratorFactory.all().limit(1).filte().forEach(e->System.out.println(e.name()));
//		 RandomGenerator random =RandomGenerator.getDefault();
//	        System.out.println("Random Number : "
//	                + random.nextInt(100000));
//	        
	        Thread t = Thread.startVirtualThread(()-> {
	        		System.out.println("This is simple virutal thread");
	        		Thread t1 = Thread.currentThread();
	        		System.out.println(t1);
	        });
	        System.out.println("Normal task");
	       t.join();
	        System.out.println("work finish");
	        
	       // Executors.newVirtua
	        CompletableFuture<String> cf = CompletableFuture.runAsync(()-> {
	        	
	        });
	}

}
