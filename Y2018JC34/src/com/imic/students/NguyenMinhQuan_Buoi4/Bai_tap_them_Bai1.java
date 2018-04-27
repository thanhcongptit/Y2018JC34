package com.imic.students.NguyenMinhQuan_Buoi4;

import java.util.Scanner;

public class Bai_tap_them_Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("------ Giai phuong trinh ax + b = 0 ---------");
		System.out.println("Nhap so a");
		int a = sc.nextInt();
		System.out.println("Nhap so b");
		int b =sc.nextInt();
		double ketqua =-b/a;
		if(a==0) {
			if(b==0) {
				System.out.println("Phuong trinh vo so nghiem");
			}
			else {
				System.out.println("Phuong trinh vo nghiem");
				
			}
		}
		else {
			System.out.println( "Phuong trinh co nghiem : x=" +ketqua);
		}
	}

}
