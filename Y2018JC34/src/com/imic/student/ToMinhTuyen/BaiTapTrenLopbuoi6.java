package com.imic.student.ToMinhTuyen;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

import java.util.Arrays;

public class BaiTapTrenLopbuoi6 {

	public static void main(String[] args) {
		// String chuoi = "To Minh Tuyen";
		// String mangchuoi [] = chuoi.split(" ");
		System.out.println("Moi Ban nhap mot chuoi");
		Scanner scanner = new Scanner(System.in);
		String chuoi = scanner.nextLine();
		System.out.println("Chuoi ban vua nhap la:" + chuoi);

		String mangchuoi[] = chuoi.split(" ");
		System.out.println("Mang chuoi: " + Arrays.toString(mangchuoi));
		int dem[] = new int[mangchuoi.length];
		
		
		for (int i = 0; i < mangchuoi.length; i++) {
			int dem1 = 0;
			for (int j = 0; j < mangchuoi.length; j++) {
				if (mangchuoi[i].equalsIgnoreCase(mangchuoi[j])) {
					dem1++;
					
				}
			}
			dem[i] = dem1;
			System.out.println("so lan xuat hien " + mangchuoi[i] + " la: " +dem[i]);
	
		}
		

	}
}
