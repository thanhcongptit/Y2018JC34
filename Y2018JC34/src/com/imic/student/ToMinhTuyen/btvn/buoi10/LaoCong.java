package com.imic.student.ToMinhTuyen.btvn.buoi10;

public class LaoCong extends NhanVien {
	
	private double sogiolamviec;
	public LaoCong (String hoten, double luong,double sogiolamviec) {
		super(hoten, luong);
		this.sogiolamviec = sogiolamviec;
	}
	


	public double getSogiolamviec() {
		return sogiolamviec;
	}



	public void setSogiolamviec(double sogiolamviec) {
		this.sogiolamviec = sogiolamviec;
	}



	@Override
	public double thunhap() {
		double thunhap = (this.luong /24/8)*sogiolamviec;
		return thunhap;
	}


	
	

}
