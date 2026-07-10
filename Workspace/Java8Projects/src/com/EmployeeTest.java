package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(new Employee(2, "Raj", 45000));
		listOfEmployee.add(new Employee(1, "Vikash", 35000));
		listOfEmployee.add(new Employee(3, "Ajay", 38000));
		//listOfEmployee.stream().forEach(e->System.out.println(e));
		//listOfEmployee.stream().sorted((e1,e2)->e2.getId()-e1.getId()).forEach(e->System.out.println(e));
		listOfEmployee.stream().sorted((e1,e2)->(int)(e1.getSalary()-e2.getSalary())).forEach(e->System.out.println(e));
	
		List<String> names =
			    listOfEmployee.stream().map(e->e.getName()).collect(Collectors.toList());
		System.out.println(names);
		//listOfEmployee.stream().reduce(0,(e1,e2)->e1.getSalary()+e2.getSalary());
		Employee maxSalaryEmp =
			    listOfEmployee.stream()
			           .max((e1, e2) -> 
			                Double.compare(e1.getSalary(), e2.getSalary()))
			           .get();

			System.out.println(maxSalaryEmp.getName());

	}

}
