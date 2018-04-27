package com.imic.students.NguyenMinhQuan_Buoi4;

import java.util.Scanner;

public class Bai_5_imic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten :");
		String ten = sc.nextLine();

		System.out.println("Nhap tinh trang hon nhan :");
		String tinhtranghonnhan = sc.nextLine();
		System.out.println("Nhap gioi tinh :");
		String gioitinh = sc.nextLine();

		System.out.println("Nhap tuoi :");
		int tuoi = sc.nextInt();
		if (ten.equalsIgnoreCase("") || tuoi == 0 || tinhtranghonnhan.equalsIgnoreCase("")
				|| gioitinh.equalsIgnoreCase("")) {
			System.out.println("Ban chua nhap day du thong tin");
		}

		if (gioitinh.equalsIgnoreCase("nam") && tuoi >= 22 && tinhtranghonnhan.equalsIgnoreCase("chuacogiadinh")
				|| tinhtranghonnhan.equalsIgnoreCase("lyhon")) {
			System.out.println("Ban da duoc tham gia vao Cong Ty");
		}

		if (gioitinh.equalsIgnoreCase("nu") && tuoi >= 19 && tinhtranghonnhan.equalsIgnoreCase("chuacogiadinh")
				|| tinhtranghonnhan.equalsIgnoreCase("lyhon")) {
			System.out.println("Ban da duoc tham gia vao Cong Ty");
		}

		if (tuoi < 19) {
			System.out.println("Ban khong duoc tham gia");
		}
	}

}
