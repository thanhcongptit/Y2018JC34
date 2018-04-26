package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu5;

import java.util.Arrays;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Bai1_inCacSoChanCuaMang {
	/*
	 * 1. BTVN: Nhap vao 1 mang so nguyen, in ra tat cac so chan cua mang do
	 */
	public static void main(String[] args) {
		int b = 0;
		boolean check = true;
		String chuoi = "";
		Scanner sc = new Scanner(System.in);
		while(check) {
			try {
				System.out.println("Nhập số phần tử của mảng: ");
				b = new Scanner(System.in).nextInt();
				check = false;
			}catch (Exception e) {
				System.out.println("Bạn đã nhập sai kiểu dữ liệu. Vui lòng nhập lại..!");
			}
		}
		
		int a[] = new int[b];
		System.out.println("Bạn vừa tạo mảng a[" + b + "].\nMỜI BẠN NHẬP GIÁ TRỊ CÁC PHẦN TỬ.");
		for (int i = 0; i < b; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
			if (a[i] % 2 == 0) {
				chuoi = chuoi + a[i] + "  ";
			}
			if (i == b - 1) {
				System.out.println("chuỗi số chẵn là: \n" + chuoi);
			}
		}
	}
}
