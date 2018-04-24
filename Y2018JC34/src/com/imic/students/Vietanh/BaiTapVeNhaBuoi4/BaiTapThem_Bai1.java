package com.imic.students.Vietanh.BaiTapVeNhaBuoi4;

import java.util.Scanner;

public class BaiTapThem_Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Phuong trinh bac 1 : Ax+B=0");
		System.out.println("Xin moi nhap he so a de tinh");
		String a = sc.nextLine();
		System.out.println("Xin moi nhap he so b de tinh");
		String b = sc.nextLine();

		if (a.equals("") || b.equals("")) {
			System.out.println("Ban chua nhap gia tri vui long nhap");

		} else {
			if (a.equals("0")) {
				if (b.equals("0")) {
					System.out.println("Vo so nghiem");
				} else {
					System.out.println("Vo nghiem");
				}

			}else {
				int a1 = Integer.parseInt(a);
				int b1 = Integer.parseInt(b);
				System.out.println("Phuong trinh co nghiem duy nhat x= "+(-b1/a1));
				
			}
				
			}
		}

	}

