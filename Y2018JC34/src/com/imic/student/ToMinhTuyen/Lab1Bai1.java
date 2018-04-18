package com.imic.student.ToMinhTuyen;

import java.util.Scanner;

public class Lab1Bai1 {

	public static void main(String[] args) {
		
		//Bai tap 1: Nhap Ho Ten va diem Tb sau do in ra man hinh.
		Scanner sc = new Scanner(System.in);
		String hoten;
		double diemtb;
		
		System.out.println("Nhap ho ten");
		hoten = sc.nextLine();
		
		System.out.println("Nhap diem TB");
		diemtb = sc.nextDouble();
		sc.nextLine();
		
		System.out.printf("%s %f diem",hoten, diemtb);
		

	
	}

}
