package com.imic.students.TruongQuangQuan.BaiTapBuoi11;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Phương trình bậc 2 ax^2 + bx + c = 0
		System.out.print("a = ");
		double a = scanner.nextDouble();
		System.out.print("b = ");
		double b = scanner.nextDouble();
		System.out.print("c = ");
		double c = scanner.nextDouble();
		double delta = (Math.pow(b, 2) - 4 * a * c);
		if (delta < 0) {
			System.out.println("Phương trình vô nghiệm");
		} else if (delta == 0) {
			System.out.println("Phương trình có nghiệm kép x= " + -b / (2 * a));
		} else {
			System.out.println("Phương trình có 2 nghiệm");
			System.out.println("X1 = " + (-b + Math.sqrt(delta)) / (2 * a));
			System.out.println("X2 = " + (-b - Math.sqrt(delta)) / (2 * a));
		}
	}
}
