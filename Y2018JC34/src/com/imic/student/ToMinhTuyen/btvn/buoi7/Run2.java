package com.imic.student.ToMinhTuyen.btvn.buoi7;

import java.util.Scanner;
import java.util.Arrays;

public class Run2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Nhap so luong employee");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		
		Employee employee[] = new Employee[n];
	
		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			System.out.println("employee " + i);
			String name = scanner.nextLine();
			employee[i].setName(name);

			System.out.println("salary:");
			double salary = scanner.nextDouble();
			employee[i].setSalary(salary);
			scanner.nextLine();
		}
		System.out.println("Danh sach employee sau khi nhap:");
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i].toString());
		}

		System.out.println("Danh sach employee Sap xep theo ten giam dan");

		Arrays.sort(employee);
		for (int i = 0; i < employee.length; i++) {
			System.out.println(employee[i].toString());

		}

	}

}
