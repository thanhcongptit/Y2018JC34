//
//Viết chương trình liệt kệ các số nguyên có 7 chữ số thảo mãn: 
//a) Là số nguyên tố. 
//b) Là số thuận nghịch. 
//c) Mỗi chữ số đều là số nguyên tố. 
//d) Tổng các chữ số là số thuận nghịch.

package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi6;

import java.util.Arrays;

public class SoNguyen7ChuSo {
	public static void main(String[] args) {
		soNguyenTo();
		display();

	}

	public static void soNguyenTo() {
		System.out.print(" số nguyên tố là :");
		for (int i = 1000000; i < 10000000; i++) {
			int dem = 0;
			for (int j = 1; j < 10000000; j++) {
				if (i % j == 0) {
					dem++;

				}
			}
			if (dem <= 2) {
				System.out.print(i + ",");
			}

		}
	}

	public static boolean soThuanNghich(int n) {
		int tg = n;
		int temp = 0;
		while (n > 0) {
			temp = temp * 10 + n % 10;
			n /= 10;
		}
		if (temp == tg) {
			return true;
		}
		return false;
	}

	public static void display() {
		int dem = 0;
		for (int i = 1000000; i < 10000000; i++) {
			if (soThuanNghich(i)) {
				if (dem % 10 == 0) {
					System.out.println("");
				}
				dem++;
				System.out.println(" " + i);
			}
		}

	}

}