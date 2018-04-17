package com.imic.students.Vietanh;

import java.util.Scanner;

public class bttrenlop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Xin moi ban nhap ten");
		String ten = sc.nextLine();
		System.out.println("Xin moi ban nhap tuoi");
		int tuoi = sc.nextInt();
		sc.nextLine();
		System.out.println("Xin moi ban nhap dia chi");
		String diachi = sc.nextLine();
		
		System.out.println("Ten cua ban la:" +ten);
		System.out.println("Tuoi cua ban la:" + tuoi);
		System.out.println("Dia chi cua ban o:" + diachi);
		sc.close();
		 
		
	}

 
}
