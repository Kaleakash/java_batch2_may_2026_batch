package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		listOfEmployee.add(new Employee(2, "Raj", 45000,"IT"));
		listOfEmployee.add(new Employee(1, "Vikash", 35000,"Marketing"));
		listOfEmployee.add(new Employee(3, "Ajay", 38000,"HR"));
		listOfEmployee.add(new Employee(4, "Mahesh", 45000,"IT"));
		listOfEmployee.add(new Employee(5, "John", 48000,"HR"));
		//listOfEmployee.stream().forEach(e->System.out.println(e));
		//listOfEmployee.stream().sorted((e1,e2)->e2.getId()-e1.getId()).forEach(e->System.out.println(e));
//		listOfEmployee.stream().sorted((e1,e2)->(int)(e1.getSalary()-e2.getSalary())).forEach(e->System.out.println(e));
//	
//		List<String> names =
//			    listOfEmployee.stream().map(e->e.getName()).collect(Collectors.toList());
//		System.out.println(names);
		//listOfEmployee.stream().reduce(0,(e1,e2)->e1.getSalary()+e2.getSalary());
//		Employee maxSalaryEmp =
//			    listOfEmployee.stream()
//			           .max((e1, e2) -> 
//			                Double.compare(e1.getSalary(), e2.getSalary()))
//			           .get();
//
//			System.out.println(maxSalaryEmp.getName());

//			double totalSalary = listOfEmployee.stream()
//				    .reduce(
//				        0.0,
//				        (sum, emp) -> sum + emp.getSalary(),
//				        (s1, s2) -> s1 + s2
//				    );
//			System.out.println("sum salary "+totalSalary);
		
		
//		Map<String, List<Employee>> groupByDeptName =
//			    listOfEmployee.stream().collect(Collectors.groupingBy(e->e.getDeptName()));
//		System.out.println(groupByDeptName);
		
		//listOfEmployee.stream().forEach(e->System.out.println(e));
		
		//listOfEmployee.parallelStream().forEach(e->System.out.println(e));
		//listOfEmployee.stream().collect(Collectors.to)
		
		Map<Object, Long> groupBywithNumberOfEmp =
			    listOfEmployee.stream().collect(Collectors.groupingBy(e->e.getDeptName(),Collectors.counting()));
		System.out.println(groupBywithNumberOfEmp);
	}

}
