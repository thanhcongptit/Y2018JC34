package com.imic.student.ToMinhTuyen.btvn.buoi10;

abstract public class SinhVienPoLy {
	private String hoten;
	private String nganh;

	public SinhVienPoLy(String hoten, String nganh) {
		this.hoten = hoten;
		this.nganh = nganh;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	abstract public double getDiem();

	public String getHocluc() {
		if (getDiem() < 5) {
			return "Kem";
		} else if (5 <= getDiem() && getDiem() < 6.5) {
			return "Trung Binh";
		} else if (6.5 <= getDiem() && getDiem() < 7.5) {
			return "Kha";
		} else if (7.5 <= getDiem() && getDiem() < 9) {
			return "Gioi";
		}
		return "xuat Sac";
	}

	public void Xuat() {
		System.out.println("Ho ten: "+getHoten()+ " Nganh: "+ getNganh()+ " Hoc Luc: "+ getHocluc() );
	}
}
