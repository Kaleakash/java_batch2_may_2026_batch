package com;

public class ExceptionProgationExamples {

	static void method1() throws Exception{
		//try {
		int result = 100/0;
		//}catch(Exception e) {}
		System.out.println("method 1");
	}
	static void method2() throws Exception{
		//try {
		method1();
		//}catch(Exception e) {}
		System.out.println("method 2");
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//try {
		method2();
		//}catch(Exception e) {}
		System.out.println("main method");
	}

}
