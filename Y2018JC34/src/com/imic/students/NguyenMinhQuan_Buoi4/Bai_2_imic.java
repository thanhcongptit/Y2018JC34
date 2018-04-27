package com.imic.students.NguyenMinhQuan_Buoi4;

import java.util.Scanner;

public class Bai_2_imic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap so A:");
		int a = sc.nextInt();

		System.out.println("Moi ban nhap so B:");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("Moi ban nhap phep toan:");
		String pheptoan = sc.nextLine();

		int pheptinhcong = a + b;
		int pheptinhtru = a - b;
		int pheptinhnhan = a * b;
		int pheptinhchia = a / b;

		if (pheptoan.equalsIgnoreCase("")) {
			System.out.println("Ban chua nhap phep toan");
		}

		if (pheptoan.equalsIgnoreCase("cong")) {
			System.out.println("Phep tinh cong ket qua la:  " + pheptinhcong);
		}

		if (pheptoan.equalsIgnoreCase("tru")) {
			System.out.println("Phep tinh tru ket qua la:  " + pheptinhtru);
		}

		if (pheptoan.equalsIgnoreCase("nhan") || pheptoan.equalsIgnoreCase("*")) {
			System.out.println("Phep tinh cong ket qua la:  " + pheptinhnhan);
		}

		if (pheptoan.equalsIgnoreCase("chia")) {
			System.out.println("Phep tinh cong ket qua la:  " + pheptinhchia);
		}

		if (a == 0) {
			System.out.println("Ban chua nhap a:");

		}

		if (b == 0) {
			System.out.println("Ban chua nhap b:");

		}
	}

}
