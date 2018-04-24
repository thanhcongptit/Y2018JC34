package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu4;

import java.util.Scanner;

public class BaiBoXung2_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chon;
		double a = 0, b = 0, c = 0;
		double delta;
		boolean checka = true, checkb = true, checkc = true;
		int soDien = 0;
		boolean ketThuc = true;
		while (ketThuc) {
			Scanner sc = new Scanner(System.in);
			System.out.print(
					"\n+------------------------------+\n          MỜI BẠN CHỌN\n 1: Giải phương trình bậc nhất.\n 2: Giải phương trình bậc 2.\n 3: Tính tiền điện.\n 4: Kết thúc.\n+------------------------------+\n\n Chọn chức năng:_");
			chon = sc.nextInt();
			switch (chon) {
			case 1:
				System.out.println("Mời bạn nhập hệ số a:\n a = ");
				a = sc.nextDouble();
				System.out.println("Mời bạn nhập hệ số b:\n b = ");
				b = sc.nextDouble();
				if (a == 0) {
					if (b == 0) {
						System.out.println("Phương trình có vô số nghiệm..!");
					} else {
						System.out.println("Phương trình vô nghiệm..!");
					}
				} else {
					System.out.println("Phương trình có nghiệm: x = -b/a = " + (-b / a));
				}

				break;
			case 2:
				System.out.println("Nhập hệ số a; b; c: ");
				while (checka) {
					try {
						System.out.print("a = ");
						a = new Scanner(System.in).nextDouble();
						checka = false;
					} catch (Exception e) {
						System.out.println("Bạn nhập sai định dạng. Mời bạn nhập lại. ");
					}
				}
				while (checkb) {
					try {
						System.out.print("b = ");
						b = new Scanner(System.in).nextDouble();
						checkb = false;
					} catch (Exception e) {
						System.out.println("Bạn nhập sai định dạng. Mời bạn nhập lại.");

					}
				}

				while (checkc) {
					try {
						System.out.print("c = ");
						c = new Scanner(System.in).nextDouble();
						checkc = false;
					} catch (Exception e) {
						System.out.println("Bạn nhập sai định dạng. Mời bạn nhập lại.");
					}
				}
				System.out.println("Phương trình bạn vừa nhập là:\n  " + a + "x^2 + " + b + "x + " + c + " = 0");
				delta = b * b - (4 * a * c);
				System.out.println("  Delta = " + delta);
				if (delta == 0) {
					System.out.println("Phương trình có nghiệm kép: x = " + ((-b) / (2 * a)));
				} else {
					if (delta > 0) {
						System.out.println(
								"Phương trình có 2 nghiệm phân biệt:\n x1 = " + (((-b) + Math.sqrt(delta)) / (2 * a))
										+ "\n x2 = " + (((-b) - Math.sqrt(delta)) / (2 * a)));
					} else {
						System.out.println("Phương trình vô nghiệm..!");
					}
				}
				break;
			case 3:
				System.out.println("Mời bạn nhập vào số điện tiêu thụ tháng này: ");
				soDien = sc.nextInt();
				if (soDien < 50) {
					System.out.println("Tiền điện của bạn là: " + (soDien * 1000) + " VNĐ.");
				} else {
					System.out.println("Tiền điện của bạn là: " + ((soDien - 50) * 1200 + 50000) + " VNĐ.");
				}
				break;
			case 4:
				ketThuc = false;
				System.out.println("============Tạm Biệt============");
			default:
				break;
			}
		}
	}
}
