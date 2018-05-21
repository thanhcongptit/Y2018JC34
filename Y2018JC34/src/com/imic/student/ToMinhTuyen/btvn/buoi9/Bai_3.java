package com.imic.student.ToMinhTuyen.btvn.buoi9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<SanPham2> sanpham = new ArrayList<SanPham2>();

		nhapsanpham(scanner, sanpham);
		sapxep(sanpham);
		xoasanpham(scanner, sanpham);
		giatrungbinh(sanpham);

	}

	public static void nhapsanpham(Scanner scanner, ArrayList<SanPham2> sanpham) {
		while (true) {
			SanPham2 sp = new SanPham2();

			System.out.println("Ten San pham ");
			String ten = scanner.nextLine();
			sp.setTensanpham(ten);

			System.out.println("Gia San Pham ");
			double gia = scanner.nextDouble();
			sp.setGiasanpham(gia);
			scanner.nextLine();
			sanpham.add(sp);

			System.out.println("Ban co muon nhap them san pham khong: Y/N");
			if (scanner.nextLine().equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.println("	Danh Sach San Pham:");
		for (SanPham2 temp : sanpham) {
			System.out.println(temp);
		}
		System.out.println("--------------------");
	}

	public static void sapxep(ArrayList<SanPham2> sanpham) {
		Collections.sort(sanpham);
		System.out.println("	Danh sach sau khi sap xep:");
		for (SanPham2 temp : sanpham) {
			System.out.println(temp);
		}
		System.out.println("---------------------");
	}

	public static void xoasanpham(Scanner scanner, ArrayList<SanPham2> sanpham) {
		System.out.println("Nhap Ten san pham can xoa:");
		while (true) {
			String name = scanner.nextLine();
			for (int i = 0; i < sanpham.size(); i++) {
				SanPham2 s = sanpham.get(i);
				if (s.getTensanpham().equalsIgnoreCase(name)) {
					sanpham.remove(i);
				}
			}
			System.out.println("Ban co muon Nhap them ten SP de xoa tiep: Y/N");
			if (scanner.nextLine().equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.println("	Danh sach sau khi xoa:");
		for (SanPham2 temp : sanpham) {
			System.out.println(temp);
		}
		System.out.println("---------------------");
	}

	public static void giatrungbinh(ArrayList<SanPham2> sanpham) {
		int dem = 0;
		double tonggia = 0;
		for (int i = 0; i < sanpham.size(); i++) {
			SanPham2 giasp = sanpham.get(i);
			tonggia = tonggia + giasp.getGiasanpham();
			dem++;
		}
		double giaTB = tonggia / dem;
		System.out.println("	Gia Trung Binh cua San Pham: " + giaTB);
		System.out.println("-------------------------");
	}

}
