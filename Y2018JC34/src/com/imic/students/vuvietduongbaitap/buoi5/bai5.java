package com.imic.students.vuvietduongbaitap.buoi5;

import java.util.Arrays;
import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		System.out.println("moi ban ban so nguyen duong");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while (n>0) {
			sum = sum + n%10;
			n = n/10;
		}
		System.out.println("tong cac chu so cua n la: " + sum);
		
		System.out.println("moi ban nhap so nguyen duong");
		n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			if(n%i == 0) {
				System.out.println("n co mot uoc la:" +n/i);
				
			}
		}
	}

}
