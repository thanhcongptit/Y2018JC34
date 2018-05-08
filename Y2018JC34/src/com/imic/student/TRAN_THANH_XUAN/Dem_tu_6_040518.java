package com.imic.student.TRAN_THANH_XUAN;

import java.util.Arrays;
import java.util.Scanner;

public class Dem_tu_6_040518 {
	final static int MAX = 50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count2 = 0;
		int count3 = 0;

		boolean kt = true;

		String input = sc.nextLine(); // nhập chuỗi
		String[] mangChuoi = input.split(" ");
		String[] mangChuoi2 = new String[MAX];
		String[] mangChuoi3 = new String[MAX];

		for (int i = 0; i < mangChuoi.length; i++) { // xoa dau cach
			if (!mangChuoi[i].equals("")) {
				mangChuoi2[count2] = mangChuoi[i];
				count2++;
			}
		}

		mangChuoi3[count3] = mangChuoi2[0]; // tao mang chua cac tu rieng biet
		count3++;
		for (int i = 1; i < count2; i++) {
			kt = true;
			for (int j = i - 1; j >= 0; j--) {
				if (mangChuoi2[i].equals(mangChuoi2[j])) {
					kt = false;
					break;
				}
			}
			if (kt == true) {
				mangChuoi3[count3] = mangChuoi2[i];
				count3++;
			}
		}

		for (int i = 0; i < count3; i++) { // so sanh mang chuoi 3 va mang chuoi 2 de tinh so lan xuat hien
			int dem = 0;
			for (int j = 0; j < count2; j++) {
				if (mangChuoi3[i].equals(mangChuoi2[j])) {
					dem++;
				}
			}

			System.out.println(mangChuoi3[i] + " " + dem);

		}
	}

}
