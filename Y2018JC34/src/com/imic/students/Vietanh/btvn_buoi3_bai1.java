package com.imic.students.Vietanh;

import java.util.Scanner;

public class btvn_buoi3_bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("XIn moi ban nhap ho ten");
		String name = sc.nextLine();
		System.out.println("Xin moi ban nhap diem trung binh");
		double diemtrungbinh = sc.nextDouble();
		
		System.out.print("Ho va ten: "+name);
		System.out.println(" diem: "+diemtrungbinh);
	}

}
