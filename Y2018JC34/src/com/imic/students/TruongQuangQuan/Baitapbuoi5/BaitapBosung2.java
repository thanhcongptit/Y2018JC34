package com.imic.students.TruongQuangQuan.Baitapbuoi5;

import java.util.Arrays;
import java.util.Scanner;

public class BaitapBosung2 {

	// Bài 2. Viết chương trình nhập vào một mảng số nguyên có n phần tử
	//
	// a) Xuất giá trị các phần tử của mảng.
	// b) Tìm phần tử có giá trị lớn nhất, nhỏ nhất.
	// c) Đếm số phần tử là số chẵn
	// d) Tìm các phần tử là số nguyên tố.
	// e) Sắp xếp mảng tăng dần
	// f) Tìm phần tử có giá trị x

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		boolean checkInput = true;
		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.print("mảng gồm số phần tử , n= ");
				n = sc.nextInt();
				checkInput = true;
			} catch (Exception e) {
				System.out.println("Bạn đã nhập sai kiểu dữ liệu, hãy nhập lại");
				sc.nextLine();
				checkInput = false;
			}
		} while (!checkInput);

		int i = 0;
		int[] a = new int[n];
		checkInput = true;

		do {
			try {
				while (i < n) {
					System.out.printf("số thứ %d = ", i + 1);
					a[i] = sc.nextInt();
					i++;
					checkInput = true;
				}
			} catch (Exception e) {
				System.out.println("Bạn đã nhập sai kiểu dữ liệu, hãy nhập lại");
				sc.nextLine();
				checkInput = false;
			}
		} while (!checkInput);

		// a) Xuất giá trị các phần tử của mảng.
		System.out.println("Mảng gốc : " + Arrays.toString(a));

		// b) Tìm phần tử có giá trị lớn nhất, nhỏ nhất.
		int max = a[0];
		int min = a[0];
		for (i = 1; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("Phần tử lớn nhất của mảng : " + max);
		System.out.println("Phần tử nhỏ nhất của mảng : " + min);

		// c) Đếm số phần tử là số chẵn
		int totalEven = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				totalEven++;
			}
		}
		System.out.printf("Mảng có %d số chẵn. %n", totalEven);

		// d) Tìm các phần tử là số nguyên tố.
		System.out.print("Các phần tử là số nguyên tố : ");
		for (int j = 0; j < a.length; j++) {
			int soNT = 0;
			for (int uocSo = 1; uocSo <= a[j]; uocSo++) {
				if (a[j] % uocSo == 0) {
					soNT++;
				}
			}
			if (soNT <= 2) {
				System.out.printf("a[%d]= %d, ", j, a[j]);
			}
		}
		System.out.println();

		// e) Sắp xếp mảng tăng dần
		Arrays.sort(a);
		System.out.println("Sắp xếp mảng theo thứ tự tăng dần : " + Arrays.toString(a));

		// f) Tìm phần tử có giá trị x
		System.out.print("Gía trị x = ");
		int x = sc.nextInt();
		System.out.printf("Phần tử có giá trị %d: ", x);
		for (int j = 0; j < a.length; j++) {
			if (a[j] == x) {
				System.out.printf("a[%d], ", j);
			}
		}
	}
}
