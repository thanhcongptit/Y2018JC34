package com.imic.students.Vietanh.BaiTapBuoi8;

public class Run_bai1 {
	public static void main(String[] args) {
		SanPham1 sp = new SanPham1();

//		sp.tensp = "Bim bim";
//		sp.donGia = 5000;
//		sp.giamGia = 0;
//
//		sp.xuat();
		HocSinh hs = new HocSinh();
		HocSinh hs1 = new HocSinh();
		System.out.println("hs"+hs.getTenHS());
		System.out.println("hs1:"+hs.getTenHS());
		System.out.println("----------");
		
		hs.setTenHS("Loz");
		System.out.println("hs"+hs.getTenHS());
		System.out.println("hs1:"+hs.getTenHS());
			}
}
