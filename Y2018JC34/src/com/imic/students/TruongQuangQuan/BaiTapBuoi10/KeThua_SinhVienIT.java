package com.imic.students.TruongQuangQuan.BaiTapBuoi10;

public class KeThua_SinhVienIT extends KeThua_SvPoly {
	private double diemJAVA;
	private double diemHTML;
	private double diemCSS;

	public double getDiemJAVA() {
		return diemJAVA;
	}

	public void setDiemJAVA(double diemJAVA) {
		this.diemJAVA = diemJAVA;
	}

	public double getDiemHTML() {
		return diemHTML;
	}

	public void setDiemHTML(double diemHTML) {
		this.diemHTML = diemHTML;
	}

	public double getDiemCSS() {
		return diemCSS;
	}

	public void setDiemCSS(double diemCSS) {
		this.diemCSS = diemCSS;
	}

	@Override
	public double getDiem() {
		double diemTB = (this.diemJAVA * 2 + this.diemHTML + this.diemCSS) / 4;
		return diemTB;
	}

}
