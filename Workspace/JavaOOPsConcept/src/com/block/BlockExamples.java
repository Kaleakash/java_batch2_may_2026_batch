package com.block;
class Employee {
	{
		System.out.println("init block of employee ");
	}
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("employee object");
	}
	void disEmployee() {
		System.out.println("employee class method");
	}
	static {
		System.out.println("employee static block");
	}
}
public class BlockExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.disEmployee();
		emp1.disEmployee();
	}

}
