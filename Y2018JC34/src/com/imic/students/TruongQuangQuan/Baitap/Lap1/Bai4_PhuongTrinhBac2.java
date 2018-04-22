package com.imic.students.TruongQuangQuan.Baitap.Lap1;

import java.util.Scanner;

public class Bai4_PhuongTrinhBac2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		Phương trình bậc 2 ax^2 + bx + c = 0
		System.out.print("a = ");
		double a = scanner.nextDouble();
		System.out.print("b = ");
		double b = scanner.nextDouble();
		System.out.print("c = ");
		double c = scanner.nextDouble();
		double Delta = (Math.pow(b, 2)-4*a*c);
		System.out.println("Delta = "+Delta);
		if (Delta >= 0) 
		System.out.println("Căn Delta = "+Math.sqrt(Delta));					
	}

}
