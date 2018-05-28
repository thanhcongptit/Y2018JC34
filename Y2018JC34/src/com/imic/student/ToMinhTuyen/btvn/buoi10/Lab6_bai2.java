package com.imic.student.ToMinhTuyen.btvn.buoi10;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab6_bai2 {

	public static void main(String[] args) {
		ArrayList<SanPham10> sanphamList = new ArrayList<SanPham10>();
		Scanner scanner = new Scanner(System.in);
		SanPham10 sanpham = new SanPham10();
		sanpham.nhap(scanner, sanphamList);
		
		sanpham.xuat(sanphamList);
		System.out.println("Danh sach san pham sau khi nhap:");
		for (SanPham10 sp : sanphamList) {
			System.out.println(sp);
		}
		System.out.println("---------------------------------");
		System.out.println("Danh sach san pham cua hang Nokia:");
		for (SanPham10 sp : sanphamList) {
			if (sp.getHang().equalsIgnoreCase("nokia")) {
				System.out.println(sp);
			}
		}
		System.out.println("---------------------------------");
	}

}
