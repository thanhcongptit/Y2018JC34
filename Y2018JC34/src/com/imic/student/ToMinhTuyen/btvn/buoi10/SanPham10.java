package com.imic.student.ToMinhTuyen.btvn.buoi10;

import java.util.ArrayList;
import java.util.Scanner;

public class SanPham10 {
	private String tensp;
	private String hang;
	private double dongia;

	public String getTensp() {
		return tensp;
	}

	public void setTensp(String tensp) {
		this.tensp = tensp;
	}

	public String getHang() {
		return hang;
	}

	public void setHang(String hang) {
		this.hang = hang;
	}

	public double getDongia() {
		return dongia;
	}

	public void setDongia(double dongia) {
		this.dongia = dongia;
	}

	public void nhap(Scanner scanner, ArrayList<SanPham10> sanphamList) {
		while (true) {
			SanPham10 sanpham = new SanPham10();
			

			System.out.println("Nhap ten san pham: ");
			sanpham.tensp = scanner.nextLine();

			System.out.println("Nhap Hang san xuat");
			sanpham.hang = scanner.nextLine();
			
			System.out.println(" Nhap gia san pham");
			sanpham.dongia = scanner.nextDouble();
			scanner.nextLine();

			sanphamList.add(sanpham);

			System.out.println("Ban co muon nhap them san pham khac khong: Y/N");
			if (scanner.nextLine().equalsIgnoreCase("N")) {
				break;
			}

		}

	}

	@Override
	public String toString() {
		System.out.printf("\n Ten San Pham: %-20s \t Hang : %-20s \t Gia San Pham: %-10.1f VND", getTensp(), getHang(),
				getDongia());
		return " ";
	}

	public void xuat(ArrayList<SanPham10> sanphamList) {
		System.out.printf("\n Ten San Pham: %-20s \t Hang : %-20s \t Gia San Pham: %-10.1f VND", getTensp(), getHang(),
				getDongia());
	}
}
