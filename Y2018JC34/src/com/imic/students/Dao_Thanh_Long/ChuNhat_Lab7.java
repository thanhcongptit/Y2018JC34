package com.imic.students.Dao_Thanh_Long;

public class ChuNhat_Lab7 {
	protected double rong,dai;
	
	public double getRong() {
		return rong;
	}

	public void setRong(double rong) {
		this.rong = rong;
	}

	public double getDai() {
		return dai;
	}

	public void setDai(double dai) {
		this.dai = dai;
	}

	public ChuNhat_Lab7(double rong,double dai){
		this.rong = rong;
		this.dai = dai;
	}
	
	public void nhap(double rong,double dai){
		this.rong = rong;
		this.dai = dai;
	}
	
	public double getChuVi(){
		return (this.rong + this.dai);
	}
	
	public double getDienTich(){
		return (this.rong*this.dai);
	}
	
	public void xuat(){
		System.out.println("a = "+this.rong + ", b = "+this.dai+", C = "+getChuVi()+", S = "+getDienTich());
	}
}
