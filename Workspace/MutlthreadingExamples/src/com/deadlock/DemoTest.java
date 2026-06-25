package com.deadlock;

class Thread1 implements Runnable {
	String fname,lname;
	Thread1(String fname,String lname) {
		this.fname = fname;
		this.lname= lname;
	}
	@Override
	public void run() {
	
		synchronized (fname) {
			System.out.println(fname+" locked by thread1 ");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			synchronized (lname) {
				System.out.println(lname+" want to lock by thread1");
			}
			
			
		}
		
	}
}
class Thread2 implements Runnable {
	String fname,lname;
	Thread2(String fname,String lname) {
		this.fname = fname;
		this.lname= lname;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (fname) {
			System.out.println(fname+" locked by thread2");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (lname) {
				System.out.println(lname+" want to lock by thread2");
			}
		}
	}
}
public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = "Raj";
		String lname = "Deep";
		
		Thread1 thread1 = new Thread1(fname, lname);
		Thread2 thread2 = new Thread2(fname, lname);
		
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		t1.start();
		t2.start();
	}

}
