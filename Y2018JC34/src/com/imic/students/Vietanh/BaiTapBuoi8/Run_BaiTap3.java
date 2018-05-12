package com.imic.students.Vietanh.BaiTapBuoi8;

import java.util.Scanner;

public class Run_BaiTap3 {
	public static void main(String[] args) {
		// SanPham3 sp1 = new SanPham3("Bim Bim", 5000);   // Cách 1 : Không nhập từ bàn phím
		// sp1.xuat();
		// System.out.println("----------------");
		//
		// SanPham3 sp2 = new SanPham3("Sua", 7000, 10);
		// sp2.xuat();

		Scanner sc = new Scanner(System.in);  // cách 2: nhập từ bàn phím
		

		System.out.println("Xin moi nhap ten san pham");
		String name = sc.nextLine();
		System.out.println("Xin moi nhap gia:");
		double gia = sc.nextDouble();
		sc.nextLine();
		SanPham3 sp = new SanPham3(name, gia);
		sp.xuat();
		
		System.out.println("Xin moi nhap ten san pham");
		String name2 = sc.nextLine();
		System.out.println("Xin moi nhap gia:");
		double gia2 = sc.nextDouble();
		System.out.println("Xin moi nhap giam gia:");
		double giamgia2 = sc.nextDouble();
		SanPham3 sp2 = new SanPham3(name2, gia2, giamgia2);
		sp2.xuat();
	}
}
