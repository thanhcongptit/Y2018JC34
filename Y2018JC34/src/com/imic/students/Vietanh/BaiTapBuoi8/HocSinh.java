package com.imic.students.Vietanh.BaiTapBuoi8;

public class HocSinh {

	private String tenHS;
	private int tuoiHS;
	private String email;
	private String phoneNumber;
	private String CMND;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCMND() {
		return CMND;
	}

	public void setCMND(String cMND) {
		CMND = cMND;
	}

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
		return "name:"+tenHS+"----email:"+email+"----So dien thoai:"+phoneNumber+"----CMND:"+CMND;
	}

}
