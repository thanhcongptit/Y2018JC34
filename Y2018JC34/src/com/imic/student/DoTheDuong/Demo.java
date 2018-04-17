package com.imic.student.DoTheDuong;

import java.util.Scanner;

public class Demo {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap ho ten:");
		String hoTen = scanner.nextLine();
		System.out.println("Ho va Ten: " + hoTen);
		
		System.out.println("Nhap tuoi:");
		int tuoi = scanner.nextInt();
		System.out.println("Tuoi: " + tuoi);
		scanner.nextLine();
		
		System.out.println("Nhap dia chi:");
		String diaChi = scanner.nextLine();
		System.out.println("Dia chi: " + diaChi);
	}
}
