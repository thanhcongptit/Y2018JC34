package com.imic.student.ToMinhTuyen.btvn.buoi10;

public class ChuNhat {
	public double chieudai;
	public double chieurong;

	public ChuNhat(double chieudai, double chieurong) {
		this.chieudai = chieudai;
		this.chieurong = chieurong;
	}

	public double getChieudai() {
		return chieudai;
	}

	public void setChieudai(double chieudai) {
		this.chieudai = chieudai;
	}

	public double getChieurong() {
		return chieurong;
	}

	public void setChieurong(double chieurong) {
		this.chieurong = chieurong;
	}

	public double dientich() {
		double dientich = getChieudai() * getChieurong();
		return dientich;
	}

	public double chuvi() {
		double chuvi = (getChieudai() + getChieurong()) * 2;
		return chuvi;
	}

	public void xuat() {
		System.out.printf("\n Hinh Chu Nhat \t Chieu Dai: %-5.1f \t Chieu rong: %-5.1f \t Dien tich: %-10.1f \t Chu vi: %-10.1f",getChieudai(),getChieurong(),dientich(), chuvi());
	}

}
