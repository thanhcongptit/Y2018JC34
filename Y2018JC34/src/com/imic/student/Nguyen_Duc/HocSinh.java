package com.imic.student.Nguyen_Duc;

import java.util.Scanner;

public class HocSinh {

	public static void main(String args[]) {

		// Bien hien thi ten, tuoi va in ra man hinh
		// ctr + shift + f : format code
		// Nhap ho ten: tuoi, dia chi
		// roi in ra
	
		
		double min = Math.min(5.5, 6);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap so nguyen");

		int a = scanner.nextInt();
		scanner.nextLine();

		System.out.println("gia tri a:" + a);

		System.out.println("moi ban nhap ho ten:");
		String hoten = scanner.nextLine();

		System.out.println("ho ten la : " + hoten);
		
		// Biet cach khai bao bien: 
		// In ra man hinh
		// Nhap vao tu ban phim 
		// Chay 1 chuong trinh tu ham main
		
	}
}
