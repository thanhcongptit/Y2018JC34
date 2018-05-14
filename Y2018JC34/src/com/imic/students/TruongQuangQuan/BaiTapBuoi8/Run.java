
package com.imic.students.TruongQuangQuan.BaiTapBuoi8;

import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		
		SanPham sp1= new SanPham("NumberOne", 10000);
		
		SanPham sp2 = new SanPham("Sting", 9000,1000);
		
		System.out.println("Sản phẩm 1 : ");
		sp1.showInfo();
		System.out.println("-----------------------");
		
		System.out.println("Sản phẩm 2 : ");
		sp2.showInfo();
	}
}
