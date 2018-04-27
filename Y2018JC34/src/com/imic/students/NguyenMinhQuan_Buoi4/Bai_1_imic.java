package com.imic.students.NguyenMinhQuan_Buoi4;

import java.util.Scanner;

public class Bai_1_imic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap Username + password");
		System.out.println("Username:");
		String username = sc.nextLine();
		System.out.println("Password:");
		String password = sc.nextLine();

		if (username.equalsIgnoreCase("abc") && password.equalsIgnoreCase("123456")) {
			System.out.println("Ban da dang nhap vao thanh cong ");
		} else if (username.equalsIgnoreCase("")) {

			System.out.println("Ban chua nhap User");
		}

		else if (password.equalsIgnoreCase("")) {

			System.out.println("Ban chua nhap Password");
		}

		else {
			System.out.println("Ban dang nhap khong thanh cong.Vui long kiem tra thong tin dang nhap");

		}

	}

}
