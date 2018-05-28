package com.imic.student.ToMinhTuyen.btvn.buoi10;

public class SinhVienBiz extends SinhVienPoLy {
	private double diemMaketing;
	private double diemSale;

	public SinhVienBiz(String hoten, String nganh, double diemMaketing, double diemSale) {
		super(hoten, nganh);
		this.diemMaketing = diemMaketing;
		this.diemSale = diemSale;
	}

	public double getDiemMaketing() {
		return diemMaketing;
	}

	public void setDiemMaketing(double diemMaketing) {
		this.diemMaketing = diemMaketing;
	}

	public double getDiemSale() {
		return diemSale;
	}

	public void setDiemSale(double diemSale) {
		this.diemSale = diemSale;
	}

	@Override
	public double getDiem() {
		double diemTB = (2 * getDiemMaketing() + getDiemSale()) / 3;
		return diemTB;
	}

}
