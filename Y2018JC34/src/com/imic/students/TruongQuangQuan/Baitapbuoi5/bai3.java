package com.imic.students.TruongQuangQuan.Baitapbuoi5;

import java.util.Arrays;
import java.util.Scanner;

/*Viết chương trình nhập mảng số nguyên từ bàn phím.
 Sắp xếp và xuất mảng vừa nhập ra màn hình.
 Xuất phần tử có giá trị nhỏ nhất ra màn hình
 Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3*/
public class bai3 {
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

		System.out.println("Mảng sau sắp xếp: " + Arrays.toString(a));
		System.out.println("Phần tử có giá trị nhỏ nhất: " + a[0]);

		int total = 0;
		int counter = 0;
		
		for (int j = 0; j < a.length; j++) {
			if (a[j] % 3 == 0) {
				total += a[j];
				counter++;
			}
		}
		
		if (counter == 0) {
			System.out.println("Mảng không có phần tử nào chia hết cho 3");
		} else
			System.out.println("Trung bình cộng các phần tử chia hết cho 3= " + total / counter);

	}

}
