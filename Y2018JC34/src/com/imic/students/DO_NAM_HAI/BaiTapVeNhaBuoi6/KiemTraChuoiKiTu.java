package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi6;

import java.util.Scanner;


// Nhập 1 sâu kí tự sau đó đếm xem có bao nhiêu chữ 

public class KiemTraChuoiKiTu {
	
	public static void main(String[] args) {
		String chuoiKiTu = "";		
		int dem;
		String ketQua="";
		Scanner nhap = new Scanner(System.in);
		System.out.println("Mời bạn nhập 1 câu");
		chuoiKiTu = nhap.nextLine();
		String[] a = chuoiKiTu.split(" ");
		for (int i = 0; i < a.length; i++) {
			dem = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i].equalsIgnoreCase(a[j])) {
					if (j < i) {
						break;
					} else {
						dem++;
					}
				}
			}
			if (dem == 0) {
				continue;
			} else {
				ketQua += a[i] + ":" + dem + "\n";
			}
		}

		System.out.println(ketQua);
	}

}
