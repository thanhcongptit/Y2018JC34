package com.imic.students.Vietanh.BtvnBuoi10;

public class SinhVienBiz_file2 extends SinhVienpoly_file2 {
	public double sales;
	public double Marketing;
	public void xuat() {
		System.out.println("Thong tin sinh vien Biz");
		super.xuat();
	}

	

	public SinhVienBiz_file2(String name, String nghanhhoc, double Marketing,double sales) {
		super(name, nghanhhoc);
		this.Marketing = Marketing;
		this.sales = sales;
		
	}



	@Override
	public double getDiemTB() {
		double diemtb = (2*Marketing+sales)/3;
		return diemtb;
	}

	
	

}
