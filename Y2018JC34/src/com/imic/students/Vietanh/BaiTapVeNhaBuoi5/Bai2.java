package com.imic.students.Vietanh.BaiTapVeNhaBuoi5;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Xin moi nhap gia tri thu: " + i);
			a[i] = sc.nextInt();
		}

		System.out.println("Thu tu giam dan trong mang");

		for (int i = 0; i <= 9; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (a[i] < a[j]) {// gia su a[i] = 2; a[j] = 3

					int temp = a[i];// a[i] = 2 thi temp = 2
					a[i] = a[j]; // a[i] = 3
					a[j] = temp; // a[j] = 2
				}
			}

			System.out.println("a[" + i + "]:" + a[i]);
			
		}

	}
}
