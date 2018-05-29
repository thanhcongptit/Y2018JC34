package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi10;

public class Lab6_Bai2_main {
	public static void main(String[] args) {
		try {
			Lab6_Bai2_SanPham sp = new Lab6_Bai2_SanPham();
			sp.input();
			sp.output();

		} catch (Exception a) {
			System.out.println("Moi ban nhap so");
		}
	}

}
