package com.imic.students.TruongQuangQuan;

import java.util.Scanner;

public class NhapTuBanPhim {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap ho ten : ");
		String a = scanner.nextLine();
		System.out.println("ho ten : "+a);
		System.out.println("nhap tuoi : ");
		int b = scanner.nextInt();
		scanner.nextLine();
		System.out.println("tuoi : "+b);
		System.out.println("nhap dia chi");
		String c = scanner.nextLine();
		System.out.println("dia chi : "+c);
		
		
	}

}
