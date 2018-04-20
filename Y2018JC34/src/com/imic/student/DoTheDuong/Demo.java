package com.imic.student.DoTheDuong;

import java.util.Scanner;

public class Demo {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap Username:");
		String userName = scanner.nextLine();
		
		System.out.println("Nhap Password:");
		String passWord = scanner.nextLine();
		
		if (userName.equals("")) {
			System.out.println("Ban chua dang nhap Username");
		} else if (passWord.equals("")) {
			System.out.println("Ban chua dang nhap Password");
		} else {
			if (userName.equals("abc") && passWord.equals("123456")){
				System.out.println("Ban da dang nhap thanh cong");
			}
			else {
				System.out.println("Ban da dang nhap sai");
			}
		}
			
			
		
		
	}
}
