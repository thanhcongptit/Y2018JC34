package com.imic.students.Vietanh.BaiTapBuoi8;

public class SanPham3 {
	String tensp;
	double giasp;
	double giamgia;

	private double thueThuNhap() {
		double thue = giasp * 10 / 100;
		return thue;
	}
	
	

	public SanPham3(String tensp, double giasp, double giamgia) {
		super();
		this.tensp = tensp;
		this.giasp = giasp;
		this.giamgia = giamgia;

	}

	public SanPham3(String tensp, double giasp) {
		super();
		this.tensp = tensp;
		this.giasp = giasp;
	}

	public void xuat() {
		System.out.println("Ten san pham: " + tensp);
		System.out.println("Gia san pham: " + giasp);
		System.out.println("Giam gia: " + giamgia+"%");
		System.out.println("thue:" + thueThuNhap());
		
	}
}
