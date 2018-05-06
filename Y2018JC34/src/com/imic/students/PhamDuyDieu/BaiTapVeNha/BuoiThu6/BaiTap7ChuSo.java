package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu6;

public class BaiTap7ChuSo {
/*
 * Viết chương trình liệt kệ các số nguyên có 7 chữ số thảo mãn: 
a) Là số nguyên tố. 
b) Là số thuận nghịch. 
c) Mỗi chữ số đều là số nguyên tố. 
d) Tổng các chữ số là số thuận nghịch.
 */
	public static void main(String[] args) {
		phanA();

	}
	public static void phanA() {
		int dem=0;
		String ketqua = "";
		for(int i = 1000000;i<1111111;i++) {
			dem=0;
			for(int j = 1;j<=i;j++) {
				if(i%j==0) {
					dem++;
					if(dem>2) {
						break;
					}
					if(j==i&&dem==2) {
						ketqua += i + " "; 
					}
				}
			}
		}
		System.out.println("Số nguyên tố có 7 chữ số: "+ ketqua);
	}
}
