package com.imic.students.Dao_Thanh_Long;

public class Vuong_Lab7 extends ChuNhat_Lab7{

	public Vuong_Lab7(double canh){
		super(canh,canh);
	}
	public void xuat(){
		System.out.println("a = "+super.rong+", C = "+super.getChuVi()+", S = "+super.getDienTich());
	}
}
