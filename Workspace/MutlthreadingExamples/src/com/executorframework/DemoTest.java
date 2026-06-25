package com.executorframework;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class MyThread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Thread created using extends Thread style");
	}
}
class MyThread2 implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread created using implements Runnable style");
	}
}
class MyThread3 implements Callable<String>{
	@Override
	public String call() throws Exception {
		System.out.println("Thread created using implements Callable style");
		return "Callable Style thread creation";
	}
}
public class DemoTest {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		MyThread1 obj1 = new MyThread1();
//		obj1.start();
		
//		MyThread2 obj2 =new MyThread2();
//		Thread t2 = new Thread(obj2);
//		t2.start();
		
//		MyThread2 obj3 = new MyThread2();
//		Executor ex1 = Executors.newSingleThreadExecutor();
//		ex1.execute(obj3);		// we can use only Runnable reference. 
		
		MyThread2  obj4 = new MyThread2();		// runnable 
		MyThread3 obj5 = new MyThread3();		// callable 
		
		ExecutorService ex2 = Executors.newSingleThreadExecutor();
		ex2.submit(obj4);
	 	Future<String> ff = ex2.submit(obj5);
	 	System.out.println(ff.get());
	}

}
