package com.imic.students.Dao_Thanh_Long;

public class SanPham2 {
	private String tenSP;
	private double donGia;
	private String hang;
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
	public String getHang() {
		return hang;
	}
	public void setHang(String hang) {
		this.hang = hang;
	}
	
	public void nhap(String tenSP,double donGia,String hang){
		this.tenSP = tenSP;
		this.donGia = donGia;
		this.hang = hang;
	}
	
	public void xuat(){
		System.out.println("Ten SP : "+this.tenSP +" - Don gia = "+this.donGia + " - hang : "+this.hang);
	}
	
}
