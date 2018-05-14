package com.imic.student.ToMinhTuyen.btvn.buoi8;

import java.util.Scanner;

public class SanPham {
	private String tenSP;
	private double donGia;
	private double giamGia;

	public SanPham() {

	}

	public SanPham(String tenSP, double donGia, double giamGia) { // Ham tao 3 tham so
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	public SanPham(String tenSP, double donGia) { // Ham tao 2 tham so
		this.tenSP = tenSP;
		this.donGia = donGia;

	}

	public String getTenSP() { // Cac phuong thuc Getter + Setter
		return tenSP;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setTenSP(String tenSP) {

		this.tenSP = tenSP;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getGiamGia() {
		return giamGia;
	}

	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	public double thuenhapkhau(double donGia) {
		double thuenk = donGia * 10 / 100;

		return thuenk;
	}

	public void nhap() { // Phuong thuc Nhhap tu ban phim

		Scanner scanner = new Scanner(System.in);
		System.out.println(" San pham ");
		String tenSP = scanner.nextLine();
		setTenSP(tenSP);

		System.out.println("Gia San Pham ");
		double giaSP = scanner.nextDouble();
		setDonGia(giaSP);

		System.out.println("Giam gia % cua sp ");
		double giamGia = scanner.nextDouble();
		setGiamGia(giamGia);
		scanner.nextLine();
	}

	public void xuat() { // Phuong thuc xuat ra man hinh
		System.out.println("Ten San Pham: " + this.tenSP);
		System.out.println("Gia san pham: " + this.donGia);
		System.out.println("Giam gia: " + this.giamGia);
		System.out.println("Thue nhap khau: " + thuenhapkhau(this.donGia) + "%");
		System.out.println();

	}
}
