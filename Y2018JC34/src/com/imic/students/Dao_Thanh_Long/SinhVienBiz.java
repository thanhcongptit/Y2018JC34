package com.imic.students.Dao_Thanh_Long;

public class SinhVienBiz extends SinhVienPoLy_Lab7{
	private double diemMarketing,diemSales;

	public SinhVienBiz(String hoTen,String nganh ,double diemMarketing,double diemSales ) {
		super(hoTen,nganh);
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
	}
	@Override
	public double getDiem() {		
		return (this.diemMarketing*2 + this.diemSales)/3;
	}
	
}
