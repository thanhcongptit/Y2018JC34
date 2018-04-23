package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu4;

import java.util.Scanner;

public class Bai4_TimSoNgayTrongThang {

	public static void main(String[] args) {
		/*
		 * Yêu cầu: Tìm ra số ngày trong tháng dựa vào thông tin tháng & Năm. Gợi ý:
		 * Tháng 4, 6, 9, 11 có 30 ngày. Tháng 2, nếu là năm nhuận( năm chia hết cho 400
		 * hoặc năm chia hết cho 4 nhưng không chia hết cho 100) có 29 ngày. Ngược lại
		 * có 28 ngày. Các tháng còn lại có 31 ngày.
		 */
		String thang;
		String nam;
		int check1;
		int check2;
		String temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập thông tin tháng - năm cần xem.\nTháng: ");
		thang = sc.nextLine();
		while (true) {
			try {
				check1 = Integer.parseInt(thang);
				break;
			} catch (Exception e) {
				System.out.print("Bạn chưa nhập tháng hoặc sai kiểu dữ liệu.\nMời bạn nhập lại..!\n Tháng cần xem: ");
				thang = sc.nextLine();
			}
		}
		System.out.println("Năm cần xem: ");
		nam = sc.nextLine();
		while (true) {
			try {
				check2 = Integer.parseInt(nam);
				break;
			} catch (Exception e) {
				System.out.print("Bạn chưa nhập năm hoặc sai kiểu dữ liệu.\nMời bạn nhập lại..!\n Năm cần xem: ");
				nam = sc.nextLine();
			}
		}
		switch (check1) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tháng "+ check1+" năm " + nam + " có 31 ngày.");
			break;
		case 2:
			if (check1 == 2
			&& (((check2 % 400 == 0) && (check2 % 100 != 0)) || ((check2 % 4 == 0) && (check2 % 100 != 0)))) {
		System.out.println("Tháng 2 năm " + nam + " có 29 ngày.");
	} else {
		System.out.println("Tháng 2 năm " + nam + " có 28 ngày.");
	}
			break;
		default:
			System.out.println("Tháng "+ check1+" năm " + nam + " có 30 ngày.");
			break;
		}

	}
}