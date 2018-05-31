package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi11;

import java.util.Scanner;

public class Exercisel {
	public static void main(String[] arrgs) {

		Scanner nhap = new Scanner(System.in);
		int banKinh;
		System.out.println("Tinh chu vi va dien tich hinh tron");
		System.out.print("Moi bannhap ban kinh : ");
		banKinh = nhap.nextInt();

		double chuVi = 2 * Math.PI * banKinh;
		double dienTich = Math.PI * Math.pow(banKinh, 2);

		System.out.println("chu vi = " + chuVi);
		System.out.println("dien tich = " + dienTich);

	}
}
