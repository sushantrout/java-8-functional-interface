package com.tech;

import java.util.List;
import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {

		List<Employee> employees = EmployeeProvider.getEmployees();
		
		Function<Employee, Integer> getAge = e -> e.getAge();
		Function<Employee, Integer> getId = e -> e.getId();
		
		Employee employee = employees.get(0);
		Integer age = getAge.apply(employee);
		System.out.println(age);
		
		Integer id = getId.apply(employee);
		System.out.println(id);
		
		
	}
}
