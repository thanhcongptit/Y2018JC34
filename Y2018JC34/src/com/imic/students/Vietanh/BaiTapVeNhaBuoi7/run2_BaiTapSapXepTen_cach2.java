package com.imic.students.Vietanh.BaiTapVeNhaBuoi7;

import java.util.Scanner;

public class run2_BaiTapSapXepTen_cach2 {
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
		for(int i=0;i<=emp.length-1;i++) {
			for(int j=i+1;j<emp.length;j++) {
				if(emp[i].getNAME().compareTo(emp[j].getNAME())>0) {
					Employee2 temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
				}
				System.out.println(emp[i]);
			}
		}
}
