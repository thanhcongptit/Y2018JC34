package com.imic.students.Vietanh.BaiTapBuoi8;

import java.util.Scanner;

public class Run_bai2_2SanPham {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SanPham2 sp[] = new SanPham2[2];
		for (int i = 0; i < 2; i++) {
			sp[i] = new SanPham2();
			System.out.println("San pham thu: " + (i + 1));
			System.out.println("Xin moi nhap ten san pham");
			String name = sc.nextLine();
			sp[i].SanPham = name;

			System.out.println("Xin moi nhap don gia");
			double dongia = sc.nextDouble();
			sp[i].DonGia = dongia;

			System.out.println("Xin moi nhap giam gia");
			double giamgia = sc.nextDouble();
			sp[i].giamgia = giamgia;
			sc.nextLine();

			System.out.println("------------------");

		}
		
		for(SanPham2 spham:sp) {
			System.out.println(spham.toString());
		}
	}
}
