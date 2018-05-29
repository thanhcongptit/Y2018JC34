package com.imic.students.TruongQuangQuan.BaiTapBuoi10;

public class Chuoi_SinhVien {
	private String name;
	private String email;
	private String numberPhone;
	private String cmnd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumberPhone() {
		return numberPhone;
	}

	public void setNumberPhone(String numberPhone) {
		this.numberPhone = numberPhone;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name : "+this.name + "-----Email : "+this.email+"-----Sđt : "+this.numberPhone + "-----Số CMND : "+this.cmnd;
	}
}
