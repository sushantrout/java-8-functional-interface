package com.tech;

import java.util.List;
import java.util.function.Consumer;

public class ConsumeFunctionalTest {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeProvider.getEmployees().subList(0, 5);
		
		for (Employee employee : employees) {
			System.out.print(employee.getName()+"\t");
		}
		
		Consumer<List<Employee>> consumer = d -> {
			for (Employee employee : d) {
				employee.setName("Changed -" + employee.getName());
			}
		};
		
		
		System.out.println();
		consumer.accept(employees);
		
		//accept(T t)
		employees.stream().map(e -> e.getName()  +"\t").forEach(System.out::print);
		
		Consumer<List<Employee>> secondConsumer = d -> {
			for (Employee employee : d) {
				employee.setName("And Then -" + employee.getName());
			}
		};
		
		List<Employee> newEmployees = EmployeeProvider.getEmployees().subList(0, 5);
		
		//andThen(Consumer<? super List<Employee>> 
		Consumer<List<Employee>> andThenConsumer = consumer.andThen(secondConsumer);
		andThenConsumer.accept(newEmployees);
		
		System.out.println();
		
		newEmployees.stream().map(d -> d.getName()).forEach(System.out::print);
	}
}
