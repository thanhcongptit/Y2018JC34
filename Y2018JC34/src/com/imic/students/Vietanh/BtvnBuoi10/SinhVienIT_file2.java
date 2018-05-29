package com.imic.students.Vietanh.BtvnBuoi10;

public class SinhVienIT_file2 extends SinhVienpoly_file2 {
	public double diemjava;
	public double diemcss;
	public double diemhtml;

	public SinhVienIT_file2(String name, String nghanhhoc, double diemjava, double diemcss, double diemhtml ) {
		super(name, nghanhhoc);
		this.diemjava = diemjava;
		this.diemcss = diemcss;
		this.diemhtml = diemhtml;
	}

	@Override
	public void xuat() {
		System.out.println("Thong tin sinh vien IT");
		super.xuat();
	}

	@Override
	public double getDiemTB() {
       double diemTb = (2*diemjava+diemhtml+diemcss)/4;
       return diemTb;
	}

}
