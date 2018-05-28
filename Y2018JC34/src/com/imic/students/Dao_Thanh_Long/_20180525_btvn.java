package com.imic.students.Dao_Thanh_Long;

public class _20180525_btvn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TruongPhong tP = new TruongPhong();
		NhanVien nv = new NhanVien();
		LaoCong lc = new LaoCong();
		
//		tP.hoTen = "tp";
//		tP.luong = 100000;
		tP.input("tp", 100000);
		tP.trachNhiem = 23456;
		
//		nv.hoTen = "nv";
//		nv.luong = 1000;
		nv.input("nv",1000);		
		
//		lc.hoTen = "lc";
//		lc.luong = 500;
		lc.soGio = 20*8;
		lc.input("lc", 500);
		
		System.out.println("Ho ten : " +nv.hoTen +" luong = "+nv.getTN());
		System.out.println("Ho ten : " +tP.hoTen +" luong = "+tP.getTN());
		System.out.println("Ho ten : " +lc.hoTen +" luong = "+lc.getTN());
		
	}

}
