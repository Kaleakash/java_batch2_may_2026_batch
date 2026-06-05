package com.copyvalues;
class Address {
	String city;

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

}
class Employee implements Cloneable{
	int id;
	String name;
	Address add;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
	// it work if class contains primitive property 

//	@Override
//	public Employee clone() throws CloneNotSupportedException {
//		return (Employee)super.clone();
//	}
	
	
    public Employee clone() throws CloneNotSupportedException {
        Employee copy = (Employee) super.clone();
        copy.add = new Address();		// new memory of address type and manually copy address values. 
        copy.add.city = this.add.city; 
        return copy;
    }

}
public class DemoTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Employee emp1 = new Employee();
//		emp1.id=100;
//		emp1.name="Raj";
//		Employee emp3 = new Employee();
//		emp3.id=101;
//		emp3.name="Ajay";
//		Employee emp2 = emp1;		// deep copy it copy value as well as reference. 
//		
//		System.out.println(emp1);
//		System.out.println(emp2);
//			emp2.name="Ravi";
//		System.out.println(emp1);
//		System.out.println(emp2);
//		System.out.println("-----");
//		System.out.println(emp3);	
//		Employee emp4 = emp3.clone();		// shallow copy : only copied values not reference. 
//		System.out.println("After clone created");
//		System.out.println(emp3);
//		System.out.println(emp4);
//			emp3.name="Ajay Kumar";
//		System.out.println(emp3);
//		System.out.println(emp4);
		
		Address add1 = new Address();
		add1.city="Bangalore";
		Employee emp1  = new Employee();
		emp1.id=100;
		emp1.name="Raj";
		emp1.add=add1;
		
		System.out.println(emp1);
		Employee emp2 = emp1.clone();
		System.out.println("After clone created");
		System.out.println(emp1);
		System.out.println(emp2);
			emp1.add.city="Mumbai";
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
