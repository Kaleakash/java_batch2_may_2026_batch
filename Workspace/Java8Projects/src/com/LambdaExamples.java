package com;

interface Calculator {
	public int add(int x, int y);
}
public class LambdaExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = (x,y)->x+y;
		System.out.println(c1.add(10, 20));
		Calculator c2 = (a,b)->a+b;
		System.out.println(c1.add(100, 200));
		Calculator c3 = (int x,int y)->x+y;
		System.out.println(c3.add(1, 2));
		Calculator c4 = (x,y)->{int sum = x+y;
		return sum;
		};
		System.out.println(c4.add(1000, 2000));
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread created.");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		Thread t1 = new Thread(()->System.out.println("Thread created using labmda"));
		t1.start();
		
		new Thread(()->System.out.println("Thread created using labmda")).start();
	}

}
