package com.imic.students.TruongQuangQuan.Baitapbuoi5;

import java.util.Arrays;
import java.util.Scanner;

//BTVN: Nhap vao mang 10 phan tu, sap xep theo thu tu giam dan 
public class Bai2 {
	public static void main(String[] args) {

		int[] a = new int[10];
		int i = 0;
		boolean checkInput= true;
		Scanner sc = new Scanner(System.in);
		
		do {
			try {
				while (i < a.length) {
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

		System.out.println("Mảng gốc: "+Arrays.toString(a));

		for (i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.print("Thứ tự giảm dần của mảng: ");
		System.out.println(Arrays.toString(a));
	}

}
