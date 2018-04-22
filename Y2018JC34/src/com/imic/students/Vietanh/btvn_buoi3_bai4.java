package com.imic.students.Vietanh;

import java.util.Scanner;

public class btvn_buoi3_bai4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Xin moi ban nhap cac he so cua phuong trinh bac 2");
		System.out.print("a= ");
		int a = sc.nextInt();
		System.out.print("b= ");
		int b = sc.nextInt();
		System.out.print("c= ");
		int c = sc.nextInt();
		int denta = (b * b) - (4 * a * c);
		double candenta = Math.sqrt(denta);

		System.out.println("Denta = " + denta);
		System.out.println("Can denta = " + candenta);

	}

}
