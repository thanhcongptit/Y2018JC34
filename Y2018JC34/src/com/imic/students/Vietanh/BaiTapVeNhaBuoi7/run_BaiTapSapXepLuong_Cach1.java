package com.imic.students.Vietanh.BaiTapVeNhaBuoi7;

import java.util.Scanner;

public class run_BaiTapSapXepLuong_Cach1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e[] = new Employee[3];

		for (int i = 0; i < 3; i++) {
			e[i] = new Employee();
			System.out.println("Xin moi nhap name:");
			String name = sc.nextLine();
			e[i].setName(name);

			System.out.println("Xin moi nhap Salary");
			int salary = sc.nextInt();
			e[i].setSalary(salary);
			sc.nextLine();

			System.out.println(e[i].toString());
			System.out.println("-------------");

		}
		System.out.println("Truoc khi sap xep");
		for (Employee emp : e) {
			System.out.println(emp);
			
		}
		System.out.println("-------------");
		System.out.println("Sau khi sap xep");
		for (int i = 0; i <= 2; i++) {
			for (int j = i + 1; j < 3; j++) {
				if (e[i].getSalary() < e[j].getSalary()) {
					Employee temp = e[i];
					e[i] = e[j];
					e[j] = temp;

				}
			}

			System.out.println(e[i]);
		}

	}
}
