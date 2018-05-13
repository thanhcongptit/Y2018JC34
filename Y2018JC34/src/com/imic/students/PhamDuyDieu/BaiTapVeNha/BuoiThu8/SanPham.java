package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu8;

import java.util.Scanner;

/*
 * Tạo lớp SanPham gồm 3 thuộc tính là tên, giá và giảm giá. Lớp cũng gồm 2 phương thức là tính thuế nhập khẩu (10% giá sản phẩm) và xuất thông tin ra màn hình. Thông tin xuất ra màn hình gồm tat ca thong tin co. 
Nâng cấp lớp SanPham bằng cách bổ sung public cho các đặt tả truy xuất cho phương thức xuat() và private cho getThueThuNhap(). Đồng thời bổ sung 2 hàm tạo, hàm tạo thứ nhất gồm 3 tham số là tên, giá và giảm giá, hàm tạo thứ 2 gồm 2 tham số là tên và giá (ngầm hiểu không giảm giá).
 */
public class SanPham {
	private String ten;
	private double gia;
	private double giamgia;
	public SanPham() {
		super();
	}
	public SanPham(String ten, double gia) {
		super();
		this.ten = ten;
		this.gia = gia;
	}
	public SanPham(String ten, double gia, double giamgia) {
		super();
		this.ten = ten;
		this.gia = gia;
		this.giamgia = giamgia;
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
	public double getGiamgia() {
		return giamgia;
	}
	public void setGiamgia(double giamgia) {
		this.giamgia = giamgia;
	}
	private double tinhThue() {
		double thueSP = getGia()*10/100;		
		return thueSP;
	}
	public void xuat() {
		System.out.println("Tên sản phẩm: "+ getTen());
		System.out.println("Giá sản phẩm: "+ getGia());
		System.out.println("Giảm giá: "+ getGiamgia());
		System.out.println("Thuế sản phẩm: "+ tinhThue());		
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Tên sản phẩm: ");
		setTen(new Scanner(System.in).nextLine());
		System.out.print("Nhập giá sản phẩm:");
		setGia(new Scanner(System.in).nextDouble());
		System.out.print("Giảm giá: ");
		setGiamgia(new Scanner(System.in).nextDouble());
		
	}
}
