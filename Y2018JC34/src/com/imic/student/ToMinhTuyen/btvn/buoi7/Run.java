package com.imic.student.ToMinhTuyen.btvn.buoi7;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		System.out.println("Nhap so luong employee");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		Employee employee[] = new Employee[n];
		String name[] = new String[n];
		double salary[] = new double[n];

		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			System.out.println("employee " + i);
			name[i] = scanner.nextLine();
			employee[i].setName(name[i]);

			System.out.println("salary:");
			salary[i] = scanner.nextDouble();
			employee[i].setSalary(salary[i]);
			scanner.nextLine();
		}
		System.out.println("Danh sach employee sau khi nhap:");
		for (int i = 0; i < employee.length; i++) {
			System.out.println("Employee " + (i + 1) + ": " + employee[i].getName());
			System.out.println("Salary " + (i + 1) + ": " + employee[i].getSalary());
			System.out.println();
		}

		System.out.println("Danh sach employee Sap xep theo luong tang dan");
		for (int i = 0; i < employee.length; i++) {
			for (int j = i + 1; j < employee.length; j++) {
				if (employee[i].getSalary() > employee[j].getSalary()) {
					Employee emp = employee[i];
					employee[i] = employee[j];
					employee[j] = emp;
				}

			}

			System.out.println("Employee: " + employee[i].getName());
			System.out.println("Salary: " + employee[i].getSalary());
			System.out.println();
		}
		System.out.println("Danh sach employee Sap xep theo ten giam dan");
		for (int i = 0; i < employee.length; i++) {
			for (int j = i + 1; j < employee.length; j++) {
				if (employee[i].getName().compareTo(employee[j].getName()) > 0) {
					Employee emp = employee[i];
					employee[i] = employee[j];
					employee[j] = emp;

				}

			}
			System.out.println("Employee: " + employee[i].getName());
			System.out.println("Salary: " + employee[i].getSalary());
			System.out.println();
		}
		
		

	}
}