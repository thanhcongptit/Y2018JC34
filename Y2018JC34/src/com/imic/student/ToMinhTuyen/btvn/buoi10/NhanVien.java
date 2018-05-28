package com.imic.student.ToMinhTuyen.btvn.buoi10;

public class NhanVien {
	public String hoten;
	public double luong;

	public NhanVien(String hoten, double luong) {
		this.hoten = hoten;
		this.luong = luong;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public double thunhap() {
		double thunhap = this.luong;
		return thunhap;
	}

	public void xuat() {
		
		System.out.printf("\n Ho ten: %-20s \t Luong: %-10.1f \t Thu Nhap: %-10.1f", getHoten(), getLuong(),thunhap());
	}

}
