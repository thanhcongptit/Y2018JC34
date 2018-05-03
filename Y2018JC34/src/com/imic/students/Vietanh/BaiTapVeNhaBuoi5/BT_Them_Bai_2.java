package com.imic.students.Vietanh.BaiTapVeNhaBuoi5;

import java.util.Arrays;
import java.util.Scanner;

public class BT_Them_Bai_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 1 mang so nguyen voi n phan tu"); // cau a)
		int n = sc.nextInt();

		System.out.println("Xin moi nhap cac phan tu trong mang");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Mang: " + Arrays.toString(a));
		System.out.println("----------------------------");

		System.out.println("Max,Min");
		maxMin(n, a);
		System.out.println("----------------------------");

		System.out.println("Tong so chan");
		tongSoChan(n, a);
		System.out.println("----------------------------");

		System.out.println("So nguyen to trong mang");
		soNguyentoTrongmang(a);
		System.out.println("----------------------------");

		System.out.println("Sap xep");
		mangTangDan(n, a);
		System.out.println("----------------------------");

		System.out.println("Tim phan tu co gia tri x");
		System.out.println("Xin moi ban nhap gia tri x");
		int x = sc.nextInt();
		timGiaTriX(x, n, a);
		System.out.println("The end");

	}

	public static void maxMin(int n, int a[]) {
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == a[0]) {
				max = a[0];
			} else if (a[i] > a[0]) {
				max = a[i];
			}
		}
		System.out.println("Max: " + max);

		int min = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == a[0]) {
				min = a[0];
			} else if (a[i] < a[0]) {
				min = a[i];
			}
		}
		System.out.println("Min: " + min);
		System.out.println("-----------------------");

	}

	public static void tongSoChan(int n, int a[]) {
		int tongsochan = 0;
		System.out.println("Cac so chan la:");
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
				tongsochan++;
			}
		}
		System.out.println("Tong so chan la: " + tongsochan);

	}

	public static int dieukiensoNguyenTo(int b) {
		int flag = 1;
		int count = 0;
		for (int i = 1; i <= b; i++) {
			if (b % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			flag = 2;
		}
		return flag;
	}

	public static void soNguyentoTrongmang(int a[]) {
		for (int x : a) {
			if (dieukiensoNguyenTo(x) == 2) {
				System.out.println(x);
			}
		}

	}

	public static void mangTangDan(int n, int a[]) {
		System.out.print("Thu tu la: ");
		for (int i = 0; i <= n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int bien = a[i];
					a[i] = a[j];
					a[j] = bien;
				}
			}

			System.out.println(a[i]);
		}

	}

	public static void timGiaTriX(int x, int n, int a[]) {
		for (int i = 0; i < n; i++) {
			if (x == a[i]) {
				System.out.println("X nam o vi tri thu:" + i);
			} else {
				System.out.println("X khong nam o vi tri thu:" + i);
			}

		}
	}
}
