package com.imic.student.TRAN_THANH_XUAN_BTVN_8_110518;

import java.util.Scanner;

public class SanPham {
	private String tenSanPham;
	private double donGia;
	private double giamGia;

	public SanPham() {
	}

	public SanPham(String tenSanPham, double donGia, double giamGia) {
		super();
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	public SanPham(String tenSanPham, double donGia) {
		super();
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;

	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public double getDonGia() {
		return donGia;
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

	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap ten sp:");
		String tenSP = sc.nextLine();
		setTenSanPham(tenSP);
		System.out.println("Nhap gia sp:");
		double gia = sc.nextDouble();
		setDonGia(gia);
		System.out.println("Nhap giam gia sp: ");
		double giam_gia = sc.nextDouble();
		setGiamGia(giam_gia);

	}

	public void output() {

		System.out.println("----------------------------");
		System.out.println("Ten sp: " + getTenSanPham());
		System.out.println("Gia sp: " + getDonGia());
		System.out.println("Giam gia: " + getGiamGia());
		System.out.println("Thue nhap khau: " + thueNhapKhau(getDonGia()) + "%");
	}

	private double thueNhapKhau(double giaSp) {
		double thueNK = giaSp * 0.1;
		return thueNK;
	}

}
