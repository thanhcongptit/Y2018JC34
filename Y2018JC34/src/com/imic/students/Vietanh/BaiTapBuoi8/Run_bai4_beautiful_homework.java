package com.imic.students.Vietanh.BaiTapBuoi8;

import java.util.Scanner;

public class Run_bai4_beautiful_homework {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Xin moi nhap ten san pham");
		String name = sc.nextLine();
		System.out.println("Xin moi nhap gia:");
		double gia = sc.nextDouble();
		sc.nextLine();
		SanPham4 sp = new SanPham4(name, gia);
		sp.xuat();
		System.out.println("---------------------");
		
		System.out.println("Xin moi nhap ten san pham");
		String name2 = sc.nextLine();
		System.out.println("Xin moi nhap gia:");
		double gia2 = sc.nextDouble();
		System.out.println("Xin moi nhap giam gia");
		double giam2 = sc.nextDouble();
		SanPham4 sp2 = new SanPham4(name2, gia2, giam2);
		sp2.xuat();
		
		
		
	}
}
