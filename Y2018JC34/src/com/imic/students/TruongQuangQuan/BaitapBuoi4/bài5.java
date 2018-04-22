package com.imic.students.TruongQuangQuan.BaitapBuoi4;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class bài5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Tên của bạn : ");
		String name = scanner.nextLine();

		while (name.equalsIgnoreCase("")) {
			System.out.println("Bạn chưa nhập tên, hãy nhập lại ");
			System.out.println("Tên của bạn : ");
			name = scanner.nextLine();
		}

		boolean checkInput = true;
		int i = 0;

		do {
			try {

				System.out.println("Tuổi : ");
				String age = scanner.nextLine();
				while (age.equalsIgnoreCase("")) {
					System.out.println("Bạn chưa nhập tuổi, hãy nhập lại ");
					System.out.println("Tuổi : ");
					age = scanner.nextLine();
				}
				i = Integer.parseInt(age);
				checkInput = true;
			} catch (Exception e) {
				System.out.println("Bạn đã nhập sai kiểu dữ liệu tuổi,hãy nhập lại");
				checkInput = false;
			}
		} while (!checkInput);

		System.out.println("Tình trạng hôn nhân : ");
		String maritalStatus = scanner.nextLine();

		while (maritalStatus.equalsIgnoreCase("")) {
			System.out.println("Bạn chưa nhập tình trạng hôn nhân, hãy nhập lại ");
			System.out.println("Tình trạng hôn nhân : ");
			maritalStatus = scanner.nextLine();
		}

		System.out.println("Giới tính : ");
		String sex = scanner.nextLine();

		while (sex.equalsIgnoreCase("")) {
			System.out.println("Bạn chưa nhập giới tính, hãy nhập lại ");
			System.out.println("Giới tính : ");
			sex = scanner.nextLine();
		}

		if (i >= 22 && (maritalStatus.equalsIgnoreCase("Chưa có gia đình") || maritalStatus.equalsIgnoreCase("Ly hôn"))
				&& sex.equalsIgnoreCase("Nam")) {
			System.out.printf("Chào mừng %s tham gia kết bạn", name);
		} else if (i >= 19
				&& (maritalStatus.equalsIgnoreCase("Chưa có gia đình") || maritalStatus.equalsIgnoreCase("Ly hôn"))
				&& sex.equalsIgnoreCase("Nữ")) {
			System.out.printf("Chào mừng %s tham gia kết bạn", name);
		} else {
			System.out.println("Xin lỗi, bạn chưa đủ điều kiện tham gia");
		}

	}

}
