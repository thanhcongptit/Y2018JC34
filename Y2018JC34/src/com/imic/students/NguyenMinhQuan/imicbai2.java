package com.imic.students.NguyenMinhQuan;

import java.util.Scanner;

public class imicbai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten :");
		String ten = sc.nextLine();
		
		System.out.println("Nhap tinh trang hon nhan :");
		String tinhtranghonnhan =  sc.nextLine();
		System.out.println("Nhap gioi tinh :");
		String gioitinh = sc.nextLine();
		
		System.out.println("Nhap tuoi :");
		int tuoi = sc.nextInt();
		if(ten.equalsIgnoreCase("") || tuoi==0 || tinhtranghonnhan.equalsIgnoreCase("") || gioitinh.equalsIgnoreCase("")) {
			System.out.println("May chua nhap day du thong tin");
		}
		
		 if(gioitinh.equalsIgnoreCase("nam") && tuoi>=22 && tinhtranghonnhan.equalsIgnoreCase("chuacogiadinh") || tinhtranghonnhan.equalsIgnoreCase("lyhon"))
		 {
			System.out.println("May da duoc tham gia vao Cong Ty");
		}
		
		 if(gioitinh.equalsIgnoreCase("nu") && tuoi>=19 && tinhtranghonnhan.equalsIgnoreCase("chuacogiadinh") || tinhtranghonnhan.equalsIgnoreCase("lyhon"))
		 {
			System.out.println("May da duoc tham gia vao Cong Ty");
		}
	
		 if(tuoi<19) {
		System.out.println("May khong duoc tham gia");	 
		 }
		 }

}
