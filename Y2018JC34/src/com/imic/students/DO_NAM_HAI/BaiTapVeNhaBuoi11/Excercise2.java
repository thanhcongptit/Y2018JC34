package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi11;

import java.util.Scanner;

public class Excercise2 {
	public static void main(String[] args) {
		double a, b, c;
		Scanner nhap = new Scanner(System.in);
		System.out.println(" Giai Phuong Tring Bac 2 ");
		System.out.print("moiban nhap so a : ");
		a = nhap.nextDouble();
		System.out.print("moiban nhap so b : ");
		b = nhap.nextDouble();
		System.out.print("moiban nhap so c : ");
		c = nhap.nextDouble();
		double delta = Math.pow(b, 2) - 4 * a * c;

		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("phuong trinh co vo so nghiem");
				}
			} else {
				System.out.println("phuong trinh co nghiem = " + (-c / b));
			}
		} else {
			if (delta < 0) {
				System.out.println("phuong trinh vo nghiem ");
			} else if (delta == 0) {
				System.out.println("phuong trinh co nghiem kep = " + (-b / (2 * a)));
			} else {
				System.out.println("phuong trinh co nghiem" + ((-b + Math.sqrt(delta) / (2 * a))));
				System.out.println("phuong trinh co nghiem" + ((-b - Math.sqrt(delta) / (2 * a))));
			}
		}
	}
}