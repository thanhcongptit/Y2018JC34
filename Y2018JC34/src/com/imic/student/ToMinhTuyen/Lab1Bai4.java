package com.imic.student.ToMinhTuyen;

import java.util.Scanner;

public class Lab1Bai4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float a, b, c;
		double dellta;
		double sqrt;

		System.out.println("Nhap cac he so cua pt bac 2");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		// dellta = (b * b) - (4 * a * c);
		dellta = Math.pow(b, 2) - (4 * a * c);

		System.out.println("He so Dellta cua pt bac 2 la: " + dellta);

		if (dellta >= 0) {
			sqrt = Math.sqrt(dellta);
			System.out.println("Can bac 2 cua he so Dellta la: " + sqrt);
		} else {
			System.out.println("Cac he so khong hop le");
		}

	}

}
