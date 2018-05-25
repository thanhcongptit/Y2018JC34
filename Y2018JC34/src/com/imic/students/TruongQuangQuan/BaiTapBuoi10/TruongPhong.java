package com.imic.students.TruongQuangQuan.BaiTapBuoi10;

public class TruongPhong extends NhanVien {
	public TruongPhong(String hoTen, double luong, double luongTrachNhiem) {
		super(hoTen, luong);
		this.luongTrachNhiem = luongTrachNhiem;
	}
	private double luongTrachNhiem;
	public double getLuongTrachNhiem() {
		return luongTrachNhiem;
	}
	public void setLuongTrachNhiem(double luongTrachNhiem) {
		this.luongTrachNhiem = luongTrachNhiem;
	}
	@Override
	public double getThuNhap() {
		double thuNhap = this.luong+ luongTrachNhiem;
		return thuNhap;
		
	}
}
