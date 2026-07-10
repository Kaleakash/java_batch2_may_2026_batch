package com;
interface Hello {
	public void sayHello(String name);
}
class HelloImp implements Hello {
	@Override
	public void sayHello(String name) {
	System.out.println("Provided the body using separate class");	
	}
}
public class LamdaSimpleExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st way 
			Hello obj1 = new HelloImp();
			obj1.sayHello("Raj");
			
	// 2nd way : anonymous class (non static inner class, static inner class, anonymous class, local method class etc)
	
			Hello obj2 = new Hello() {
				@Override
				public void sayHello(String name) {
					// TODO Auto-generated method stub
					System.out.println("Provided the body using anonymous class - 1st way");	
				}
			};
			obj2.sayHello("Raj");
			
			Hello obj3 = new Hello() {
				@Override
				public void sayHello(String name) {
					// TODO Auto-generated method stub
					System.out.println("Provided the body using anonymous class - 2nd way");	
				}
			};
			obj3.sayHello("Raj");
			
			// 3rd way using lambda 
			
			Hello obj4 = (name)->System.out.println("provided body for sayHello method using lambda");
			obj4.sayHello("Raj");
	}
	

}
