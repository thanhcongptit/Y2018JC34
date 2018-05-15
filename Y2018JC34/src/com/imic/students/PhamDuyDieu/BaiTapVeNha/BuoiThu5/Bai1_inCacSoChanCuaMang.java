package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu5;

import java.util.Arrays;
import java.util.Scanner;



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
				System.out.println("Nháº­p sá»‘ pháº§n tá»­ cá»§a máº£ng: ");
				b = new Scanner(System.in).nextInt();
				check = false;
			}catch (Exception e) {
				System.out.println("Báº¡n Ä‘Ã£ nháº­p sai kiá»ƒu dá»¯ liá»‡u. Vui lÃ²ng nháº­p láº¡i..!");
			}
		}
		
		int a[] = new int[b];
		System.out.println("Báº¡n vá»«a táº¡o máº£ng a[" + b + "].\nMá»œI Báº N NHáº¬P GIÃ� TRá»Š CÃ�C PHáº¦N Tá»¬.");
		for (int i = 0; i < b; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
			if (a[i] % 2 == 0) {
				chuoi = chuoi + a[i] + "  ";
			}
			if (i == b - 1) {
				System.out.println("chuá»—i sá»‘ cháºµn lÃ : \n" + chuoi);
			}
		}
	}
}
