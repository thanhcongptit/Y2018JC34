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
		int demso=0;
		for(int i=1000000;i<10000000;i++) {
			if(dieuKienSoNguyenTo(i)) {
				demso++;
				System.out.println(i+" - "+ demso);
			}
		}


	}
	public static boolean dieuKienSoNguyenTo(int i) {
		int dem=1;
		for(int j = 2;j<=i;j++) {
			if(i%j==0) {
				dem++;
			}
			if(j<i&&dem==2) {
				return false;
			}
			if(j==i&&dem==2) {
				
				return true;
			}
		}
		return false;
		
	}
	public static boolean dieuKienSoThuanNghich(int i) {
		String i1 = i+"";
		String []a = i1.split("");
		if(a[0].equals(a[6])&&a[1].equals(a[5])&&a[2].equals(a[4])){
			return true;
		}
		return false;
		
	}
	public static boolean tungSoLaSoNguyenTo(int i) {
		String i1 = i+"";
		String []a = i1.split("");
		for(int j = 0; j<a.length;j++) {
			a[j]+= Integer.parseInt(a[j]);
		}
		return false;
		
	}
}
