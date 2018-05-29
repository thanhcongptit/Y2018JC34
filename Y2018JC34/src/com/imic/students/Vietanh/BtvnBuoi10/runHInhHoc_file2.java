package com.imic.students.Vietanh.BtvnBuoi10;

public class runHInhHoc_file2 {
    public static void main(String[] args) {
		HinhChuNhat_file2 hcn = new HinhChuNhat_file2(50, 10);
		HinhChuNhat_file2 hcn2 = new HinhChuNhat_file2(4, 16);
		HinhVuong_file2 hv = new HinhVuong_file2(4, 4);
		
		hcn.xuat();
		System.out.println("----------");
		hcn2.xuat();
		System.out.println("----------");
		hv.xuat();
	}
}
