package com.imic.student.TRAN_THANH_XUAN_BTVN_7_080518;

import java.awt.im.InputContext;
import java.util.Arrays;
import java.util.Scanner;

public class Run {
	static Employee emp = new Employee();
	static Scanner sc = new Scanner(System.in);
	static int numberEmp = 0;
	static Employee employee[] = new Employee[30];

	public static void main(String[] args) {
		Run run = new Run();
		run.Input();
		run.Output();
		run.SortSaralyEmployee();
		run.SortNameEmployee();
	}

	public static void Input() {
		System.out.println("Nhap so nhan vien: ");
		numberEmp = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < numberEmp; i++) {
			employee[i] = new Employee();
			String nameEmp = sc.nextLine();
			employee[i].setName(nameEmp);

			int saralyEmp = sc.nextInt();
			employee[i].setSalary(saralyEmp);
			sc.nextLine();
		}
	}

	public static void Output() {
		for (int i = 0; i < numberEmp; i++) {
			System.out.println(employee[i].getName() + "----" + employee[i].getSaraly());
		}
	}

	public static void SortSaralyEmployee() {
		Employee temp;
		System.out.println("----------------------------------");
		System.out.println("Sort theo luong");
		for (int i = 0; i < numberEmp; i++)
			for (int j = i + 1; j < numberEmp; j++) {
				if (employee[i].getSaraly() > employee[j].getSaraly()) {
					temp = employee[i];
					employee[i] = employee[j];
					employee[j] = temp;

				}
			}
		for (int i = 0; i < numberEmp; i++) {
			System.out.println(employee[i].getName() + " " + employee[i].getSaraly());
		}

	}

	public static void SortNameEmployee() {

		System.out.println("--------------------------");
		System.out.println("Sort theo ten");
		Arrays.sort(employee); // null pointer exception
		for (Employee emp : employee) {
			System.out.println(emp.toString());
		}
	}
}
