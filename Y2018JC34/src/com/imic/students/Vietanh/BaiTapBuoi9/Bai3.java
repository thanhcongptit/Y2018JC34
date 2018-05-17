package com.imic.students.Vietanh.BaiTapBuoi9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.imic.students.Vietanh.BaiTapBuoi8.SanPham4;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SanPham4> sanphamList = new ArrayList<SanPham4>();
		NhapSanPham(sc, sanphamList);
		System.out.println("-----------------");

		System.out.println("Sap xep");
		SapXep(sanphamList);
		System.out.println("-----------------");

		System.out.println("Xoa san pham theo ten");
		XoaTenSanPham(sc, sanphamList);
		System.out.println("-----------------");

		System.out.println("Tinh trung binh gia cua san pham");
		TrungBinhGia(sanphamList);
		System.out.println("The end");
	}

	public static void NhapSanPham(Scanner sc, ArrayList<SanPham4> sanphamList) {
		boolean check = true;
		while (check) {
			SanPham4 sp = new SanPham4();
			System.out.println("Xin moi nhap ten san pham");
			sp.setName(sc.nextLine());
			System.out.println("Xin moi nhap gia san pham");
			sp.setGiasp(sc.nextDouble());
			sc.nextLine();
			sanphamList.add(sp);
			System.out.println("-------------");

			System.out.println("Ban co muon nhap them san pham");
			System.out.println("Y or N");
			if (sc.nextLine().equalsIgnoreCase("N")) {
				check = false;
			}
		}
		System.out.println("Mang:");
		for (SanPham4 temp : sanphamList) {
			System.out.println(temp);
		}
	}

	public static void SapXep(ArrayList<SanPham4> sanphamList) {
		Collections.sort(sanphamList);
		for (SanPham4 x : sanphamList) {
			System.out.println(x);
		}
	}

	public static void XoaTenSanPham(Scanner sc, ArrayList<SanPham4> sanphamList) {

		System.out.println("Xin moi nhap ten san pham muon xoa");
		String name = sc.nextLine();
		for (int i = 0; i < sanphamList.size(); i++) {
			SanPham4 giatrimang = sanphamList.get(i);
			if (giatrimang.getName().equalsIgnoreCase(name)) {
				sanphamList.remove(i);
			}
		}
		System.out.println("Sau khi xoa:");
		for (int i = 0; i < sanphamList.size(); i++) {
			System.out.println(sanphamList.get(i));
		}

	}

	public static void TrungBinhGia(ArrayList<SanPham4> sanphamList) {
		double tong = 0;
		for (int i = 0; i < sanphamList.size(); i++) {
			SanPham4 x = sanphamList.get(i);
			double temp = x.getGiasp();
			tong = tong + temp;

		}
		double tbc = tong / (sanphamList.size());
		System.out.println("Tong la:" + tong);
		System.out.println("Gia trung binh:" + tbc);
	}
}
