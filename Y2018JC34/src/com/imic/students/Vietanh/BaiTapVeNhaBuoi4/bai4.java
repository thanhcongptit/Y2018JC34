package com.imic.students.Vietanh.BaiTapVeNhaBuoi4;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Xin moi ban nhap thang: ");
		int thang = 0;
		try {
			thang = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Ban da nhap sai, vui long thu lai");
			e.printStackTrace();
		}
		System.out.println("Thang ban chon la: " + thang);

		System.out.println("Xin moi ban nhap nam");
		int nam = 0;
		try {
			nam = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Ban da nhap sai, vui long thu lai");
			e.printStackTrace();
		}
		System.out.println("Nam ban chon la: " + nam);

		if (thang == 0) {
			System.out.println("Ban dang sai thang, vui long nhap lai");
		} else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
			System.out.println("Co 30 ngay");

		} else if (thang == 2 && nam % 400 == 0) {
			System.out.println("Day la nam nhuan co 29 ngay");

		} else if (thang == 2 && nam % 400 != 0) {
			System.out.println("Co 28 ngay");
		} else {
			System.out.println("Co 31 ngay");
		}

	}
}
