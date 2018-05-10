package com.imic.students.TruongQuangQuan.BaiTapBuoi7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Mảng có số phần tử n= ");
		int n = scanner.nextInt();
		scanner.nextLine();
		Employee employee[] = new Employee[n];

		for (int i = 0; i < employee.length; i++) {
			System.out.printf("Nhập employee %d : ", i + 1);
			employee[i] = new Employee();
			String name = scanner.nextLine();
			employee[i].setName(name);
			System.out.print("Lương : ");
			double salary = scanner.nextDouble();
			scanner.nextLine();
			employee[i].setSalary(salary);
		}

		System.out.println("Mảng chưa sắp xếp");
		for (int i = 0; i < employee.length; i++) {
			System.out.println((i + 1) + "," + employee[i].toString());
		}
		System.out.println("================================");

		for (int i = 0; i < employee.length; i++) {
			for (int j = i + 1; j < employee.length; j++) {
				if (employee[i].getSalary() < employee[j].getSalary()) {
					Employee temp = employee[i];
					employee[i] = employee[j];
					employee[j] = temp;
				}
			}
		}

		System.out.println("Mảng đã sắp xếp theo lương");
		for (int i = 0; i < employee.length; i++) {
			System.out.println((i + 1) + "," + employee[i].toString());
		}
		System.out.println("===============================");

		Arrays.sort(employee);

		System.out.println("Mảng đã sắp xếp theo tên");
		for (int i = 0; i < employee.length; i++) {
			System.out.println((i + 1) + "," + employee[i].toString());
		}
	}
}