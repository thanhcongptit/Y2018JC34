package com.imic.student.ToMinhTuyen;


import java.util.Scanner;

public class Lab3Bai4 {
	// Viet chuong trinh nhap 2 mang ho ten va diem cua sinh vien
	// Xuat 2 mang da nhap, moi sinh vien co them hoc luc
	// yeu: diem < 5
	// Trung binh: 5 < diem < 6.5
	// Kha: 6.5 <= diem < 7.5
	// Gioi: 7.5 <= diem < 9
	// Xuat Sac: Diem >=9
	// Sap xep sinh vien da nhap tang dan theo diem

	public static void main(String[] args) {

		int soluong = 0;
		boolean check1 = true;
		boolean check2 = true;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap So luong sinh vien");
		while (check1) {
			try {
				soluong = scanner.nextInt();
				check1 = false;

			} catch (Exception e) {
				System.out.println("Ban da nhap sai moi ban nhap lai");
				scanner.nextLine();
				check1 = true;
			}

		}

		String name[] = new String[soluong];
		double diem[] = new double[soluong];

		System.out.println("Moi ban nhap ho ten sinh vien va diem");

		for (int i = 0; i < name.length; i++) {
			while (check2){
				try {
					System.out.println("Sinh vien thu " + (i + 1));
					System.out.println("Ho Ten:");
					scanner.nextLine();
					name[i] = scanner.nextLine();
					System.out.println("Diem:");
					diem[i] = scanner.nextDouble();
					check2 = false;

					if (diem[i] < 0 || diem[i] > 10) {
						System.out.println("Moi ban nhap lai diem");
						check2 = true;
					}
				} catch (Exception e) {
					System.out.println("Ban nhap khong dung moi ban nhap lai");
					check2 = true;
				}
			} 
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
			System.out.println("Sinh Vien:" + name[i]);
			System.out.println("Diem: " + diem[i]);
			System.out.println("Hoc Luc: " + hocluc[i]);
			System.out.println();

		}
	}
}