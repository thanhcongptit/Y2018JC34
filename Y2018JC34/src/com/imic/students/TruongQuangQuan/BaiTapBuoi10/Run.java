package com.imic.students.TruongQuangQuan.BaiTapBuoi10;

public class Run {

	public static void main(String[] args) {
		NhanVien nhanVien = new NhanVien("A", 500000);
		TruongPhong truongPhong = new TruongPhong("B",1000000,200000);
		LaoCong laoCong = new LaoCong("C",400000);
		nhanVien.xuatThuNhap();
		truongPhong.xuatThuNhap();
		laoCong.xuatThuNhap();
		
	}

}
