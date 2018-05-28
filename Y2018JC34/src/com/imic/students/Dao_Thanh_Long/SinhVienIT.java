package com.imic.students.Dao_Thanh_Long;

public class SinhVienIT extends SinhVienPoLy_Lab7{
	private double diemJava,diemHtml,diemCss;

	public SinhVienIT(String hoTen,String nganh ,double diemJava,double diemHtml,double diemCss) {
		super(hoTen,nganh);
		this.diemJava = diemJava;
		this.diemHtml = diemHtml;
		this.diemCss = diemCss;
	}
	
	@Override
	public double getDiem() {
		return (this.diemJava*2 + this.diemHtml + this.diemCss)/4;
	}

}
