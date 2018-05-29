package com.imic.students.TruongQuangQuan.BaiTapBuoi10;

public class KeThua_SinhVienBiz extends KeThua_SvPoly {

	private double diemMarketing;
	private double diemSales;

	public double getDiemMarketing() {
		return diemMarketing;
	}

	public void setDiemMarketing(double diemMarketing) {
		this.diemMarketing = diemMarketing;
	}

	public double getDiemSales() {
		return diemSales;
	}

	public void setDiemSales(double diemSales) {
		this.diemSales = diemSales;
	}

	@Override
	public double getDiem() {
		double diemTB = (this.diemMarketing * 2 + this.diemSales) / 3;
		return diemTB;
	}

}
