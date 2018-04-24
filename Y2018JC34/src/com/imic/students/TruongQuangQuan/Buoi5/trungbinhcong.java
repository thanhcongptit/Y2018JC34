package com.imic.students.TruongQuangQuan.Buoi5;

import java.util.Scanner;

public class trungbinhcong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("mảng gồm số phần tử , n= ");
		int n = sc.nextInt();
		int i = 0;
		double a[] = new double[n];
		while (i < n) {
			System.out.printf("số thứ %d : ", i);
			a[i] = sc.nextDouble();
			sc.nextLine();
			i++;
		}
		double total = 0;
		for (double j : a) {
			total += j;
		}
		System.out.println("Trung bình cộng = " + total / a.length);

	}

}
