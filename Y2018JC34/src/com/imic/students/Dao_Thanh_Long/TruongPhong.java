package com.imic.students.Dao_Thanh_Long;

public class TruongPhong extends NhanVien{
	
	public int trachNhiem;
	
	public int getTN(){
		return (int)(super.luong+trachNhiem);
	}
	
	

}
