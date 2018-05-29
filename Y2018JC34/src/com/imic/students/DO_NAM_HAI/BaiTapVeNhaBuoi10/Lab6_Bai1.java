package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi10;

import java.util.Scanner;

public class Lab6_Bai1 {
public static void main(String[] arrgs) {
	String hoTen;
	Scanner nhap = new Scanner(System.in);
	System.out.print("Moi ban nhap ho ten : ");
	hoTen = nhap.nextLine();
	
	String ho =hoTen.substring(0, hoTen.indexOf(" "));
	String ten=hoTen.substring(hoTen.lastIndexOf(" "), hoTen.length());
	String tenDem =hoTen.substring(hoTen.indexOf(" "), hoTen.lastIndexOf(" "));
	
	System.out.println("ho :" + ho.toUpperCase());
	System.out.println("ten dem :" + tenDem);
	System.out.println("ten : " + ten.toUpperCase());
	
}
}
