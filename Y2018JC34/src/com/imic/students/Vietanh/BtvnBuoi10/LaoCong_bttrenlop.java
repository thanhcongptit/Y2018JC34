package com.imic.students.Vietanh.BtvnBuoi10;

public class LaoCong_bttrenlop extends NhanVien_bttrenlop {
	public int soGioLamViec;

	public LaoCong_bttrenlop(String name, int luong, int soGioLamViec) {
		super(name, luong);
		this.soGioLamViec = soGioLamViec;
	}

	@Override
	public double getThuNhap() {
		double thunhap = (luong*soGioLamViec);
		return thunhap;
		
	}

	@Override
	public void xuat() {
		
		super.xuat();
		System.out.println("So gio lam viec:"+soGioLamViec);
		System.out.println("Thu nhap:"+getThuNhap());
	}

	
}
