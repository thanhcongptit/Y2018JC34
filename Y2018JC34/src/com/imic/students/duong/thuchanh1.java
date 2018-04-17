package com.imic.students.duong;

import java.util.Scanner;

public class thuchanh1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("moi ban nhap so tuoi");
		int tuoi = scanner.nextInt();
		scanner.nextLine();
		System.out.println("gia tri tuoi " + tuoi);
		System.out.println("Moi ban nhap dia chi");
		String diaChi = scanner.nextLine();
		scanner.nextLine();
		System.out.println("dia chi " + diaChi);

	}

}
