package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu7;

public class SinhVien implements Comparable<SinhVien>{
	private String name;
	private int diem;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiem() {
		return diem;
	}
	public void setDiem(int diem) {
		this.diem = diem;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student name: "+name+" -------  Điểm: "+diem;
	}
	@Override
	public int compareTo(SinhVien o) {
		return o.diem - this.diem;
	}
	
}
