package com.imic.students.TruongQuangQuan.BaiTapBuoi10;

public abstract class KeThua_SvPoly {
	private String hoTen;
	private String nganh;

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	abstract public double getDiem();

	public String getHocLuc() {
		String hocLuc = "";
		if (getDiem() >= 9) {
			hocLuc = "Xuất sắc";
		} else if (getDiem() >= 7.5) {
			hocLuc = "Giỏi";
		} else if (getDiem() >= 6.5) {
			hocLuc = "Khá";
		} else if (getDiem() >= 5) {
			hocLuc = "TB";
		} else {
			hocLuc = "Yếu";
		}
		return hocLuc;
	}

	public void xuat() {
		System.out.println("Tên SV : " + this.hoTen);
		System.out.println("Ngành : " + this.nganh);
		System.out.println("Điểm : " + getDiem());
		System.out.println("Học lực : " + getHocLuc());
		System.out.println("-------------------------");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tên SV : " + this.hoTen + "Ngành : " + this.nganh + "Học lực : " + getHocLuc();
	}

}
