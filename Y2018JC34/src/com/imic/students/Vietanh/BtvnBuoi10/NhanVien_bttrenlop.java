package com.imic.students.Vietanh.BtvnBuoi10;

public class NhanVien_bttrenlop {
	public String name;
	public int luong;
	
	
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
