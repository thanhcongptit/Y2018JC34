package com.imic.students.TruongQuangQuan.BaiTapBuoi11;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in );
		System.out.println("Nhập bán kính : ");
		double r = scanner.nextDouble();
		System.out.println("Chu vi đường tròn = "+r*2*Math.PI);
		System.out.println("Diện tích đường tròn = "+Math.pow(r,2)*Math.PI);
				
	}
	
}
