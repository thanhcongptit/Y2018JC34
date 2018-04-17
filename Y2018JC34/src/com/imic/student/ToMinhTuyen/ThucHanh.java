package com.imic.student.ToMinhTuyen;

import java.util.Scanner;

public class ThucHanh {

	public static void main(String[] args) {
		// in ten va tuoi ra man hinh

		/*
		 * String hoten = "To Minh Tuyen"; int tuoi = 29; System.out.println("Ho Ten: "
		 * + hoten); System.out.println("Tuoi: " + tuoi);
		 */
		// nhap tu ban phim ten va tuoi va in ra man hinh
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ho ten");
		String hoten = scanner.nextLine();
		System.out.println("Ho ten: " + hoten);
		
		System.out.println("Nhap tuoi");
		int tuoi = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Tuoi: " + tuoi);
		
		
		System.out.println("Nhap dia chi: ");
		String diachi = scanner.nextLine();
		System.out.println("Dia chi: " + diachi);
	}

}
