package com.imic.students.Vietanh.BtvnBuoi10;

public class TruongPhong_bttrenlop extends NhanVien_bttrenlop {
	public double TrachNhiem;
	
	public TruongPhong_bttrenlop() {
		super();
	}
	public TruongPhong_bttrenlop(String name, int luong, double TrachNhiem) {
		super(name, luong);
		this.TrachNhiem = TrachNhiem;
	}

	public void xuat() {
		super.xuat();
		System.out.println("Tien trach nhiem:" + TrachNhiem);
		System.out.println("Thu nhap:"+getThuNhap());
		
	}

	@Override
	public double getThuNhap() {
		double thunhap = (luong * 30) + TrachNhiem;
		return thunhap;
	}
	 
}
