package com.imic.student.ToMinhTuyen.btvn.buoi10;

public class TruongPhong extends NhanVien {
	public double trachnhiem;
	
	public TruongPhong (String hoten, double luong, double trachnhiem) {
		super(hoten, luong);
		this.trachnhiem = trachnhiem;
	}
	
	public double getTrachnhiem() {
		return trachnhiem;
	}

	public void setTrachnhiem(double trachnhiem) {
		this.trachnhiem = trachnhiem;
	}

	@Override
	public double thunhap() {
	double thunhap = this.luong + trachnhiem;
		return thunhap;
	}


}
