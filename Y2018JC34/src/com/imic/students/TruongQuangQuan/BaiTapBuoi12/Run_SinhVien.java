package com.imic.students.TruongQuangQuan.BaiTapBuoi12;

import java.util.InputMismatchException;

public class Run_SinhVien {
	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		try {
			sv.input();
		} catch (InputMismatchException e) {
			System.out.println("Bạn đã nhập sai kiểu dữ liệu, hãy nhập lại");
			sv.input();
		}
		sv.getXepLoai();
		System.out.println(sv);

	}
}
