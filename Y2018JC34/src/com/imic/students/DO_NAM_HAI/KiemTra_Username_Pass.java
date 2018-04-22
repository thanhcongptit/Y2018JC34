package com.imic.students.DO_NAM_HAI;

import java.util.Scanner;

public class KiemTra_Username_Pass {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);

		System.out.print("moi ban nhap usename : ");

		String username = nhap.nextLine();
		if (username.equals("abc")) {
			System.out.println("ban nhap dung username");

			System.out.print("moi ban nhap password : ");

			String pass = nhap.nextLine();
			if (pass.equals("123456")) {
				System.out.print("ban dang nhap thanh cong");
			} else {
				System.out.print(" password sai ");
			}
		} else {
			System.out.println(" nhap lai username");
		}

	}
}
