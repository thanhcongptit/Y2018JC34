package com.imic.students.TruongQuangQuan.BaiTapBuoi10;

import java.util.Scanner;

public class Chuoi_Bai3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Chuoi_SinhVien sv[] = new Chuoi_SinhVien[5];
		String checkEmail = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
		String checkSdt = "0[0-9s.-]{9,10}";
		String checkCmnd = "\\d{9}";

		for (int i = 0; i < sv.length; i++) {
			Chuoi_SinhVien svTemp = new Chuoi_SinhVien();
			System.out.printf("Nhập thông tin sinh viên thứ %d %n", i + 1);

			System.out.print("Họ tên : ");
			svTemp.setName(scanner.nextLine());

			while (true) {
				System.out.print("Email : ");
				svTemp.setEmail(scanner.nextLine());
				if (!svTemp.getEmail().matches(checkEmail)) {
					System.out.println("Bạn đã nhập sai email ");
					System.out.println("Hãy nhập lại");
				} else {
					break;
				}
			}

			while (true) {
				System.out.print("Số điện thoại : ");
				svTemp.setNumberPhone(scanner.nextLine());
				if (!svTemp.getNumberPhone().matches(checkSdt)) {
					System.out.println("Bạn đã nhập sai số điện thoại ");
					System.out.println("Hãy nhập lại");
				} else {
					break;
				}
			}

			while (true) {
				System.out.print("Số CMND : ");
				svTemp.setCmnd(scanner.nextLine());
				if (!svTemp.getCmnd().matches(checkCmnd)) {
					System.out.println("Bạn đã nhập sai số CMND ");
					System.out.println("Hãy nhập lại");
				} else {
					break;
				}
			}
			sv[i] = svTemp;
		}

		for (int i = 0; i < sv.length; i++) {
			System.out.println(sv[i]);
		}
	}
}
