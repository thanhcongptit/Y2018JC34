package com.imic.students.Dao_Thanh_Long;

abstract public class SinhVienPoLy_Lab7 implements Comparable<SinhVienPoLy_Lab7>{
	private String hoTen;
	private String nganh;
	
	public SinhVienPoLy_Lab7(String hoTen,String nganh) {
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	
	abstract public double getDiem();
	
	public String getHocLuc(){
		double diem = getDiem();
		if(diem < 5){
			return "Yeu";
		}else if((5 <= diem) & (diem < 6.5)){
			return "Trung Binh";
		}else if((6.5 <= diem) & (diem < 7.5)){
			return "Kha";
		}else if((7.5 <= diem) & (diem < 9)){
			return "Gioi";
		}else{
			return "Xuat sac";
		}
	}
	
	public void xuat(){
		System.out.println(this.hoTen + ", "+this.nganh+", "+getDiem()+", "+getHocLuc());
	}
	
	@Override
	public int compareTo(SinhVienPoLy_Lab7 o) {
		return (int)(o.getDiem() - this.getDiem());
	}
}
