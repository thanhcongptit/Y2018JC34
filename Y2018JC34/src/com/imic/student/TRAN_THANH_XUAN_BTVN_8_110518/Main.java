package com.imic.student.TRAN_THANH_XUAN_BTVN_8_110518;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SanPham sp = new SanPham();
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham();
//		System.out.println("------------------BAI 1------------------");
//		sp.input();
//		sp.output();
//
//		System.out.println("------------------BAI 2------------------");
//		System.out.println();
//		System.out.println("--------SP1--------");
//		sp1.input();
//		sp1.output();
//		System.out.println("--------SP2--------");
//		sp2.input();
//		sp2.output();

		System.out.println("------------------BAI 3------------------");

		SanPham sp3 = new SanPham("Dell", 20000, 500);
		SanPham sp4 = new SanPham("Asus", 30000);

		System.out
				.println("Ham tao 3 tham so: " + sp3.getTenSanPham() + " " + sp3.getDonGia() + " " + sp3.getGiamGia());
		
		System.out.println("Ham tao 2 tham so: " + sp4.getTenSanPham() + " " + sp4.getDonGia());
	}

}
