package com.imic.student.ToMinhTuyen;

import java.util.Scanner;

public class BaiThucHanhSo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bai4();
	}

	public static void bai1() {
		String name;
		String pasword;
		String abc = "abc";
		String pas123456 = "123456";

		Scanner sc = new Scanner(System.in);

		System.out.println("Moi Ban Nhap Ho Ten");
		name = sc.nextLine();
		System.out.println("Moi ban Nhap PassWord");
		pasword = sc.nextLine();

		if (name.equalsIgnoreCase("")) {
			System.out.println("Ban Chua Nhap Ho Ten");
		}
		if (pasword.equalsIgnoreCase("")) {
			System.out.println("Ban Chua Nhap PassWord");
		}
		if (name.equalsIgnoreCase(abc) && pasword.equalsIgnoreCase(pas123456)) {
			System.out.println("Ban Da Dawng Nhap Thanh cong");

		} else {
			System.out.println("Dang Nhap khong Thanh Cong");
		}
	}

	public static void bai2() {
		String name;
		String age;
		String gioitinh;
		String honnhan;
		String test = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Moi Ban Nhap Ho Ten");
		name = sc.nextLine();
		System.out.println("Moi Ban Nhap Tuoi");
		age = sc.nextLine();
		System.out.println("Moi Ban Nhap Gioi Tinh");
		gioitinh = sc.nextLine();
		System.out.println("Moi Ban Nhap Tinh Trang Hon Nhan");
		System.out.println("chua ket hon, da ket hon, ly hon");
		honnhan = sc.nextLine();

		if (name.equalsIgnoreCase("")) {
			System.out.println("Ban Chua Nhap Ho Ten");
		}
		if (age.equalsIgnoreCase("")) {
			System.out.println("Ban Chua Nhap Ho Ten");
		}
		if (age.equalsIgnoreCase("")) {
			System.out.println("Ban Chua Nhap Ho Ten");
		}
		
	}
		public static void bai4() {
			
			int thang;
			int nam;
			
			Scanner sc = new Scanner(System.in);
			
			try {
				System.out.println("");
				thang = sc.nextInt();
				System.out.println("");
				nam = sc.nextInt();
				
			} catch (Exception e) {
				System.out.println("Ban da nhap sai moi ban nhap lai");
				
			}
		}
		
	}
	
	
	
