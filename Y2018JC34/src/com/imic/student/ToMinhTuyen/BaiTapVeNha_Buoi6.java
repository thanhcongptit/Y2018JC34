package com.imic.student.ToMinhTuyen;

import java.util.Scanner;
import java.util.Arrays;

public class BaiTapVeNha_Buoi6 {

	// Viet chuong trinh liet ke cac so nguyen co 7 chu so thoa man:
	// La so nguyen to
	// La so thuan nghich
	// Moi chu so deu la so nguyen to
	// Tong cac chu so la so thuan nghich

	public static void main(String[] args) {
		int i;

		System.out.println("So Nguyen to co 7 chu so thoa man tat ca cac dieu kien la:");

		for (i = 1000000; i <= 9999999; i++) {
			if ((songuyento(i)) && (sothuannghich(i)) && chusonguyento(i) && tongtn(i)) {

				System.out.print(i + ", ");

			}
		}
	}

	public static boolean songuyento(int n) { // Ham kiem tra so nguyen to

		int dem = 0;
		if (n < 2) {
			return false;
		}
		if (n > 2) {

			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					dem++;
				}
			}
		}
		if (dem >= 2) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean sothuannghich(int n) { // Ham kiem tra so thuan nghich
		int m = n;
		int tn = 0;

		while (n > 0) {
			tn = (tn * 10) + (n % 10);
			n = n / 10;
		}
		if (m == tn) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean chusonguyento(int n) { // Ham kiem tra cac chu so co phai la so nguyen to
		int csnt = 0;
		while (n > 0) {
			csnt = n % 10;
			n = n / 10;
		}

		return songuyento(csnt);
	}

	public static boolean tongtn(int n) { // Ham kiem tra tong cac chu so co phai la so thuan nghich
		int tong = 0;
		while (n > 0) {
			tong = tong + n % 10;
			n = n / 10;
		}
		return sothuannghich(tong);
	}
}
