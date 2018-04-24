package com.imic.students.nhatminh;

import java.util.Scanner;

public class Btv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String thang1;
		String thang2;
		String thang3;
		String thang4;
		String thang5;
		String thang6;
		String thang7;
		String thang8;
		String thang9;
		String thang10;
		String thang11;
		String thang12;
		System.out.println("Nhap thang");
		String thang = sc.nextLine();
		if (thang.equalsIgnoreCase("thang1") && thang.equalsIgnoreCase("thang4") && thang.equalsIgnoreCase("thang6")
				&& thang.equalsIgnoreCase("thang9") && thang.equalsIgnoreCase("thang11")) {
			System.out.println("Thang do co 30 ngay");
		}

	}

}
