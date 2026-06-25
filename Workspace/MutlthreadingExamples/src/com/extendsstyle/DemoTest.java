package com.extendsstyle;

class MyThread1 extends Thread {
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		for(int i=0;i<=10;i++) {
			System.out.println("i "+i);
			try {
				Thread.sleep(500);
				System.out.println(t.getState());
			}catch(Exception e) {}
			
		}
	}
}
class MyThread2 extends Thread {
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		for(int j=0;j<=10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class DemoTest {

	public static void main(String[] args) throws Exception{
		Thread t = Thread.currentThread();
		System.out.println(t);
	MyThread1 obj1 = new MyThread1();
	MyThread2 obj2 = new MyThread2();	//obj1 and obj2 thread class references
	System.out.println(obj1.getState());
	obj1.start();
	obj2.start();   // ready to run : Runnable state 
	System.out.println(obj1.getState());
	obj1.join();
	System.out.println(obj1.getState());
	}

}
