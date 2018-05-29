package com.imic.students.Vietanh.BtvnBuoi10;

public class runSinhVienITandSinhVienBIZ{
public static void main(String[] args) {
	SinhVienIT_file2 sv = new SinhVienIT_file2("Viet anh", "CNTT",5.8 , 9.5, 7.4);
	sv.xuat();
	System.out.println("-----------");
	
	SinhVienBiz_file2 sv1 = new SinhVienBiz_file2("hoa", "Tai chinh", 10.0, 9.9);
	sv1.xuat();
	
	
}   
}
	
