package com.imic.student.TRAN_THANH_XUAN;

import java.util.Scanner;

public class BTVN_6_040518 {
	/*
	 * Viết chương trình liệt kệ các số nguyên có 7 chữ số thảo mãn: a) Là số nguyên
	 * tố. b) Là số thuận nghịch. c) Mỗi chữ số đều là số nguyên tố. d) Tổng các chữ
	 * số là số thuận nghịch.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Chương trình liệt kệ các số nguyên có 7 chữ số thảo mãn:");
		System.out.println("a. SNT có 7 chữ số");
		System.out.println("b. Số thuận nghịch có 7 chữ số");
		System.out.println("c. Số 7 chữ số có các số đều là SNT");
		System.out.println("d. Tổng các chữ số là số thuận nghịch");
		System.out.println("Mời bạn chọn: ");
		String choice = sc.nextLine();
		switch (choice) {

		// -------------------phần a-----------------------//
		case "a":
			System.out.println("A. SNT có 7 chữ số");
			for (int i = 1000000; i <= 9999999; i++) {
				if (Prime(i)) {
					System.out.println(i);
				}
			}
			break;

		// -------------------phần b-----------------------//
		case "b":
			System.out.println("B. Số thuận nghịch có 7 chữ số");
			for (int i = 1000000; i <= 9999999; i++) {
				if (ReversibleNumber(i)) {
					System.out.print("\n" + i);
				}
			}
			break;

		// -------------------phần c-----------------------//
		case "c":
			// System.out.println("C.Số 7 chữ số có các số đều là SNT ");
			for (int i = 1000000; i <= 9999999; i++) {
				if (SeparatorNumber(i)) {
					System.out.println(i);
				}
			}
			break;

		// -------------------phần d-----------------------//
		case "d":
			System.out.println("D.Tổng các chữ số là số thuận nghịch ");
			for (int i = 1000000; i <= 9999999; i++) {
				if (SumReversible(i)) {
					System.out.println(i + " ");
				}
			}
			break;
		default:
			System.out.println("Bạn chọn sai rồi ^_^");
			break;
		}

	}

	// hàm kiểm tra snt
	public static boolean Prime(int n) {
		if (n < 2) {
			return false;
		}
		// if (n == 2 || n == 3) {
		// return true;
		// }
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}

	// hàm kiểm tra số thuận nghịch
	public static boolean ReversibleNumber(int n) {
		String temp = n + "";
		String reversibleString = new StringBuffer(temp).reverse().toString(); // StringBuffer(temp).reverse().toString(); đảo xâu
		if (temp.equals(reversibleString)) {
			return true;
		}
		return false;
	}

	// hàm kiểm tra từng số là snt
	public static boolean SeparatorNumber(int n) {

		int separatorNumber = 0;
		while (n > 0) {
			separatorNumber = n % 10;
			n = n / 10;
			if (Prime(separatorNumber) == false)
				return false;
		}
		return true;
	}

	// kiểm tra tổng chữ số là thuận nghịch
	public static boolean SumReversible(int n) {
		int temp = 0;
		while (n > 0) {
			temp += n % 10;
			n = n / 10;
		}
		if (ReversibleNumber(temp)) {
			return true;
		} else
			return false;
	}

}
