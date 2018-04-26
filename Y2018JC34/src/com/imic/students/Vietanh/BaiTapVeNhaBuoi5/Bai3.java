package com.imic.students.Vietanh.BaiTapVeNhaBuoi5;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Xin moi ban nhap so luong phan tu trong mang");
		String soluong = sc.nextLine();

		if (soluong.equals("")) {
			System.out.println("Ban chua nhap vui long nhap lai");
		} else {
			System.out.println("So luong phan tu trong mang: " + soluong);
		}

		int a[] = new int[Integer.parseInt(soluong)];
		for (int i = 0; i < Integer.parseInt(soluong); i++) {
			System.out.println("Xin moi nhap gia tri thu: " + i);
			a[i] = sc.nextInt();
		}

		System.out.println("Mang: " + Arrays.toString(a));
		System.out.println("------------------");

		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[0]) {
				min = a[i];
			} else {
				min = a[0];
			}
		}
		System.out.println("Gia tri nho nhat la:" + min);
		System.out.println("------------------");

		double tong = 0;
		int tongcacsole = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 3 == 0) {
				tong = tong + a[i];
				tongcacsole++;
			}
		}
		System.out.println("Trung binh cong: "+tong/tongcacsole);
	}

}
