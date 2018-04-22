package com.imic.students.duong;

import java.util.Scanner;

public class Lab1bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap chieu dai = ");
		double dai = scanner.nextInt();
		System.out.println("nhap chieu rong = ");
		double rong = scanner.nextInt();
		double chuvi=(dai+rong)*2;
		double dientich=dai*rong;
		System.out.println("chu vi = " +chuvi);
		System.out.println("dien tich = "+dientich);
		System.out.println("canh nho la: " +Math.min(rong, dai));

	}

}
