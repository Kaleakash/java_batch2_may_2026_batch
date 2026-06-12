package com;

class MyResource implements AutoCloseable {
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("close method 1st Resource ");
	}
	void myBusinessMethod() {
		System.out.println("business method");
	}
}
class MyResource1 implements AutoCloseable {
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("close method 2st Resource ");
		throw new Exception();
	}
	void myBusinessMethod() {
		System.out.println("business method");
	}
}
public class AutoCloseableExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try(
				MyResource res = new MyResource();	
				MyResource1 res1 = new MyResource1();
				){
			
			res.myBusinessMethod();
			res1.myBusinessMethod();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
