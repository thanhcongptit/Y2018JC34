package com.imic.students.TruongQuangQuan.Baitapbuoi5;

import java.util.Scanner;

//1.Viết chương trình nhập số nguyên dương n và thực hiện các chức năng sau: 
//a) Tính tổng các chữ số của n. 
//b) Liệt kê các ước số của n. 
//c) Liệt kê các ước số là nguyên tố của n.

public class BaitapBosung1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int number = 0;
		int total = 0;

		System.out.print("Mời bạn nhập số nguyên dương n : ");
		number = sc.nextInt();
		
		//a) Tính tổng các chữ số của n. 
		int numberCheck = number;

		while (numberCheck != 0) {
			int numberx = numberCheck % 10;
			total += numberx;
			numberCheck = numberCheck / 10;
		}
		System.out.println("Tổng các chữ số của n= " + total);
		
		//b) Liệt kê các ước số của n. 
		System.out.print("Các ước số của n : ");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.println();
		
		//c) Liệt kê các ước số là nguyên tố của n.
		System.out.print("Các ước số là số nguyên tố của n : ");
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				int k = 0;
				for (int j = 1; j <= i; j++) {
					if (i % j == 0)
						k++;
				}
				if (k <= 2) {
					System.out.print(i + ",");
				}
			}
		}
	}
}
