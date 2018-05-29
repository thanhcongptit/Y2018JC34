package com.imic.student.TRAN_THANH_XUAN_BTVN_10_25052018;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunSV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Menu(sc);
	}

	public static void Menu(Scanner sc) {
		boolean run = true;
		ArrayList<SinhVienIT> sItArr = new ArrayList<SinhVienIT>();
		ArrayList<SinhVienBz> sBzArr = new ArrayList<SinhVienBz>();

		while (run) {
			System.out.println("==================================");
			System.out.println("Chon chuc nang:");
			System.out.println("1. Nhap thong tin sinh vien IT");
			System.out.println("2. Nhap thong tin sinh vien Biz");
			System.out.println("3. Hien thi thong tin sinh vien");
			System.out.println("4. Hien thi sinh vien theo hoc luc");
			System.out.println("5. Sap xep sinh vien theo diem");
			System.out.println("0. Exit");
			System.out.print("Lua chon cua ban: ");
			int choice = sc.nextInt();
			if (choice == 0) {
				return;
			}
			switch (choice) {
			case 1:
				System.out.println("+++++++++ Sinh vien IT ++++++++++");
				SinhVienIT sIT = new SinhVienIT();
				sIT.NhapSV();
				sItArr.add(sIT);
				System.out.println();

				break;
			case 2:
				System.out.println("+++++++++ Sinh vien Bz ++++++++++");
				SinhVienBz sBz = new SinhVienBz();
				sBz.NhapSV();
				sBzArr.add(sBz);
				System.out.println();
				break;

			case 3:
				System.out.println("+++++++++ Danh sach sinh vien ++++++++++");
				showInfo(sItArr);
				showInfo(sBzArr);
				break;
			case 4:
				for (int i = 0; i < sItArr.size(); i++) {
					if (sItArr.get(i).getHocLuc().equals("Gioi")) {
						System.out.println(sItArr.get(i).toString());
					}
				}
				for (int i = 0; i < sBzArr.size(); i++) {
					if (sBzArr.get(i).getHocLuc().equals("Gioi")) {
						System.out.println(sBzArr.get(i).toString());
					}
				}
				System.out.println();
				break;
			case 5:
				System.out.println("++++++++++++ Sap xep theo diem ++++++++++++");
				Collections.sort(sItArr);
				Collections.sort(sBzArr);
				showInfo(sItArr);
				showInfo(sBzArr);
				break;

			default:
				break;
			}

		}

	}

	public static <E> void showInfo(ArrayList<E> arr) {
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).toString());
		}
	}
}
