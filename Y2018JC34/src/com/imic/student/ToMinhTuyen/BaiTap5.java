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
			while (name.equalsIgnoreCase("")) {
				System.out.println("Ban chua Nhap Ho Ten");
				System.out.println("Moi Ban Nhap Ho Ten");
				name = sc.nextLine();
			}
			System.out.println("Moi Ban Nhap Tuoi");
			age = sc.nextLine();
			while (age.equalsIgnoreCase("")) {
				System.out.println("Ban Chua Nhap Tuoi ");
				System.out.println("Moi ban nhap Tuoi ");
				age = sc.nextLine();
				
			}
			System.out.println("Moi Ban Nhap Gioi Tinh Nam/Nu");
			gioitinh = sc.nextLine();
		
			while (gioitinh.equalsIgnoreCase("")) {
				System.out.println("Ban Chua Nhap Gioi Tinh");
				System.out.println("Moi ban Nhap Gioi Tinh");
				gioitinh = sc.nextLine();

			
			if (gioitinh.equalsIgnoreCase("Nam") || gioitinh.equalsIgnoreCase("Nu")) {
				System.out.println();
			
			} else {
				
				System.out.println("Khong Co gioi tinh "+ gioitinh);
				System.out.println();
				continue;
			}
			}
			
			System.out.println("Moi Ban Nhap Tinh Trang Hon Nhan");
			System.out.println("(chua ket hon, da ket hon, ly hon)");
			honnhan = sc.nextLine();
			while (honnhan.equalsIgnoreCase("")) {
				System.out.println("Ban Chua Nhap Tinh Trang  hon nhan");
				System.out.println("Moi ban Nhap Tinh Trang  hon nhan");
				honnhan = sc.nextLine();
			}
			boolean kiemtra = true;

			while ((honnhan.equalsIgnoreCase("chua ket hon") || honnhan.equalsIgnoreCase("da ket hon")
					|| honnhan.equalsIgnoreCase("ly hon")) != kiemtra) {
				System.out.println("Moi Ban Nhap Lai");
				honnhan = sc.nextLine();

			}

		} catch (Exception e) {
			System.out.println("Ban Da nhap Sai");
		}
		
		System.out.println();
		System.out.println("Ho Ten: " + name);
		System.out.println("Tuoi: " + age);
		System.out.println("Gioi Tinh: " + gioitinh);
		System.out.println("Tinh Trang Hon Nhan: " + honnhan);
		System.out.println();

		int tuoi = Integer.parseInt(age);

		if (tuoi >= 22 && (honnhan.equalsIgnoreCase("ly hon") || honnhan.equalsIgnoreCase("chua ket hon"))) {
			System.out.printf("Chao mung %s tham gia ket ban", name);
		} else if (tuoi >= 19 && gioitinh.equalsIgnoreCase("Nu")
				&& (honnhan.equalsIgnoreCase("ly hon") || honnhan.equalsIgnoreCase("chua ket hon"))) {
			System.out.printf("Chao mung %s tham gia ket ban", name);
		} else {
			System.out.println(" Ban khong duoc tham gia");
		}

	}

}
