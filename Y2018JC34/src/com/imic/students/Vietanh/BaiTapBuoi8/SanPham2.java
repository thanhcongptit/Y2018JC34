package com.imic.students.Vietanh.BaiTapBuoi8;

import java.util.Scanner;

public class SanPham2 {
	 String SanPham;
	 double DonGia;
	 double giamgia;

	

	public double thueNhapKhau() {
		double thuenk = DonGia * 10 / 100;
		return thuenk;
	}

	@Override
	public String toString() {
		return "Ten san pham: "+SanPham+" ; gia san pham: "+DonGia+"; giam Gia:"+giamgia+"%" +"; thue nhap khau: "+thueNhapKhau();
			
	}


}
