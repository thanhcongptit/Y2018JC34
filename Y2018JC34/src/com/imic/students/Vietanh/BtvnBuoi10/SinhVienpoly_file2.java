package com.imic.students.Vietanh.BtvnBuoi10;

public abstract class SinhVienpoly_file2 {
	public String name;
	public String nghanhhoc;
	
	public SinhVienpoly_file2(String name, String nghanhhoc) {
		
		this.name = name;
		this.nghanhhoc = nghanhhoc;
	}
	
	public String GetHocLuc() {
		String hocluc = " ";
		if(getDiemTB()<5) {
			System.out.println(hocluc= "Hoc luc yeu");
		}else if(getDiemTB() <6.5 && getDiemTB()>=5 ){
			System.out.println(hocluc= "Hoc luc trung binh");
		}else if(getDiemTB()>=6.5 && getDiemTB()<7.5) {
			System.out.println(hocluc= "Hoc luc kha");
		}else if(getDiemTB()>=7.5 && getDiemTB()<9) {
			System.out.println(hocluc= "Hoc luc gioi");
		}else if(getDiemTB()>=9) {
			System.out.println(hocluc= "Hoc luc xuat sac");
		}
		return hocluc;
	}

	public abstract double getDiemTB();
	
	
	public void xuat() {
		System.out.println("Ho ten:"+name);
		System.out.println("Nghanh hoc:"+nghanhhoc);
		System.out.println("Diem trung binh:"+getDiemTB());
		System.out.println("hoc luc sinh vien:"+GetHocLuc());
	}
}
