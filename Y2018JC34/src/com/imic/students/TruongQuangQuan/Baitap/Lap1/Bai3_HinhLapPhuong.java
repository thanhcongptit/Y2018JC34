package com.imic.students.TruongQuangQuan.Baitap.Lap1;

import java.util.Scanner;

public class Bai3_HinhLapPhuong {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chiều dài cạnh = ");
		Double edge = scanner.nextDouble();
		System.out.println("Thể tích khối lập phương = "+Math.pow(edge, 3));
	}

}
