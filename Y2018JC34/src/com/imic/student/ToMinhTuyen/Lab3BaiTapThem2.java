package com.imic.student.ToMinhTuyen;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3BaiTapThem2 {

	// Bai2. Viet chuong trinh nhap vao mot mang so nguyen có n phan tu
	// a. Xuat gia tri cac phan tu cua mang.
	// b. Tim phan tu co gia tri lon nhat, nho nhat.
	// c. Dem so phan tu la chan.
	// d. Tim cac phan tu la so nguyen to.
	// e. Sap xep mang tang dan.
	// f. Tim phan tu co gia tri x.

	public static void main(String[] args) {

		int n = 0;
		boolean check = true;
		Scanner scanner = new Scanner(System.in);
		// Nhap so luong phan tu cua mang va cac phan tu cua mang.

		System.out.println("Nhap so luong  phan tu cua mang");
		while (check) {
			try {
				n = scanner.nextInt();
				check = false;

			} catch (Exception e) {
				System.out.println("Ban Nhap sai moi ban nhap lai");
				scanner.nextLine();
				check = true;
			}
		}
		int a[] = new int[n];
		System.out.println("Nhap Cac phan tu cua Mang");
		for (int i = 0; i < a.length; i++) {
			while (!check) {

				try {
					System.out.println("a[" + i + "]");
					a[i] = scanner.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("Ban nhap sai Moi ban nhap lai");
					scanner.nextLine();
					check = false;
				}
			}
		}
		// a. xuat gia tri cac phan tu cua mang.
		System.out.println("Mang : " + Arrays.toString(a));

		// b. Tim phan tu co gia tri lon nhat, nho nhat.
		int min = a[0];
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
		}
		System.out.println("phan tu nho nhat cua mang la: " + min);
		System.out.println("phan tu lon nhat cua mang la: " + max);

		// c. Dem so phan tu la chan.
		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				dem++;
			}
		}
		System.out.println("So luong cac phan tu la so chan la:" + dem);

		// d. Tim cac phan tu la so nguyen to.
		
		for (int i = 0; i < a.length; i++) {
			int j = 2;
			int kiemtra = 0;
			while (j < a[i]) {
				kiemtra = a[i] % j;
				if (kiemtra != 0) {
					j++;
				} else {
					kiemtra = 0;
					break;
				}
			}
			if (kiemtra != 0) {
				System.out.printf(" phan tu a[" + i + "] = %d la so nguyen to", a[i]);
				System.out.println();
			} else {
				System.out.printf(" phan tu a[" + i + "] = %d khong phai la so nguyen to", a[i]);
				System.out.println();
			}

		}

		// e. Sap xep mang tang dan.
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

		}
		System.out.println("Mang tang dan: " + Arrays.toString(a));

		// f. Tim phan tu co gia tri x.
		int x = 0;
		int giatri = 0;
		boolean check2 = true;

		System.out.println("Nhap gia tri cho x");
		while (check2) {
			try {
				x = scanner.nextInt();
				check2 = false;
			} catch (Exception e) {
				System.out.println("Ban da nhap sai moi ban nhap lai");
				scanner.hasNextLine();
				check2 = true;
			}
		}
	
		System.out.print("Phan tu co gia tri " + x + " la phan tu: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				System.out.print(i+ ", ");
			}
		}
		System.out.println();
		
		
	}
}
