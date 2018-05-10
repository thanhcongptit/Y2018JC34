package com.imic.students.Vietanh.BaiTapVeNhaBuoi7;

import java.util.Arrays;
import java.util.Scanner;

public class run_BaiTapSAPXEPTen_Cach1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Xin moi nhap so luong nhan vien");
		int n = sc.nextInt();
		sc.nextLine();
		
		Employee2 emp[] = new Employee2[n];
		
		for (int i = 0; i < n; i++) {
			emp[i] = new Employee2();
			System.out.println("Xin moi nhap name:");
			String name = sc.nextLine();
			emp[i].setNAME(name);

			System.out.println("Xin moi nhap luong:");
			int luong = sc.nextInt();
			emp[i].setSALARY(luong);
			System.out.println("------------------");
			sc.nextLine();

		}
		System.out.println("Truoc khi sap xep");
		for (Employee2 Emp : emp) {
			System.out.println(Emp.toString());
			System.out.println("-------------");

		}
		Arrays.sort(emp);
		System.out.println("Sau khi sap xep");
		for (Employee2 Emp : emp) {
			System.out.println(Emp.toString());
	}

}
}
