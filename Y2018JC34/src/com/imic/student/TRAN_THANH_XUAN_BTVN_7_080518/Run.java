package com.imic.student.TRAN_THANH_XUAN_BTVN_7_080518;

import java.util.Arrays;
import java.util.Scanner;



public class Run {
	static Employee emp = new Employee();
	static Scanner sc = new Scanner(System.in);
	static int numberEmp = sc.nextInt();
	static Employee employee[] = new Employee[numberEmp];

	public static void main(String[] args) {
		Input(numberEmp);
		Output(numberEmp);
		SortSaralyEmployee(numberEmp);
		SortNameEmployee(numberEmp);
	}

	public static void Input(int n) {

		sc.nextLine();
		for (int i = 0; i < n; i++) {
			employee[i] = new Employee();
			String nameEmp = sc.nextLine();
			employee[i].setName(nameEmp);

			int saralyEmp = sc.nextInt();
			employee[i].setSalary(saralyEmp);
			sc.nextLine();
		}
	}

	public static void Output(int n) {
		System.out.println("--------------------------");
		System.out.println("Danh sach NV va luong");
		for (int i = 0; i < n; i++) {
			System.out.println(employee[i].getName() + " ---- " + employee[i].getSaraly());

		}
	}

	public static void SortSaralyEmployee(int n) {
		Employee temp;
		System.out.println("--------------------------");
		System.out.println("Sort theo luong tang dan");
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++) {
				if (employee[i].getSaraly() > employee[j].getSaraly()) {
					temp = employee[i];
					employee[i] = employee[j];
					employee[j] = temp;

				}
			}
		for (int i = 0; i < n; i++) {
			System.out.println(employee[i].getName() + " " + employee[i].getSaraly());
			
		}

	}

	public static void SortNameEmployee(int n) {

		System.out.println("--------------------------");
		System.out.println("Sort ten NV theo abc");
		Arrays.sort(employee); // null pointer exception
		for (Employee emp : employee) {
			System.out.println(emp.toString());
		}
	}
}

