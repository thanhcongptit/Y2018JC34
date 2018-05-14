package com.imic.students.Vietanh.BaiTapBuoi8;

import java.util.Scanner;

public class Run_bai4_beautiful_homework {
	
	public static void main(String[] args) {
		SanPham4 sp1 = new SanPham4("Bim bim", 5000);
		SanPham4 sp2 = new SanPham4("Sua", 7000, 1000);
		
		System.out.println("2 bien:"+sp1.getName()+" "+sp1.getGiasp());
		System.out.println("3 bien:"+sp2.getName()+" "+sp2.getGiasp()+" "+sp2.getGiamgia());
		
		
		
		
	}
}
