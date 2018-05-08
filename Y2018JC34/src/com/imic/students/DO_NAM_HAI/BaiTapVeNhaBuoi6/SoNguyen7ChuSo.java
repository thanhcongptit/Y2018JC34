//
//Viết chương trình liệt kệ các số nguyên có 7 chữ số thảo mãn: 
//a) Là số nguyên tố. 
//b) Là số thuận nghịch. 
//c) Mỗi chữ số đều là số nguyên tố. 
//d) Tổng các chữ số là số thuận nghịch.

package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi6;

import java.util.Arrays;

public class SoNguyen7ChuSo {
	public static void main(String[] args) {
//		soNguyenTo();
		soThuanNghich();
	}

		
		
//		public static void soNguyenTo() {
//			System.out.print(" số nguyên tố là :");
//		for(int i =1000000 ; i<10000000;i++) {
//			int dem=0;
//			for(int j=1;j<10000000;j++) {
//				if(i%j==0) {
//					dem++;
//					
//					}
//				}
//			if(dem<=2) {
//				System.out.print( i +",");
//			}
//			
//		}
//	}
		public static void soThuanNghich() {
			System.out.print("Số thuận nghịch là " );
			int mang[]= new int[7];
			
			for(int i=0;i<7;i++) {
				for(int j=6;j>0;j--) {
					if(0<=mang[i]&&mang[i]<=9&&0<=mang[j]&&mang[j]<=9) {
					if(mang[i]==mang[j]) {
						System.out.println(Arrays.toString(mang));
					}
				}
			}
					
			

}
}
}



