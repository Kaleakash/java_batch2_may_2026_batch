package com.objectclassmethods;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		Employee emp1 = new Employee(1, "Raj");
//		Employee emp2 = new Employee(1, "Raj");
//		Employee emp3 = emp1;
//		Employee emp4 = new Employee(2, "Ravi");
//		Employee emp5 = new Employee(2, "Ravi");
//		
//		
//		System.out.println(emp1.equals(emp2));
//		System.out.println(emp1.equals(emp3));
//		System.out.println(emp1.hashCode());
//		System.out.println(emp2.hashCode());
//		System.out.println(emp3.hashCode());
//		System.out.println(emp4.hashCode());
//		System.out.println(emp5.hashCode());
//		System.out.println(emp1);
//		Employee emp1 = new Employee(1, "Raj");
//		Employee emp2 = new Employee(2, "Ram");
//		Employee emp3 = emp1;		// it copy value as well as reference 
//		System.out.println(emp1);
//		System.out.println(emp2);
//		System.out.println(emp3);
//		emp1.setId(100);
//		System.out.println(emp1);
//		System.out.println(emp2);
//		System.out.println(emp3);
//		Employee emp4 = emp2.clone();		// shallow copy: only copy values not reference. 
//		System.out.println("after clone creation");
//		System.out.println(emp4);
//		System.out.println(emp2);
//		emp4.setId(200);
//		System.out.println(emp4);
//		System.out.println(emp2);
		Employee emp1 = new Employee(1, "Raj");
		System.out.println(emp1);
		emp1=null;
		System.gc();
		
	}
	

}
