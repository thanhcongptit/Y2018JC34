package com.imic.students.NguyenMinhQuan;

import java.util.Scanner;

public class imic {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Moi ban nhap Username + password");
		System.out.println("Username:");
		String username=sc.nextLine();
		System.out.println("Password:");
		String password=sc.nextLine();
		if(username.equalsIgnoreCase("") || password.equalsIgnoreCase("")) {
			
			System.out.println("Ban chua nhap du lieu");
		}
		
		if(username.equalsIgnoreCase("abc") && password.equalsIgnoreCase("123456")) {
			System.out.println("May da dang nhap vao thanh cong ");
		}
		
	}

}
