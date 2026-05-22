package com.classandobjectconcept;
class Employee {
	
	public Employee() {
		System.out.println("memory created..");
	}
	void display() {
		System.out.println("Employee class method");
	}
}
public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();	// heap memory
		emp1.display();
		new Employee();
		new Employee().display();
		new Employee().display();
		Employee emp2 = new Employee();
		emp2.display();
		emp2.display();
		emp1 = null;
		
	}

}
