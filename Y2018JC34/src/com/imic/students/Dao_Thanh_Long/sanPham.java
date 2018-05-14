package com.imic.students.Dao_Thanh_Long;

public class sanPham {
	private String tenSP;
	private double donGia;
	private double giamGia;
	private double thueNhapKhau;
	
	public sanPham(){	
	}
	
	public sanPham(String tenSP,double donGia,double giamGia){
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	
	public sanPham(String tenSP, double donGia){
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = 0;
	}
	
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
	public void setThueNhapKhau(double thueNhapKhau) {
		this.thueNhapKhau = thueNhapKhau;
	}
	
	private double getThueNhapKhau(){
		return this.donGia/10;
	}
	
	public void xuat(){
		System.out.println("Ten Sp :" + tenSP + ", Don gia : " + donGia + ", Giam gia : " + giamGia + ", Thue NK : " + getThueNhapKhau());
	}
	
	public void nhap(String tenSP,double donGia,double giamGia){
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	
	
	
}
