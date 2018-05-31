package com.imic.students.Vietanh.Buoi11;

import java.util.ArrayList;

import com.imic.students.Vietanh.BaiTapBuoi8.HocSinh;
import com.imic.students.Vietanh.BtvnBuoi10.NhanVien_bttrenlop;

public class personModel<T> {
	public ArrayList<T> li = new ArrayList<T>();

	public void addOb(T object) {
		li.add(object);
	}

	public void display() {
      for(T e:li) {
    	  System.out.println(e);
      }
	}
	
	public static void main(String[] args) {
		personModel<HocSinh> hs = new personModel<HocSinh>();
		HocSinh hs1 = new HocSinh();
		hs1.setTenHS("Viet anh");
		hs1.setTuoiHS(18);
		
		HocSinh hs2 = new HocSinh();
		hs2.setTenHS("Huy");
		hs2.setTuoiHS(18);
		
		hs.addOb(hs1);
		hs.addOb(hs2);
		hs.display();
		System.out.println("-------------");
		
		personModel<NhanVien_bttrenlop> nv = new personModel<NhanVien_bttrenlop>();	
		NhanVien_bttrenlop nv1 = new NhanVien_bttrenlop();
		nv1.setName("Loc");
		nv1.setLuong(500000);
		
		NhanVien_bttrenlop nv2 = new NhanVien_bttrenlop();
		nv2.setName("hoa");
		nv2.setLuong(200000);
		
		nv.addOb(nv1);
		nv.addOb(nv2);
		nv.display();
		System.out.println("-------------");
		
		personModel<String> name = new personModel<String>();
		name.addOb("Tuan anh");
		name.addOb("Cong");
		name.display();
		
		
	
	
	}
}
