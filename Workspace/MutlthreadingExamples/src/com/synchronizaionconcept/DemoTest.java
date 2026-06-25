package com.synchronizaionconcept;
class BookingApp implements Runnable{
	int avl =3;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		System.out.println(name+" planning to book the ticket");
		synchronized (this) {
			
	
		if(avl>0) {
			System.out.println(name+" got the ticket");
			avl = avl-1;
		}else {
			System.out.println(name+" sorry no ticket");
		}
		
		}
		System.out.println(name+" done");
	}
}

public class DemoTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookingApp ba1  = new BookingApp();		// heap avl=3
//		BookingApp ba2  = new BookingApp();		// heap avl=3
//		BookingApp ba3  = new BookingApp();		// heap avl=3
//		BookingApp ba4  = new BookingApp();		// heap avl=3
//		BookingApp ba5  = new BookingApp();		// heap avl=3
		Thread t1 = new Thread(ba1); t1.setName("Raj");
		Thread t2 = new Thread(ba1); t2.setName("Ravi");
		Thread t3 = new Thread(ba1); t3.setName("Ramesh");
		Thread t4 = new Thread(ba1); t4.setName("Rajesh");
		Thread t5 = new Thread(ba1); t5.setName("Raju");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
