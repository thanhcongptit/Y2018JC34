package com.imic.students.Vietanh.BtvnBuoi10;

public class HinhChuNhat_file2 {
	public double Chieudai;
	public double Chieurong;

	
	
	public HinhChuNhat_file2(double chieudai, double chieurong) {
		super();
		Chieudai = chieudai;
		Chieurong = chieurong;
	}

	public double getChuvi() {
		double chuvi = (Chieudai+Chieurong)*2;
		return chuvi;
	}
	
	public double getDientich() {
		double dientich = Chieudai*Chieurong;
		return dientich;
	}
	
	public void xuat() {
		System.out.println("Chieu dai la:"+Chieudai);
		System.out.println("Chieu rong la:"+Chieurong);
		System.out.println("Chu vi la:"+getChuvi());
		System.out.println("Dien tich la:"+getDientich());
	}
}
