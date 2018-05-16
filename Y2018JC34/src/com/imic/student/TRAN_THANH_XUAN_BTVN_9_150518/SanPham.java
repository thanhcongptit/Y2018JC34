package com.imic.student.TRAN_THANH_XUAN_BTVN_9_150518;

public class SanPham implements Comparable<SanPham> {

	private double giaSp;
	private String name;

	public double getGiaSp() {
		return giaSp;
	}

	public void setGiaSp(double giaSp) {
		this.giaSp = giaSp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(SanPham o) {
		// TODO Auto-generated method stub
		return (int) o.giaSp - (int) this.giaSp;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "   " + giaSp;
	}

}
