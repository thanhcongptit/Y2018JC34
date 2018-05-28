package com.imic.student.ToMinhTuyen.btvn.buoi10;

public class Vuong extends ChuNhat {
	private double canh;
	public Vuong(double canh) {
	super(canh,canh);
		this.canh = canh;
	}

	public double getCanh() {
		return canh;
	}

	public void setCanh(double canh) {
		this.canh = canh;
	}

	public double dientich() {
		double dientich = canh*canh;
		return dientich;
	}
	public double chuvi() {
		double chuvi= canh*4;
		return chuvi;
	}
	@Override
	public void xuat() {
		System.out.printf("\n Hinh Vuong \t Canh: %-5.1f \t dien tich: %-10.1f \t Chu vi: %-10.1f",getCanh(),dientich(),chuvi());
		
	}
	
	

}
