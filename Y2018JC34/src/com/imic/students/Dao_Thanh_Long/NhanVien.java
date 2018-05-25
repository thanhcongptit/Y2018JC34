package com.imic.students.Dao_Thanh_Long;

public class NhanVien {
	public String hoTen;
	public int luong;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	
	public void input(String hoTen,int luong){
		this.hoTen = hoTen;
		this.luong = luong;
	}
	
	public int getTN(){
		return this.luong;
	}
}
