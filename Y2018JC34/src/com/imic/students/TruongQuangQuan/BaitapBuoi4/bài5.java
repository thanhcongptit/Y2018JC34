package com.imic.students.TruongQuangQuan.BaitapBuoi4;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class bài5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {

			System.out.println("Tên của bạn : ");
			String name = scanner.nextLine();

			System.out.println("Tuổi : ");
			String age = scanner.nextLine();

			System.out.println("Tình trạng hôn nhân : ");
			String maritalStatus = scanner.nextLine();

			System.out.println("Giới tính : ");
			String sex = scanner.nextLine();

			while (name.equalsIgnoreCase("")) {
				System.out.println("Bạn chưa nhập tên, hãy nhập lại ");
				System.out.println("Tên của bạn : ");
				name = scanner.nextLine();
			}
			while (age.equalsIgnoreCase("")) {
				System.out.println("Bạn chưa nhập tuổi, hãy nhập lại ");
				System.out.println("Tuổi : ");
				age = scanner.nextLine();
			}
			while (maritalStatus.equalsIgnoreCase("")) {
				System.out.println("Bạn chưa nhập tình trạng hôn nhân, hãy nhập lại ");
				System.out.println("Tình trạng hôn nhân : ");
				maritalStatus = scanner.nextLine();
			}
			while (sex.equalsIgnoreCase("")) {
				System.out.println("Bạn chưa nhập giới tính, hãy nhập lại ");
				System.out.println("Giới tính : ");
				sex = scanner.nextLine();
			}

			int i = Integer.parseInt(age);

			if (i >= 22
					&& (maritalStatus.equalsIgnoreCase("Chưa có gia đình") || maritalStatus.equalsIgnoreCase("Ly hôn"))
					&& sex.equalsIgnoreCase("Nam")) {
				System.out.printf("Chào mừng %s tham gia kết bạn", name);
			} else if (i >= 19
					&& (maritalStatus.equalsIgnoreCase("Chưa có gia đình") || maritalStatus.equalsIgnoreCase("Ly hôn"))
					&& sex.equalsIgnoreCase("Nữ")) {
				System.out.printf("Chào mừng %s tham gia kết bạn", name);
			} else {
				System.out.println("Xin lỗi, bạn chưa đủ điều kiện tham gia");
			}

		} catch (NumberFormatException e) {
			System.out.println("Bạn đã nhập sai kiểu dữ liệu tuổi");
		}
	}

}
