package com.imic.students.Vietanh.BaiTapBuoi8;

public class HocSinh {

	private String tenHS;
	private int tuoiHS;

	public HocSinh() {
	}

	public HocSinh(String tenHS, int tuoiHS) {

		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
	}

	public String getTenHS() {
		return tenHS;
	}

	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}

	public int getTuoiHS() {
		return tuoiHS;
	}

	public void setTuoiHS(int tuoiHS) {
		this.tuoiHS = tuoiHS;
	}

	@Override
	public String toString() {
		return "name"+tenHS+"------------tuoi:"+tuoiHS;
	}

}
