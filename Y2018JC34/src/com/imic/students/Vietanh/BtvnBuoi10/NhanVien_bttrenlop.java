package com.imic.students.Vietanh.BtvnBuoi10;

public class NhanVien_bttrenlop {
	public String name;
	public int luong;
	
	
    @Override
	public String toString() {
		return "name:"+name+"-----luong:"+luong;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	public NhanVien_bttrenlop() {}
	public NhanVien_bttrenlop(String name, int luong) {
		super();
		this.name = name;
		this.luong = luong;
	}
	
	public double getThuNhap() {
		double thunhap = luong*30;
		return thunhap;
	}
	
	public void xuat() {
		System.out.println("name:"+name);
		System.out.println("Luong:"+luong);
		
		
	}

}
