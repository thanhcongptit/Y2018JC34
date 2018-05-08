package com.imic.student.ToMinhTuyen;

import java.util.Scanner;

public class BaiTap4 {

	public static void main(String[] args) {

		int thang = 0;
		int nam = 0;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Moi Ban Nhap Thang");
			thang = sc.nextInt();
			if (thang > 12 || thang < 0) {
				System.out.println("Thang khong dung");
			}
			System.out.println("Moi Ban Nhap nam");
			nam = sc.nextInt();
			if (nam < 0) {
				System.out.println("Nam khong dung ");
			}
		} catch (Exception e) {
			System.out.println("ban da nhap sai  moi ban nhap lai");

		}

		System.out.println();

		int kiemtranam = nam % 400;
		switch (thang) {
		case 1:
			System.out.printf("Thang %d Nam %d co 31 ngay", thang, nam);
			break;
		case 3:
			System.out.printf("Thang %d Nam %d co 31 ngay", thang, nam);
			break;
		case 4:
			System.out.printf("Thang %d Nam %d co 30 ngay", thang, nam);
			break;
		case 5:
			System.out.printf("Thang %d Nam %d co 31 ngay", thang, nam);
			break;
		case 6:
			System.out.printf("Thang %d Nam %d co 30 ngay", thang, nam);
			break;
		case 7:
			System.out.printf("Thang %d Nam %d co 31 ngay", thang, nam);
			break;
		case 8:
			System.out.printf("Thang %d Nam %d co 31 ngay", thang, nam);
			break;
		case 9:
			System.out.printf("Thang %d Nam %d co 30 ngay", thang, nam);
			break;
		case 10:
			System.out.printf("Thang %d Nam %d co 31 ngay", thang, nam);
			break;
		case 11:
			System.out.printf("Thang %d Nam %d co 30 ngay", thang, nam);
			break;
		case 12:
			System.out.printf("Thang %d Nam %d co 31 ngay", thang, nam);
			break;

		default:
			if (kiemtranam == 0) {
				System.out.printf("Thang %d Nam %d co 29 ngay", thang, nam);

			} else {
				System.out.printf("Thang %d Nam %d co 28 ngay", thang, nam);
			}
			break;
		}

	}
}
