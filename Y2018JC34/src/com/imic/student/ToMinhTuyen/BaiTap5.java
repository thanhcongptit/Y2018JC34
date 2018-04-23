package com.imic.student.ToMinhTuyen;

import java.util.Scanner;

public class BaiTap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "";
		String age = "";
		String gioitinh = "";
		String honnhan = "";
		String test = "";

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Moi Ban Nhap Ho Ten");
			name = sc.nextLine();
			if (name.equalsIgnoreCase("")) {
				System.out.println("Ban Chua Nhap Ho Ten");
			}
			System.out.println("Moi Ban Nhap Tuoi");
			age = sc.nextLine();
			if (age.equalsIgnoreCase("")) {
				System.out.println("Ban Chua Nhap Tuoi");
			}
			System.out.println("Moi Ban Nhap Gioi Tinh Nam/Nu");
			gioitinh = sc.nextLine();
			if (gioitinh.equalsIgnoreCase("Nam") || gioitinh.equalsIgnoreCase("Nu")) {
				System.out.println();
				if (gioitinh.equalsIgnoreCase("")) {
					System.out.println("Ban Chua Nhap Gioi Tinh");
				}
			} else {
				System.out.printf("Khong Co gioi tinh %s", gioitinh);
				System.out.println();
			}

			System.out.println("Moi Ban Nhap Tinh Trang Hon Nhan");
			System.out.println("(chua ket hon, da ket hon, ly hon)");
			honnhan = sc.nextLine();
			if (honnhan.equalsIgnoreCase("")) {
				System.out.println("Ban Chua Nhap Tinh Trang  hon nhan");
			}

		} catch (Exception e) {
			System.out.println("Ban Da nhap Sai");
		}

		System.out.println("Ho Ten: " + name);
		System.out.println("Tuoi: " + age);
		System.out.println("Gioi Tinh: " + gioitinh);
		System.out.println("Tinh Trang Hon Nhan: " + honnhan);
		System.out.println();

		int tuoi = Integer.parseInt(age);

		if (tuoi < 19) {
			System.out.println("Ban Khong duoc phep tham gia");
		} else if (tuoi >= 22 &&( honnhan.equalsIgnoreCase("ly hon") || honnhan.equalsIgnoreCase("chua ket hon"))) {
			System.out.printf("Chao mung %s tham gia ket ban", name);
		} else if (tuoi >= 19 && gioitinh.equalsIgnoreCase("Nu") && (honnhan.equalsIgnoreCase("ly hon")
				|| honnhan.equalsIgnoreCase("chua ket hon"))) {
			System.out.printf("Chao mung %s tham gia ket ban", name);
		}
		else {
			System.out.println(" Ban khong duoc tham gia");
		}
		
		}

		
		}
	

