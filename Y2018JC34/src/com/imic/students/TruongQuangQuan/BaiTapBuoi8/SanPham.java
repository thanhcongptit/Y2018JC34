package com.imic.students.TruongQuangQuan.BaiTapBuoi8;

import java.util.Scanner;

public class SanPham {
	private String name;
	private double price;
	private double sale;
	private double thueThuNhap;
	
	public SanPham() {
	}
	
	public SanPham(String name, double price, double sale) {
		this.name = name;
		this.price = price;
		this.sale = sale;
	}
	
	public SanPham(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getSale() {
		return sale;
	}
	
	public void setSale(double sale) {
		this.sale = sale;
	}
	
	private double importTax() {
		double tax=0;
		tax= getPrice()*0.1;
		return tax;			
	}
	
	public void showInfo() {
		System.out.println("Tên\t\t: "+this.name);
		System.out.println("Giá\t\t: "+this.price);
		System.out.println("Giảm Giá\t: "+this.sale);
		System.out.println("Thuế nhập khẩu\t: "+importTax());
	}
	
	private double getThueThuNhap() {
		return thueThuNhap;
	}

	private void setThueThuNhap(double thueThuNhap) {
		this.thueThuNhap = thueThuNhap;
	}
	
}
