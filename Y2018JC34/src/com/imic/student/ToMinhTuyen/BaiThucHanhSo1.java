package com.imic.student.ToMinhTuyen;

import java.util.Scanner;

public class BaiThucHanhSo1 {
	// Khai bao bien
	public static void main(String[] args) {
		int a1 = 17;
		int b1 = 35;
		int c1 = a1 + b1;
		// Tinh diem trung binh 3 mon a,b,c. mon a nhan he so 2.
		System.out.println("Tong c =" + c1);
		int a2 = 7;
		int b2 = 4;
		int c2 = 8;
		float diemtb = (a2 * 2 + b2 + c2) / 4;
		System.out.println("diemtb = " + diemtb);
		// khai bao ten + tuoi.
		String hoten = "tominhtuyen";
		int tuoi = 29;
		System.out.print("ho ten: " + hoten);
		System.out.print("nam nay: " + tuoi + " tuoi");
		System.out.println();
		System.out.println("ho ten " + hoten + " nam nay " + tuoi + " tuoi");
		System.out.printf("ho ten %s nam nay %d tuoi", hoten, tuoi);
		
		// nhap tu ban phim ten va tuoi va in ra man hinh
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap ho ten");
		String name = scanner.nextLine();

		System.out.println("Nhap tuoi");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Nhap dia chi: ");
		String diachi = scanner.nextLine();

		System.out.println("Ho ten: " + name);
		System.out.println("Tuoi: " + age);
		System.out.println("Dia chi: " + diachi);

	}

}
