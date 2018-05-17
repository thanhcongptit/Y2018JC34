package com.imic.students.Vietanh.BaiTapBuoi9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BaiTapBuoi9_Bai1 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> hoten = new ArrayList<String>();
		NhapXuatDanhSach(hoten);
		System.out.println("------------");

		DanhSachNgauNhien(hoten);
		System.out.println("---------------");

		SapXep(hoten);
		System.out.println("-----------------");

		XoaTenTuBanPhim(sc, hoten);
		System.out.println();
		System.out.println("The end");

	}

	public static void NhapXuatDanhSach(ArrayList<String> hoten) {
		hoten.add("Anh");
		hoten.add("Cong");
		hoten.add("Loc");

		for (int i = 0; i < hoten.size(); i++) {
			String temp = hoten.get(i);
			System.out.println("i:" + temp);
		}
	}

	public static void DanhSachNgauNhien(ArrayList<String> hoten) {
		System.out.println("Ngau nhien:");
		for (int i = 0; i < hoten.size(); i++) {
			Collections.shuffle(hoten);
			String temp1 = hoten.get(i);
			System.out.println(temp1);
		}
	}

	public static void SapXep(ArrayList<String> hoten) {
		for (int i = 0; i < hoten.size(); i++) {
			Collections.sort(hoten);
		}
		System.out.println("Sap xep giam dan");
		for (int j = 0; j < hoten.size(); j++) {
			Collections.reverse(hoten);
			String temp2 = hoten.get(j);
			System.out.println(temp2);

		}
	}

	public static void XoaTenTuBanPhim(Scanner sc, ArrayList<String> hoten) {
		System.out.println("Nhap ten muon xoa trong mang");
		String name = sc.nextLine();
		for (int i = 0; i < hoten.size(); i++) {
			if (hoten.get(i).equalsIgnoreCase(name)) {
				hoten.remove(i);
			}
		}

		System.out.println();
		System.out.println("Sau khi xoa:");
		for (String x : hoten) {
			System.out.println(x);
		}
	}
}