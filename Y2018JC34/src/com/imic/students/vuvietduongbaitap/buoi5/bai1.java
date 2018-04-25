package com.imic.students.vuvietduongbaitap.buoi5;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("moi ban nhap so luong phan tu");
		int soluong = sc.nextInt();
		int a[] = new int [soluong];
		for(int i=0; i<soluong; i++) {
			System.out.println("moi ban nhap phan tu" +i);
			a[i] = sc.nextInt();
		}
		int i = 0;
		while (i<soluong) {
			if(a[i] % 2 == 0) {
				System.out.println("so chan cua mang la: "+a[i]);
				i++;
			}else i++;
		}
	}

}
