package com.imic.student.ToMinhTuyen;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_Bai2 {
	// BTVN: Nhap vao mang 10 phan tu, sap xep theo thu tu giam dan
	public static void main(String[] args) {

		int a[] = new int[10];
		boolean check = true;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap Cac phan tu cua Mang");
		
		for (int i = 0; i < a.length; i++) {
				try {
					System.out.println("Phan tu " + i);
					a[i] = scanner.nextInt();
					check = false;
				} catch (Exception e) {
					System.out.println("Ban nhap sai");
					check = true;
					break;
				}
			}
		
		
			System.out.println("Mang goc: " + Arrays.toString(a));

			Arrays.sort(a);

			System.out.println("Mang tang dan: " + Arrays.toString(a));

			for (int i = 0; i < a.length - 1; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[j] > a[i]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;

					}
				}

			}
			System.out.println("Mang giam dan: " + Arrays.toString(a));
		}
	}
