package com.imic.students.NguyenMinhQuan_Buoi4;

import java.util.Scanner;

public class Bai_tap_them_Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so a");
		int a = sc.nextInt();

		System.out.println("Nhap so b");
		int b = sc.nextInt();

		System.out.println("Nhap so c");
		int c = sc.nextInt();

		int ketqua1 = sc.nextInt();

		int delta = b ^ 2 - 4 * a * c;

		int nghiemkep = -b / (2 * a);

		double nghiemx1 = (-b + (Math.sqrt(delta))) / (2 * a);

		double nghiemx2 = (-b - (Math.sqrt(delta))) / (2 * a);
		if (a == 0) {

			if (b == 0) {

				if (c == 0) {
					System.out.println("Phuong trinh vo so nghiem");
				} else {
					System.out.println("Phuong trinh vo nghiem");

				}
			} else {
				System.out.println("Phuong trinh co nghiem : x=" + ketqua1);
			}
		}

		else {
			if (delta < 0) {

				System.out.println("PT vo nghiem");
			}

			else if (delta == 0) {
				System.out.println("PT co nghiem kep x= " + nghiemkep);
			}

			else {
				System.out.println("PT co 2 nghiem phan biet x1 = " + nghiemx1);
				System.out.println("PT co 2 nghiem phan biet x2 = " + nghiemx2);
			}

		}

	}

}
