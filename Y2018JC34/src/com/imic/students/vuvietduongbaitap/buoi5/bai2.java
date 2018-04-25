package com.imic.students.vuvietduongbaitap.buoi5;

import java.util.Arrays;
import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		for(int i = 0; i<9; i++) {
			System.out.println("moi ban nhap phan tu: "+i);
			a[i] = sc.nextInt();
		}
		System.out.println("mang goc la: " +Arrays.toString(a));
		for(int i=0; i<9; i++) {
			for(int j=1; j<10; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(" mang săp xep giam dan la: "+a);
	}

}
