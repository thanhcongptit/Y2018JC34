package com.imic.student.ToMinhTuyen;
import java.util.Scanner;
public class BaiThucHanhSo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		String pasword;
		String abc ="abc";
		String pas123456 = "123456";
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi Ban Nhap Ho Ten");
		name = sc.nextLine();
		System.out.println("Moi ban Nhap PassWord");
		pasword = sc.nextLine();
		
		if(name.equalsIgnoreCase("")) {
			System.out.println("Ban Chua Nhap Ho Ten");
		}
		if(pasword.equalsIgnoreCase("")) {
			System.out.println("Ban Chua Nhap PassWord");
		}
		if(name.equalsIgnoreCase(abc) && pasword.equalsIgnoreCase(pas123456)) {
			System.out.println("Ban Da Dawng Nhap Thanh cong");
			
		}else {
			System.out.println("Dang Nhap khong Thanh Cong");
		}
	}

}
