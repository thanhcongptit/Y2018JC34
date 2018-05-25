package com.imic.students.Dao_Thanh_Long;

public class LaoCong extends NhanVien{
	public int soGio;
	
	public int getTN(){	
		return (int)(super.luong*soGio/(24*8));
	}
}
