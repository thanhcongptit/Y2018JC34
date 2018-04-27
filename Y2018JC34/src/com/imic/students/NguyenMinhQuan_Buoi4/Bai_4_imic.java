package com.imic.students.NguyenMinhQuan_Buoi4;

import java.util.Scanner;

public class Bai_4_imic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap Thang :");
		int thang = sc.nextInt();
		System.out.println("Moi ban nhap nam :");
		int nam = sc.nextInt();
		System.out.println("Ket qua la :");

		switch (thang) {
		case 4:
			System.out.println("Thang co 30 ngay");
			break;

		case 6:
			System.out.println("Thang co 30 ngay");
			break;

		case 9:
			System.out.println("Thang co 30 ngay");
			break;

		case 11:
			System.out.println("Thang co 30 ngay");
			break;

		case 2:

			if ((nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0)) {
				System.err.println("Thang co 29 ngay");

			}
			break;

		default:
			System.out.println("Thang co 31 ngay");
			break;
		}

	}

}
