package com.imic.students.Dao_Thanh_Long;

public class SinhVien_Lab6 {
	private String hoTen;
	private String email;
	private String sdt;
	private String cmt;
	
	public SinhVien_Lab6(String hoTen,String email,String sdt,String cmt){
		this.hoTen = hoTen;
		this.email = email;
		this.sdt = sdt;
		this.cmt = cmt;
	}
	
	public void xuat(){
		System.out.println(this.hoTen + " - "+this.email +" - "+this.sdt+" - "+this.cmt);
	}
}
