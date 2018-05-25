package com.imic.students.TruongQuangQuan.BaiTapBuoi10;

public class NhanVien {
	public String hoTen;
	public double luong;

	public NhanVien(String hoTen, double luong) {
		this.hoTen = hoTen;
		this.luong = luong;
	}


	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public double getThuNhap() {
		double thuNhap = this.luong;
		return thuNhap;
	}
	public void xuatThuNhap() {
		System.out.println(this.hoTen+" Thu Nhap : "+getThuNhap());
	}
}
