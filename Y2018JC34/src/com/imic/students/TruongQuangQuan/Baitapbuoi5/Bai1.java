package com.imic.students.TruongQuangQuan.Baitapbuoi5;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
//	Nhap vao 1 mang so nguyen, in ra tat cac so chan cua mang do 

	public static void main(String[] args) {

		int n = 0;
		boolean checkInput = true;
		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.print("mảng gồm số phần tử , n= ");
				n = sc.nextInt();
				checkInput = true;
			} catch (Exception e) {
				System.out.println("Bạn đã nhập sai kiểu dữ liệu, hãy nhập lại");
				sc.nextLine();
				checkInput = false;
			}
		} while (!checkInput);

		int i = 0;
		int[] a = new int[n];
		checkInput = true;

		do {
			try {
				while (i < n) {
					System.out.printf("số thứ %d = ", i+1);
					a[i] = sc.nextInt();
					i++;
					checkInput = true;
				}
			} catch (Exception e) {
				System.out.println("Bạn đã nhập sai kiểu dữ liệu, hãy nhập lại");
				sc.nextLine();
				checkInput = false;
			}
		} while (!checkInput);
		
		Arrays.sort(a);

		System.out.print("Các số chẵn của mảng : ");
		int totalEven = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + ",");
				totalEven++;
			}
		}

		if (totalEven == 0) {
			System.out.println("Mảng không có số chẵn.");
		}
	}
}