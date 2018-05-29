package com.imic.students.TruongQuangQuan.BaiTapBuoi10;

public class KeThua_HinhVuong extends KeThua_HinhChuNhat {

	@Override
	public void xuat() {
		System.out.println("Thông tin Hình Vuông");
		System.out.println("Cạnh  = " + this.getDai());
		System.out.println("Chu vi = " + super.getChuVi());
		System.out.println("Diện tích = " + super.getDienTich());
	}
}
