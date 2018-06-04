package com.imic.student.ToMinhTuyen.btvn.buoi12;

public class Diemexception extends Exception{
	private int message;
	Diemexception(int a){
		message = a;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Diem <= 10";
	}

}
