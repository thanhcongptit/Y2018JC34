package com.imic.student.Nguyen_Duc;

import java.util.Scanner;

public class Exerciser_Day5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tong = 0;
		int soluong = 0;
		System.out.println("Nhap so luong mang");
		soluong = input.nextInt();
		int[] a = new int[soluong];
		for( int i = 0; i < soluong; i++) {
			System.out.println("Nhap Vao So Nguyen");
			a[i] = input.nextInt();
			tong += a[i];
		}

		System.out.println("Trung Binh cong = " + tong/soluong);

	}
	

}
