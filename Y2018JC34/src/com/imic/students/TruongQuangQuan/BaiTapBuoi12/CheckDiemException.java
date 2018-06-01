package com.imic.students.TruongQuangQuan.BaiTapBuoi12;

public class CheckDiemException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Bạn đã nhập sai điểm, hãy nhập lại";
	}

}
