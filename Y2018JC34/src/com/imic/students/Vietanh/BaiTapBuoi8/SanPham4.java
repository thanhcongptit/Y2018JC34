package com.imic.students.Vietanh.BaiTapBuoi8;

public class SanPham4 implements Comparable<SanPham4> {
	private String name;
	private double giasp;
	private double giamgia;
	private String hang;
	
	public String getHang() {
		return hang;
	}

	public void setHang(String hang) {
		this.hang = hang;
	}

	public SanPham4() {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGiasp() {
		return giasp;
	}

	public void setGiasp(double giasp) {
		this.giasp = giasp;
	}

	public double getGiamgia() {
		return giamgia;
	}

	public void setGiamgia(double giamgia) {
		this.giamgia = giamgia;
	}

	public double ThueNhapKhau() {
		double thue = giasp * 10 / 100;
		return thue;
	}

	@Override
	public int compareTo(SanPham4 o) {
	return (int) (o.getGiasp()-this.getGiasp());
	}

	@Override
	public String toString() {
		return "name:"+getName()+"--------gia san pham:"+getGiasp()+"--------------Hang:"+getHang();
	}

	public SanPham4(String name, double giasp, double giamgia) {
		super();
		this.name = name;
		this.giasp = giasp;
		this.giamgia = giamgia;
	}

	public SanPham4(String name, double giasp) {
		super();
		this.name = name;
		this.giasp = giasp;
	}

	
	
}
