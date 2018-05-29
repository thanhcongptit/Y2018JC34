package com.imic.students.TruongQuangQuan.BaiTapBuoi10;

public class KeThua_HinhChuNhat {
	private double rong;
	private double dai;

	public double getRong() {
		return rong;
	}

	public void setRong(double rong) {
		this.rong = rong;
	}

	public double getDai() {
		return dai;
	}

	public void setDai(double dai) {
		this.dai = dai;
	}

	public double getChuVi() {
		double chuVi = (this.dai + this.rong) * 2;
		return chuVi;
	}

	public double getDienTich() {
		double dienTich = this.dai * this.rong;
		return dienTich;
	}

	public void xuat() {
		System.out.println("Thông tin HCN");
		System.out.println("Chiều rộng = " + this.rong);
		System.out.println("Chiều dài = " + this.dai);
		System.out.println("Chu vi = " + this.getChuVi());
		System.out.println("Diện tích = " + this.getDienTich());

	}
}
