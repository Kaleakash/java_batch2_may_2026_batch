package com.waitandnotify;
class Task implements Runnable {
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
	String name = Thread.currentThread().getName();
	for(int i=0;i<=10;i++) {
		try {
		Thread.sleep(500);
		System.out.println(name+" "+i);
		if(i==5 && name.equals("Raj")) {
			wait();
		}
		if(i==5 && name.equals("Vikash")) {
			wait();
		}
		if(i==6 && name.equals("Ajay")) {
			notifyAll();
			//wait();
		}
		}catch(Exception e) {}
	}
	}
}

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task tt = new Task();
		Thread t1 = new Thread(tt,"Raj");
		Thread t2 = new Thread(tt,"Ajay");
		Thread t3 = new Thread(tt,"Vikash");
		t1.start();
		t2.start();
		t3.start();
	}

}
