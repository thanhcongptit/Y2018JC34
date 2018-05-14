package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi8;

import java.util.Scanner;

public class SanPham {
	private String tenSp;
	private double donGia;
	private double giamGia;
	private double getThueNhapKhau;

	public String getTenSp() {
		return tenSp;
	}

	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
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

	public double getGetThueNhapKhau() {
		return getThueNhapKhau;
	}

	public void setGetThueNhapKhau(double getThueNhapKhau) {
		this.getThueNhapKhau = getThueNhapKhau;
	}

	public SanPham() {

	}

	public SanPham(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	public SanPham(String tenSp, double donGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
	}

	@Override
	public String toString() {
		return "SanPham [tenSp=" + tenSp + ", donGia=" + donGia + ", giamGia=" + giamGia + "]";
	}

	private double getThueNhapKhau() {
		getThueNhapKhau = this.donGia * 0.1;
		return getThueNhapKhau;
	}

	SanPham[] sanPham = new SanPham[2];

	public void nhap() {
		Scanner nhap = new Scanner(System.in);
		try {
			for (int i = 0; i < 2; i++) {
				sanPham[i] = new SanPham();
				System.out.print(" Tên sản phẩm  : ");
				this.tenSp = nhap.nextLine();
				sanPham[i].setTenSp(this.tenSp);
				System.out.print("Đơn giá : ");
				this.donGia = nhap.nextDouble();
				sanPham[i].setDonGia(this.donGia);
				System.out.print("Giảm giá : ");
				this.giamGia = nhap.nextDouble();
				sanPham[i].setGiamGia(this.giamGia);
				nhap.nextLine();
			}
		} catch (Exception a) {
			System.out.println(" Mời bạn nhập số ");
		}
	}

	public void xuat() {
		for (int i = 0; i < 2; i++) {
			System.out.println(sanPham[i].toString());
			System.out.println("Thuế nhập khẩu :" + sanPham[i].getThueNhapKhau());

		}
	}

}
