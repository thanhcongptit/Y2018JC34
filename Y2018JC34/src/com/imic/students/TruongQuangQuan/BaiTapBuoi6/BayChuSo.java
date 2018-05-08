package com.imic.students.TruongQuangQuan.BaiTapBuoi6;

public class BayChuSo {
	// Viết chương trình liệt kệ các số nguyên có 7 chữ số thảo mãn:
	// a) Là số nguyên tố.
	// b) Là số thuận nghịch.
	// c) Mỗi chữ số đều là số nguyên tố.
	// d) Tổng các chữ số là số thuận nghịch.

	public static void main(String[] args) {

		// a) Là số nguyên tố.
		System.out.print("Các số có 7 chữ số là số nguyên tố: ");
		for (int i = 1000001; i < 10000000; i+=2) {
			if (soNguyenTo(i)) {
				System.out.print(i + ",");
			}
		}
		System.out.println();

		// b) Là số thuận nghịch.
		System.out.print("Các số có 7 chữ số là sô thuận nghịch : ");
		for (int i = 1000000; i < 10000000; i++) {
			if (soThuanNghich(i)) {
				System.out.print(i + ",");
			}
		}
		System.out.println();

		// c) Mỗi chữ số đều là số nguyên tố.
		System.out.print("Các số có 7 chữ số mà mỗi chữ số đều là số nguyên tố: ");
		for (int i = 1000000; i < 10000000; i++) {
			int count = 0;
			int j = i;
			while (j > 0) {
				int k = j % 10;
				if (soNguyenTo(k)) {
					count++;
				}
				j = j / 10;
			}
			if (count == 7) {
				System.out.print(i + ",");
			}
		}
		System.out.println();

		// d) Tổng các chữ số là số thuận nghịch.
		System.out.print("Các số nguyên có 7 chữ mà tổng các chữ số là số thuận nghịch:");
		for (int i = 1000000; i < 10000000; i++) {
			int j = i;
			int total = 0;
			while (j > 0) {
				int k = j % 10;
				total += k;
				j = j / 10;
			}
			if (soThuanNghich(total)) {
				System.out.print(i + ",");
			}
		}
	}

	public static boolean soThuanNghich(int i) {
		int j = i;
		int count = 0;
		while (j > 0) {
			j = j / 10;
			count++;
		}
		int a[] = new int[count];
		int k1 = i;
		for (int k = 0; k < a.length; k++) {
			a[k] = k1 % 10;
			k1 = k1 / 10;
		}
		for (int k = 0; k < a.length / 2; k++) {
			if (a[k] != a[a.length - k - 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean soNguyenTo(int i) {
		if (i<2) {
			return false;
		}
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

}
