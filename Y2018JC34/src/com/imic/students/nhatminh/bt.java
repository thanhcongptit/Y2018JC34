package com.imic.students.nhatminh;

import java.util.Scanner;

public class bt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Nhap ten :");
	    String ten = sc.nextLine();
	    if(ten.equalsIgnoreCase("")) {
	    System.out.println("Chua nhap ten");	
		}
	    System.out.println("Nhap tuoi :");
	    String tuoi = sc.nextLine();
	    if(tuoi.equalsIgnoreCase("")) {
	    System.out.println("Chua nhap tuoi");
		}
		System.out.println("Nhap gioi tinh nam hay nu");
		System.out.println("Gioi tinh :");
		String gioitinh = sc.nextLine();
		if(gioitinh.equalsIgnoreCase("")) {
			System.out.println("Chua nhap gioi tinh");
		}
		System.out.println("Nhap tthn chua co gia dinh hoac ly hon");
		System.out.println("Tthn :"); 
		String tthn = sc.nextLine();
		if(tthn.equalsIgnoreCase("")) {
			System.out.println("Chua nhap tinh trang hon nhan");
		}
		if(gioitinh.equalsIgnoreCase("Nam") && Integer.parseInt(tuoi) >=22) { 
			System.out.println("Tham gia thanh cong");
		}
		}
		
	}



