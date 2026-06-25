package com.implementsrunnable;

class MyThread1 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			System.out.println("i "+i);
		}
	}
}
class MyThread2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int j=0;j<=10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class DemoTest {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		MyThread1 obj1 = new MyThread1();		
		MyThread2 obj2 = new MyThread2();
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		//t2.start();
		t1.join();
		t2.join();
		System.out.println("all child thread destroy");
	}

}
