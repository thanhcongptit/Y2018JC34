package com.imic.students.vuvietduongbaitapvenha.buoi4;

import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("moi ban nhap ten");
		String ten = sc.nextLine();
		if (ten.equalsIgnoreCase("")) {
			System.out.println("ban chua nhap ten");
		}else System.out.println("ten ban la: " +ten);
		
	
		System.out.println("moi ban nhap tuoi");
		int tuoi = sc.nextInt();
		System.out.println("tuoi cua ban la: " +tuoi);
		
		System.out.println("moi ban nhap gioi tinh");
		String gioitinh = sc.nextLine();
		if (gioitinh.equalsIgnoreCase("")) {
			System.out.println("ban chua nhap gioi tinh");
		}else System.out.println("gioi tinh cua ban la: " + gioitinh);
		
		System.out.println("chua co gia dinh");
		System.out.println("ly hon");
		System.out.println("moi ban nhap tinh trang hon nhan");
		String honnhan = sc.nextLine();
		if (honnhan.equalsIgnoreCase("")) {
			System.out.println("ban chua nhap tinh trang hon nha");
		}else System.out.println("tinh trang hon nha cua ban la: " + honnhan);
		
		if (gioitinh.equalsIgnoreCase("nam") && tuoi >= 22 && honnhan.equalsIgnoreCase("chua co gia dinh") || honnhan.equalsIgnoreCase("ly hon")) {
			System.out.println("duoc phep tham gia");
		}else if (gioitinh.equalsIgnoreCase("nu") && tuoi >= 19 && honnhan.equalsIgnoreCase("chua co gia dinh") || honnhan.equalsIgnoreCase("ly hon")) {
			System.out.println("duoc phep tham gia");
		}else System.out.println("khong duoc tham gia");
	}
}