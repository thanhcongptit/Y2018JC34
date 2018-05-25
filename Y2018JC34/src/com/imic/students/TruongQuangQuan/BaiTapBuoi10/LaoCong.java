package com.imic.students.TruongQuangQuan.BaiTapBuoi10;

public class LaoCong extends NhanVien {
public LaoCong(String hoTen, double luong) {
		super(hoTen, luong);
		// TODO Auto-generated constructor stub
	}

@Override
public double getThuNhap() {
	double thuNhap = luong/208;
	return thuNhap;
}
}
