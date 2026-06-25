package com.defaultthread;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		t.setPriority(10);
		t.setPriority(Thread.MIN_PRIORITY);
		//t.setPriority(11);
		System.out.println(t);
		String name = t.getName();
		int i = t.getPriority();
		ThreadGroup tg = t.getThreadGroup();
		System.out.println(name);
		System.out.println(t);
		System.out.println(tg);
	}

}
