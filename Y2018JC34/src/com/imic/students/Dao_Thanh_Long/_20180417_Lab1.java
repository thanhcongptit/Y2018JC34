package com.imic.students.Dao_Thanh_Long;

import java.util.Scanner;

public class _20180417_Lab1 {

	public static void main(String[] args) {
		batDauLamBaiTap();
	}

	public static void batDauLamBaiTap(){
		Scanner objSc = new Scanner(System.in);
		int tenBT = 0;
		boolean tiepTuc = true;
		System.out.println("Nhap bai tap ban muon lam (1,2,3,4) ");
		try {
			tenBT = objSc.nextInt();
		} catch (Exception e) {
			tenBT = 0;
		}
		
		while (tiepTuc) {
			objSc.nextLine();
			switch (tenBT) {
			case 1: {
				bai1(objSc);
				break;
			}
			case 2: {
				bai2(objSc);
				break;
			}
			case 3: {
				bai3(objSc);
				break;
			}
			case 4: {
				bai4(objSc);
				break;
			}
			default: {

				break;
			}
			}
			
			System.out.println();
			System.out.println();
			
			System.out.println("De tiep tuc hay nhap bai tap muon lam (1,2,3,4)");
			System.out.println("De thoat hay nhap so khac ");
			
			try {
				objSc.nextLine();
				tenBT = objSc.nextInt();
			} catch (Exception e) {
				tenBT = 0;
			}
			if ( (1 <= tenBT) && (tenBT <=4)){
				tiepTuc = true;
			}
			else{
				tiepTuc = false;
			}
			
		}
		
		System.out.println("Ban da thoat khoi chuong trinh");
		objSc.close();
	}
	
	public static void bai1(Scanner objScanner) {
		System.out.println("/*=============== Bai 1 ==============*/");
		System.out.println("/*======= Hoc sinh & diem TB =========*/");
		System.out.println("/*====================================*/");
		
		System.out.println("Hay nhap ho và ten ");
		String hoTen = objScanner.nextLine();

		System.out.println("Nhap diem TB");
		float diemTB = objScanner.nextFloat();

		System.out.printf("Ho ten : %s - Diem TB = %2.1f", hoTen, diemTB);

	}

	public static void bai2(Scanner objScanner) {
		System.out.println("/*=============== Bai 2 ==============*/");
		System.out.println("/*====== Chu vi hinh chu nhat ========*/");
		System.out.println("/*====================================*/");
		float canh1, canh2, chuVi, min;

		System.out.println("Nhap do dai canh thu nhat");
		canh1 = objScanner.nextFloat();

		System.out.println("Nhap do dai canh thu hai");
		canh2 = objScanner.nextFloat();

		chuVi = (canh1 + canh2) * 2;

		min = Math.min(canh1, canh2);

		System.out.printf("Chu vi hinh chu nhat = %.2f", chuVi);
		System.out.println("");
		System.out.printf("Do dai canh nho nhat = %.2f", min);
		
	}

	public static void bai3(Scanner objScanner) {
		System.out.println("/*=============== Bai 3 ==============*/");
		System.out.println("/*== Tinh the tich hinh lap phuong ===*/");
		System.out.println("/*====================================*/");
		
		System.out.println("Nhap do dai canh");
		double doDaiCanh = objScanner.nextDouble();
		double theTich = Math.pow(doDaiCanh, (double)3);
		
		System.out.printf("The tich hinh lap phuong = " + theTich);
	}

	public static void bai4(Scanner objScanner) {
		System.out.println("/*=============== Bai 4 ==============*/");
		System.out.println("/*======== Phuong trinh bac 2 ========*/");
		System.out.println("/*====================================*/");

		float a, b, c;
		double delta, sqrtDelta;
		
		System.out.println("Nhap tham so phuong trinh bac 2 (a # 0)");
		System.out.print("a = ");
		a = objScanner.nextFloat();
		System.out.println();
		while (a == 0f) {
			objScanner.reset();
			System.out.println("Nhap gia tri a ( khac 0 )");
			System.out.print("a = ");
			a = objScanner.nextFloat();
			System.out.println();
		}

		System.out.print("b = ");
		b = objScanner.nextFloat();
		System.out.println();
		
		System.out.print("c = ");
		c = objScanner.nextFloat();
		System.out.println();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		
		sqrtDelta = Math.sqrt( Math.abs(delta));
		if (delta >= 0){
			System.out.printf("delta = %.2f - Can delta = %.2f", delta, sqrtDelta);
		}
		else{
			System.out.printf("delta = %.2f - Can delta = %.2f*i", delta, sqrtDelta);
		}
		
		

	}
}
