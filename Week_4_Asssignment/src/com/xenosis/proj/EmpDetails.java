package com.xenosis.proj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
	private String name;
	private String department;
	private double salary;

	public Employee(String name, String department, double salary) {
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public String toString() {
		return "Employee [Name: " + name + ", Department: " + department + ", Salary: $" + salary + "]";
	}
}

public class EmpDetails {
	public static void main(String[] args) {

		Map<Integer, Employee> employeeMap = new HashMap<>();

		employeeMap.put(101, new Employee("Hemanth", "Engineering", 75000.00));
		employeeMap.put(102, new Employee("Aswin", "Marketing", 62000.00));
		employeeMap.put(103, new Employee("Arun Pandi", "HR", 58000.00));
		employeeMap.put(104, new Employee("Kaleeswaran", "Finance", 90000.00));

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee Id: ");
		int employeeId = s.nextInt();
		Employee emp = employeeMap.get(employeeId);
		if (emp != null) {
			System.out.println("Employee found: " + emp);
		} else {
			System.out.println("Employee with ID " + employeeId + " not found.");
		}
	}
}
