package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi10;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab6_Bai2_SanPham {
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
	
	
	@Override
	public String toString() {
		return "Lab6_Bai2_SanPham [tenSP=" + tenSP + ", donGia=" + donGia + ", hang=" + hang + "]";
	}


	Scanner nhap = new Scanner(System.in);
	ArrayList<Lab6_Bai2_SanPham> SanPham = new ArrayList<Lab6_Bai2_SanPham>();
	
	public void input() {
		for(int i=0 ;i<3 ;i++) {
		Lab6_Bai2_SanPham sp = new Lab6_Bai2_SanPham();
		System.out.print("ten san pham : " );
		sp.tenSP=nhap.nextLine();
		System.out.print("hang : ");
		sp.hang=nhap.nextLine();
		System.out.print("don gia : ");
		sp.donGia=nhap.nextDouble();
		nhap.nextLine();
		
		SanPham.add(sp);
		
	}
	}
	
	public void output() {
		for(int i=0 ;i<3 ;i++) {
		if(SanPham.get(i).hang.equalsIgnoreCase("Nokia")) {
		System.out.println(SanPham.get(i).toString());
		}
		
	}
	}

}
