package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi4;

import java.util.Scanner;

public class BaiTapBoSung {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.println("        Bai tap bo sung        ");
		System.out.println(" +---------------------------+ ");
		System.out.println(" | 1 Giai Phuong Tring Bac 1 | ");
		System.out.println(" | 2 Giai Phuong Tring Bac 2 | ");
		System.out.println(" | 3 Tinh Tien Dien          | ");
		System.out.println(" | 4 Ket Thuc                | ");
		System.out.println(" +---------------------------+ ");
		System.out.print(  "     Ban chon bai tap nao   :  ");
		
		
		try {
		int chonSo = nhap.nextInt();
		double a, b, c;

		switch (chonSo) {
		case 1:
			System.out.println(" Giai Phuong Tring Bac 1 ");
			System.out.print("Moi ban nhap so a : ");
			a = nhap.nextDouble();
			System.out.print("Moi ban nhap so b : ");
			b = nhap.nextDouble();

			if (a == 0) {
				if (b == 0) {
					System.out.println("phuong trinh vo so nghiem");
				} else {
					System.out.println("phuong trinh vo nghiem");
				}
			} else {
				System.out.println("phuong trinh co nghiem = " + (-b / a));
			}
			break;

		case 2:
			System.out.println(" Giai Phuong Tring Bac 2 ");
			System.out.print("moiban nhap so a : ");
			a = nhap.nextDouble();
			System.out.print("moiban nhap so b : ");
			b = nhap.nextDouble();
			System.out.print("moiban nhap so c : ");
			c = nhap.nextDouble();
			double delta = Math.pow(b, 2) - 4 * a * c;

			if (a == 0) {
				if (b == 0) {
					if (c == 0) {
						System.out.println("phuong trinh co vo so nghiem");
					}
				} else {
					System.out.println("phuong trinh co nghiem = " + (-c / b));
				}
			} else {
				if (delta < 0) {
					System.out.println("phuong trinh vo nghiem ");
				} else if (delta == 0) {
					System.out.println("phuong trinh co nghiem kep = " + (-b / (2 * a)));
				} else {
					System.out.println("phuong trinh co nghiem" + ((-b + Math.sqrt(delta) / (2 * a))));
					System.out.println("phuong trinh co nghiem" + ((-b - Math.sqrt(delta) / (2 * a))));
				}
			}
			break;

		case 3:
			System.out.print(" so dien ban su dung thang nay la ");
			int SoDien = nhap.nextInt();

			if (0 <= SoDien && SoDien <= 50) {
				System.out.println("tien dien su dung thang ay la " + 1000 * SoDien + " dong ");

			} else {
				System.out.println("tien dien su dung thang ay la " + ((50 * 1000) + (SoDien - 50) * 1200) + " dong ");

			}
			break;

		case 4:
			System.out.println("Ket Thuc Chuong Trinh");
			break;

		default:
			System.out.println("Moi ban chon lai so");
			break;

		}
	}
		catch(Exception a) {
			System.out.println(" Moi ban nhap so ");
		}
	}
}
