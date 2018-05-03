package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu5;

import java.util.Scanner;

public class Bai5_VietChuongTrinhNhapSoNguyenDuong {
	/*
	 * 1.Viết chương trình nhập số nguyên dương n và thực hiện các chức năng sau: a)
	 * Tính tổng các chữ số của n. b) Liệt kê các ước số của n. c) Liệt kê các ước
	 * số là nguyên tố của n. ví dụ: số nguyên 12345 ban đầu 12345/ 10000 = 1 ~
	 * a/10^4 sau đó 2345/1000 = 2 ~ ((a-a/(10^4*1)/10^3)
	 */
	public static void main(String[] args) {
		double a;
		int chon = 0;
		int tong = 0;
		String uocso = "  ";
		String uocNguyenTo = " ";
		int demUoc = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập một số nguyên dương: ");
		a = sc.nextInt();
		System.out.println(
				"Vui lòng chọn: \n1) Tính tổng các chữ số của n \n2) Liệt kê các ước số của n \n3) Liệt kê các ước số là nguyên tố của n");
		chon = sc.nextInt();
		for (int j = 1; j < 1000000; j++) {
			if (a % j == 0) {
				uocso += j + "  ";
				demUoc = 0;
				for (int j1 = 1; j1 < j + 1; j1++) {
					if (j % j1 == 0) {
						demUoc++;
					}
				}
				if (demUoc < 3) {
					uocNguyenTo += j + "  ";
				}
			}
		}
		switch (chon) {
		case 1: // TÍNH TỔNG CÁC CHỮ SỐ CỦA A
			for (int i = 20; i >= 0; i--) {
				int phannguyen = (int) (a / (Math.pow(10, i)));
				if (phannguyen > 0) {
					a = (int) (a - (Math.pow(10, i)) * phannguyen);
					tong += phannguyen;
				}
			}
			System.out.println("Tổng các chữ số của n là: " + tong);
			break;
		case 2: // LIỆT KÊ CÁC ƯỚC SỐ CỦA A

			System.out.println("Các ước số của n là: \n" + uocso);
			break;
		case 3:
			System.out.println("Các ước nguyên tố của n là: \n" + uocNguyenTo);
			break;
		default:
			break;
		}

	}

}
