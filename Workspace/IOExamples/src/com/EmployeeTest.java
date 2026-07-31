package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		Employee emp1 = new Employee(100, "Ravi", 12000);
//		System.out.println(emp1);
//		
//		FileOutputStream fos = new FileOutputStream("employee.ser");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(emp1);
//		System.out.println("object serialization done successfully");
//		
//		fos.close();
//		oos.close();
		
		FileInputStream fis = new FileInputStream("employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp2 = (Employee)ois.readObject();
		System.out.println(emp2);
	}

}
