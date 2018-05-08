package com.imic.student.ToMinhTuyen;

import java.util.Scanner;

public class Lab3BaiTapThem1 {
	// 1.Viet chuong trinh nhap so nguyen duong n va thuc hien cac chuc nan sau:
	// a. Tinh tong cac chu so cua n.
	// b. Liet ke cac uoc so cua n.
	// c. Liet ke cac uoc so la nguyen to cua n.

	public static void main(String[] args) {

		int n = 0;
		boolean check = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so 1 nguyen duong bat ky");
		while (check) {
			try {
				n = scanner.nextInt();
				check = false;
			} catch (Exception e) {
				System.out.println("Ban nhap sai moi ban nhap lai");
				scanner.nextLine();
				check = true;
			}
		}
		// a. Tinh tong cac chu so cua n
		int tong = 0;
		int ketqua = n / 10;
		int du = n % 10;
		tong = tong + du;
		if (n < 10) {
			System.out.println("Tong cac chu so cua so nguyen n la: " + n);
		} else {
			do {
				du = ketqua % 10;
				ketqua = ketqua / 10;
				tong = tong + du;
				if (ketqua < 10) {
					tong = tong + ketqua;
				}
			} while (ketqua >= 10);
		}
		System.out.println("Tong cac chu so cua so nguyen n la: " + tong);

		// b. Liet ke cac uoc so cua n.

		System.out.print("Uoc so cua n la: ");
		for (int uoc = 1; uoc <= n; uoc++) {
			if (n % uoc == 0) {
				System.out.print(uoc + ",");

			}

		}
		System.out.println();
		// c. Liet ke cac uoc so la nguyen to cua n.
		System.out.printf("Uoc la so nguyen to: ");
		for (int uoc = 1; uoc <= n; uoc++) {
			if (n % uoc == 0) {
				int k = 0;
				for (int j = 1; j < uoc; j++) {
					if (uoc % j == 0)
						k++;
				}
				if (k < 2) {
					System.out.print(uoc + ",");
				}

			}
		}

	}
}