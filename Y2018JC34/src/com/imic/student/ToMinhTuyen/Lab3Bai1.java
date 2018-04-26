package com.imic.student.ToMinhTuyen;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai1 {
	// 1. BTVN: Nhap vao 1 mang so nguyen, in ra tat cac so chan cua mang do

	public static void main(String[] args) {
		int soluong = 0;

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Moi ban nhap so luong cac phan tu");
			soluong = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Ban da nhap sai");
		}
		int a[] = new int[soluong];
		System.out.println("Nhap cac phan tu cua mang");
		for (int i = 0; i < soluong; i++) {
			System.out.println("Phan tu " + i);
			try {
				a[i] = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Ban da nhap sai");
			}
		}
		System.out.println("Mang : " + Arrays.toString(a));

		for (int temp : a) {
			if (temp % 2 == 0) {
				System.out.println("So Chan: " + temp + ",");
			}
		}

	}

}
