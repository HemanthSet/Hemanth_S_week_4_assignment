package com.xenosis.proj;

import java.util.ArrayList;
import java.util.Scanner;

class Std {

	public String name;
	public int age;

	public Std(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Name: " + name + " Age: " + age; 
	}
}

public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Std> student = new ArrayList<>();
		int choice;

		do {
			System.out.println("1 to Add the Student.");
			System.out.println("2 to Remove the Student.");
			System.out.println("3 to Display the Student.");
			System.out.println("4 to Exit.");
			System.out.print("Choice: ");
			choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				System.out.print("Enter the Name: ");
				String name = sc.nextLine(); 
				System.out.print("Enter the Age: ");
				int age = sc.nextInt();
				sc.nextLine();
				student.add(new Std(name, age));
				System.out.println("Student added Successfully..\n");

			} else if (choice == 2) {
				System.out.print("Enter the Name to remove: ");
				String name = sc.nextLine();
				student.removeIf(s -> s.name.equals(name));
				System.out.println("Student removed successfully..\n");

			} else if (choice == 3) {
				if (student.isEmpty()) {
					System.out.println("No students to display..\n");
				} else {
					student.forEach(System.out::println);
					System.out.println();
				}

			} else if (choice == 4) {
				System.out.println("Exiting..");

			} else {
				System.out.println("Invalid input..\nTry again.\n");
			}
		} while (choice != 4);

		sc.close();
	}
}
