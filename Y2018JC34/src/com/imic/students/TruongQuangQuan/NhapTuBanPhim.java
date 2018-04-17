package com.imic.students.TruongQuangQuan;

import java.util.Scanner;

public class NhapTuBanPhim {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap ho ten : ");
		String name = scanner.nextLine();
		System.out.println("ho ten : "+name);
		System.out.println("nhap tuoi : ");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("tuoi : "+age);
		System.out.println("nhap dia chi");
		String add = scanner.nextLine();
		System.out.println("dia chi : "+add);
		
		
	}

}
