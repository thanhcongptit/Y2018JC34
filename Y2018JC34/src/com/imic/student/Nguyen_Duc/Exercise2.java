package com.imic.student.Nguyen_Duc;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name, gioitinh, honnhan;
		int tuoi;
		
		
		System.out.println("Enter your name : ");
		name = input.nextLine();
		System.out.println("Enter your gioi tinnh");
		gioitinh = input.nextLine();
		System.out.println("Enter your tinh trang hon nhan");
		honnhan = input.nextLine();
		System.out.println("Enter your age :");
		tuoi = input.nextInt();
		
		if((name.equalsIgnoreCase("") || (tuoi==0) || (gioitinh.equalsIgnoreCase("") || (honnhan.equalsIgnoreCase(""))))) {
			System.out.println("Ban nhap thieu thong tin !!");
		}
		else if((!name.equalsIgnoreCase("") || (tuoi!=0) || (!gioitinh.equalsIgnoreCase("") || (!honnhan.equalsIgnoreCase(""))))) {
			System.out.println("dang xet duyet");
			if((tuoi<=24) && (honnhan == "No")) {
				System.out.println("Chuc mung ban da tham gia nhom");
			}
			else {
				System.out.println("rat tiec ban k du dieu kien");
			}
		}
		else {
			System.out.println("moi ban nhap lai thong tin");
		}

	}

}
