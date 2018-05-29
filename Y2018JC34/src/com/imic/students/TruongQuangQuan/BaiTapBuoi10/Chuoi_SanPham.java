package com.imic.students.TruongQuangQuan.BaiTapBuoi10;

import java.util.Scanner;

public class Chuoi_SanPham {
	private String ten;
	private double gia;
	private String hang;
	
	
	public Chuoi_SanPham() {}
	
	public Chuoi_SanPham(String ten, double gia, String hang) {
		this.ten = ten;
		this.gia = gia;
		this.hang = hang;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public String getHang() {
		return hang;
	}
	public void setHang(String hang) {
		this.hang = hang;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tên sản phẩm : "+this.ten + " ---------Giá : "+this.gia;
	}
	
	
	

}
