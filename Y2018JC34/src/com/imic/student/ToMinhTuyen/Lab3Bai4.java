package com.imic.student.ToMinhTuyen;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai4 {
	//hhhh
	// Viet chuong trinh nhap 2 mang ho ten va diem cua sinh vien
	// Xuat 2mang da nhap, moi sinh vien co them hoc luc
	// yeu: diem < 5
	// Trung binh: 5 < diem < 6.5
	// Kha: 6.5 <= diem < 7.5
	// Gioi: 7.5 <= diem < 9
	// Xuat Sac: Diem >=9
	// Sap xep sinh vien da nhap tang dan theo diem
	
	
	
	//Comment tu Le Thanh Cong
	/*
	Do báº¡n cáº§n Ä‘á»ƒ nextLine() táº¡i sau lÃºc nháº­p sá»‘ chá»© khÃ´ng pháº£i lÃºc nháº­p String xong
	Náº¿u Ä‘á»ƒ nhÆ° báº¡n lÃ m lÃºc Ä‘áº§u: thÃ¬ nÃ³ sáº½ bá»� qua viá»‡c gÃ¡n nÃ y : name[i] = scanner.nextLine();
	vÃ  lÃºc báº¡n nháº­p thá»±c cháº¥t lÃ  báº¡n Ä‘ang nháº­p vÃ  khÃ´ng gÃ¡n cho biÃªn name[i] mÃ  chá»‰ lÃ  cháº¡y lá»‡nh scanner.nextLine();
	*/

	public static void main(String[] args) {

		int soluong = 0;
		boolean check1 = true;
		boolean check2 = true;
		Scanner scanner = new Scanner(System.in);

		do {
			try {
				System.out.println("Nhap So luong sinh vien");
				soluong = scanner.nextInt();
				scanner.nextLine();
				check1 = false;

			} catch (Exception e) {
				System.out.println("Ban da nhap sai moi ban nhap lai");
			}

		} while (check1);

		String name[] = new String[soluong];
		double diem[] = new double[soluong];

		System.out.println("Moi ban nhap ho ten sinh vien va diem");

		for (int i = 0; i < name.length; i++) {
			do {
				try {
					System.out.println("Sinh vien thu " + (i + 1));
					System.out.println("Ho Ten:");
					name[i] = scanner.nextLine();
					
					System.out.println("Diem:");
					diem[i] = scanner.nextDouble();
					scanner.nextLine();
					check2 = false;

					if (diem[i] < 0 || diem[i] > 10) {
						System.out.println("Moi ban nhap lai diem");
						check2 = true;
					}
				} catch (Exception e) {
					System.out.println("Ban nhap khong dung moi ban nhap lai");
					check2 = true;
				}
			} while (check2);
		}
		String hocluc[] = new String[soluong];
		for (int i = 0; i < soluong; i++) {
			if (diem[i] < 5) {
				hocluc[i] = "Yeu";
			} else if (5 <= diem[i] && diem[i] < 6.5) {
				hocluc[i] = "Trung Binh";
			} else if (6.5 <= diem[i] && diem[i] < 7.5) {
				hocluc[i] = "Kha";
			} else if (7.5 <= diem[i] && diem[i] < 9) {
				hocluc[i] = "Gioi";
			} else {
				hocluc[i] = "Xuat Sac";
			}

		}
		for (int i = 0; i < soluong; i++) {
			System.out.println("Ho Ten: " + name[i]);
			System.out.println("Diem: " + diem[i]);
			System.out.println("Hoc Luc:" + hocluc[i]);
			System.out.println();
		}

		System.out.println("Sap xep sinh vien theo diem tang dan");
		System.out.println();
		for (int i = 0; i < diem.length - 1; i++) {
			for (int j = 0; j < diem.length; j++) {
				if (diem[i] < diem[j]) {
					double d = diem[i];
					diem[i] = diem[j];
					diem[j] = d;
					String t = name[i];
					name[i] = name[j];
					name[j] = t;
					String hl = hocluc[i];
					hocluc[i] = hocluc[j];
					hocluc[j] = hl;
				}
			}
		}
		for (int i = 0; i < soluong; i++) {
			System.out.println("Sinh Vien: " + name[i]);
			System.out.println("Diem: " + diem[i]);
			System.out.println("Hoc Luc: " + hocluc[i]);
			System.out.println();

		}
	}
}