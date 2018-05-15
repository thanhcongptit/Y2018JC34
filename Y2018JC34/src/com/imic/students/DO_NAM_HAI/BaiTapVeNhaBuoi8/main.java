package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi8;

public class main {
	public static void main(String[] args) {
		SanPham sp = new SanPham();
		
		sp.nhap();
		sp.xuat();
		
		
		SanPham sp3 = new SanPham("daugoidau",3000,50);
        SanPham sp4 = new SanPham("kemduongda",5000);
        System.out.println(sp3.toString());
        System.out.println("");
        System.out.println(sp4.toString());
	
		}
	}
