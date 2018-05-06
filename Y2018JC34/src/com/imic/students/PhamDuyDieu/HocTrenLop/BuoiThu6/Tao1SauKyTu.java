package com.imic.students.PhamDuyDieu.HocTrenLop.BuoiThu6;

import java.util.Scanner;

public class Tao1SauKyTu {

	public static void main(String[] args) {
		String chuoi = "";
		String temp = "";
		int dem = 0;
		String ketqua = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập một chuỗi ký tự:");
		chuoi = sc.nextLine();
		String[] a = chuoi.split(" ");
		for (int i = 0; i < (a.length); i++) {
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
				ketqua += a[i] + ":" + dem + "\n";
			}
		}

		System.out.println(ketqua);
	}
}