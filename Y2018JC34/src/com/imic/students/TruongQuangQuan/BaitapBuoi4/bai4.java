package com.imic.students.TruongQuangQuan.BaitapBuoi4;

import java.util.Scanner;

public class bai4 {




	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean checkInput = true;
		do {

			try {
				System.out.println("Tháng : ");
				String month = scanner.nextLine();

				System.out.println("Năm : ");
				String year = scanner.nextLine();

				while (month.equalsIgnoreCase("")) {
					System.out.println("Bạn chưa nhập tháng, hãy nhập lại ");
					System.out.println("Tháng : ");
					month = scanner.nextLine();
				}
				while (year.equalsIgnoreCase("")) {
					System.out.println("Bạn chưa nhập năm, hãy nhập lại ");
					System.out.println("Năm : ");
					year = scanner.nextLine();
				}

				String result = "";
				int i = Integer.parseInt(year);

				switch (month) {
				case "1":
				case "3":
				case "5":
				case "7":
				case "8":
				case "10":
				case "12":
					result = "31";
					break;
				case "2":
					if (((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)) {
						result = "29";
					} else {
						result = "28";
					}
					break;
				default:
					result = "30";
					break;

				}

				int check1 = Integer.parseInt(month);
				int check2 = Integer.parseInt(year);

				System.out.println("Số ngày trong tháng là : " + result);

			} catch (Exception e) {
				System.out.println("Bạn đã nhập sai kiểu dữ liệu,hãy nhập lại");
				checkInput = false;
			}
		} while (!checkInput);
	}
}
