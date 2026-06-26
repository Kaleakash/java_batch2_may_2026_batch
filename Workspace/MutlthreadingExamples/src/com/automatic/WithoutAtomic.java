package com.automatic;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    //int count = 0;
   
//    Lock lock = new ReentrantLock();
//    public  void increment() {
//    	lock.lock();
//    	try {
//    		count++; // thread-safe
//    	}finally {
//			lock.unlock();
//		}
//        
//    }
    
    //Lock lock = new ReentrantLock();
//    public synchronized void increment() {
//    	count++; // thread-safe
//    }
    
	  AtomicInteger count = new AtomicInteger(0);
	  
	  public void increment() {
		  count.incrementAndGet();	
	  }
}

public class WithoutAtomic {

	public static void main(String[] args) throws Exception{

	    Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count = "
                           + counter.count);

	}

}
