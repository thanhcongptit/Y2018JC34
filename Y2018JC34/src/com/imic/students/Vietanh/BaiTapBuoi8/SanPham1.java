package com.imic.students.Vietanh.BaiTapBuoi8;

public class SanPham1 {
	String tensp;
	double donGia;
	double giamGia;

	public double thuethunhap() {
		double thue = donGia * 10 / 100;
		return thue;
	}

	public  void xuat() {
		System.out.println("Ten san pham: " + tensp);
		System.out.println("donGia: " + donGia);
		System.out.println("giam gia: " + giamGia+"%");
		System.out.println("thue: " + thuethunhap());
	}

}
