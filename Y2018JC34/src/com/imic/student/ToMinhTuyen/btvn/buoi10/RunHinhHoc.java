package com.imic.student.ToMinhTuyen.btvn.buoi10;

public class RunHinhHoc {

	public static void main(String[] args) {
		ChuNhat chunhat1 = new ChuNhat(12, 15);
		ChuNhat chunhat2 = new ChuNhat(32, 47);
		ChuNhat vuong1 = new Vuong(18);

		chunhat1.xuat();
		chunhat2.xuat();
		vuong1.xuat();
	}

}
