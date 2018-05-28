package com.imic.student.ToMinhTuyen.btvn.buoi10;

public class Run {

	public static void main(String[] args) {
		NhanVien nhanvien = new NhanVien("NV", 7000000);
		TruongPhong truongphong = new TruongPhong("TP", 9000000,1000000);
		LaoCong laocong = new LaoCong("LC", 5000000,150);
		
		nhanvien.xuat();
		truongphong.xuat();
		laocong.xuat();
		

	}

}
