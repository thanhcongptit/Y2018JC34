package com.imic.students.Vietanh.BaiTapVeNhaBuoi5;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Xin moi ban chon so luong sinh vien trong mang");
		String soluongsv = sc.nextLine();

		if (soluongsv.equals("")) {
			System.out.println("Ban chua nhap vui long nhap lai");
		} else {
			System.out.println("So luong sinh vien trong mang: " + soluongsv);
		}

		String mangtensv[] = new String[Integer.parseInt(soluongsv)];

		for (int i = 0; i < Integer.parseInt(soluongsv); i++) {
			System.out.println("Xin moi nhap ten sinh vien thu: " + i);
			mangtensv[i] = sc.nextLine();
		}


		double mangdiemsv[] = new double[Integer.parseInt(soluongsv)];

		for (int i = 0; i < mangdiemsv.length; i++) {
			System.out.println("Xin moi nhap diem sinh vien thu:" + i);
			mangdiemsv[i] = sc.nextDouble();
		}
		

		for (int i = 0; i <= mangdiemsv.length - 1; i++) {
			for (int j = i + 1; j < mangdiemsv.length; j++) {
				if (mangdiemsv[i] > mangdiemsv[j]) {

					String name = mangtensv[i];
					mangtensv[i] = mangtensv[j];
					mangtensv[j] = name;

					double diem = mangdiemsv[i];
					mangdiemsv[i] = mangdiemsv[j];
					mangdiemsv[j] = diem;
				}

			}
			
		}
		 System.out.println("Mang ten sinh vien " + Arrays.toString(mangtensv));
		   System.out.println("Mang diem sinh vien:" + Arrays.toString(mangdiemsv));
		String hocluc = "0";
		for (int i = 0; i < mangtensv.length; i++) {
			if (mangdiemsv[i] < 5) {
				hocluc ="Yeu";
			} else if (mangdiemsv[i] < 6.5 && mangdiemsv[i] >= 5) {
				hocluc ="Trung binh";
			} else if (mangdiemsv[i] >= 6.5 && mangdiemsv[i] < 7.5) {
				hocluc = "Kha";
			} else if (mangdiemsv[i] >= 7.5 && mangdiemsv[i] < 9) {
				hocluc = "Gioi";
			} else {
				hocluc = "Xuat sac";
			}
	
	   System.out.println("----------------------");
       System.out.println("Ho ten sinh vien: "+mangtensv[i]);
       System.out.println("Diem sinh vien: "+mangdiemsv[i]);
       System.out.println("Hoc luc: "+hocluc);
       System.out.println("----------------------");
		}

	}
}
