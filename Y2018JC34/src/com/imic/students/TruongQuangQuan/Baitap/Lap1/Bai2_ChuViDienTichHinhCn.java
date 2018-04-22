package com.imic.students.TruongQuangQuan.Baitap.Lap1;

import java.util.Scanner;

public class Bai2_ChuViDienTichHinhCn {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Cạnh 1 = ");
		double edge1 = scanner.nextDouble();
		System.out.print("Cạnh 2 = ");
		double edge2 = scanner.nextDouble();
		System.out.println("Chu vi = "+(edge1 + edge2)*2);
		System.out.println("Diện tích = "+edge1*edge2);
		System.out.println("Cạnh nhỏ = "+Math.min(edge1, edge2));
		// TODO Auto-generated method stub

	}

}
