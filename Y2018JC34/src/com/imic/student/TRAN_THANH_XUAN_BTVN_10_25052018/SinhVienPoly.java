package com.imic.student.TRAN_THANH_XUAN_BTVN_10_25052018;

import java.util.Scanner;

abstract class SinhVienPoly {
	private String nganhHoc;
	private String hoTen;

	public String getNganhHoc() {
		return nganhHoc;
	}

	public void setNganhHoc(String nganhHoc) {
		this.nganhHoc = nganhHoc;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	abstract double getDiem();

	public void NhapSV() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ten SV: ");
		String name = sc.nextLine();
		this.setHoTen(name);
		System.out.print("Chuyen nganh: ");
		String nganh = sc.nextLine();
		this.setNganhHoc(nganh);
	}

	public String getHocLuc() {
		String hocLuc = null;
		if (getDiem() < 5) {
			hocLuc = "Yeu";
		} else {
			if (5 <= getDiem() && getDiem() < 6.5) {
				hocLuc = "Trung Binh";
			} else {
				if (6.5 <= getDiem() && getDiem() < 7.5) {
					hocLuc = "Kha";
				} else {
					if (7.5 <= getDiem() && getDiem() < 9) {
						hocLuc = "Gioi";
					} else {
						hocLuc = "Xuat Sac";
					}
				}
			}
		}
		return hocLuc;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hoTen + " " + nganhHoc + " " + getDiem() + " " + getHocLuc();
	}

}
