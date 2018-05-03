package com.imic.students.Vietanh.BaiTapVeNhaBuoi5;

import java.util.Scanner;

public class BT_Them_Bai_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Xin moi nhap so nguyen duong n: ");
		int n = sc.nextInt();

		System.out.println("Tinh tong");
		tinhTong(n);
		System.out.println("-----------------");

		System.out.println("Liet ke cac uoc so cua n");
		lietKeCacUocSoCuan(n);
		System.out.println("------------------");

		System.out.println("Liet ke cac uoc so la so nguyen to cua n");
		uocSoLaSoNguyenToCuaN(n);
		System.out.println("The end");
	}

	public static void tinhTong(int n) {

		int tong = 0;
		while (n > 0) {
			tong = tong + (n % 10);
			n = n / 10;
		}
		System.out.println("Tong la: " + tong);

	}

	public static void lietKeCacUocSoCuan(int n) {
		System.out.println("Cac uoc so cua n la: ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

	}

	public static boolean kiemTraSoNguyenTo(int n) {
		boolean flag = false;
		int biendem = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				biendem++;
			}
		}
		if (biendem == 2) {
			flag = true;
		}
		return flag;
	}

	public static void uocSoLaSoNguyenToCuaN(int k) {
		for (int j = 1; j <= k; j++) {
			if (k % j == 0 && kiemTraSoNguyenTo(j)) {
				System.out.println(j);

			}
		}
	}
}
