package com.imic.students.Vietanh.Buoi12;

public class myEx extends Exception{
	private int diem;

	public myEx(int diem) {
		super();
		this.diem = diem;
	}

	@Override
	public String toString() {
		return "Diem k the vuot qua 10, diem ban nhap la:"+diem;
	}
	
}

