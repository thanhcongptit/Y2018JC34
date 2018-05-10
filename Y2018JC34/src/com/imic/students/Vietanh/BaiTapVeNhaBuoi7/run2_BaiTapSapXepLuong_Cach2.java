package com.imic.students.Vietanh.BaiTapVeNhaBuoi7;

import java.util.Arrays;
import java.util.Scanner;

public class run2_BaiTapSapXepLuong_Cach2 {
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
		}
		System.out.println("Truoc khi sap xep");
		for(Employee emp:e) {
			System.out.println(emp);
		}
		System.out.println("Sau khi sap xep");
		Arrays.sort(e);
		for(Employee emp:e) {
			System.out.println(emp);
	}
}
}