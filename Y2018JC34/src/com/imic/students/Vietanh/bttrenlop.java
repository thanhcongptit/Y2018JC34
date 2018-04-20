package com.imic.students.Vietanh;

import java.util.Scanner;

public class bttrenlop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Xin moi ban nhap UserName");
		String UserName = sc.nextLine();
		System.out.println("Xin moi ban nhap Pass");
		String Pass = sc.nextLine();

		if (UserName.equals("")) {
			System.out.println("Ban chua nhap UserName");
		} else if (Pass.equals("")) {
			System.out.println("Ban chua nhap Pass");
		} else {
			System.out.println("UserName cua ban: " + UserName);
			System.out.println("Pass cua ban: " + Pass);
			if (UserName.equals("abc") && Pass.equals("123456")) {
				System.out.println("Ban da dang nhap thanh cong");

			} else {
				System.out.println("Dang nhap k thanh cong");
			}
		}

	}

}
