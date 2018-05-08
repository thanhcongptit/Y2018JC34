package com.imic.student.ToMinhTuyen;

import java.util.Scanner;

public class BaiTap6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int test;
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println(" Moi Ban Nhap 1 so");
			number = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Ban da nhap sai moi ban nhap lai");
		}
		test = number % 2;
		if (test == 0) {
			System.out.printf(" So %d la so Chan", number);
		} else {
			System.out.printf(" So %d la so Le", number);
		}
		System.out.println();
		
		int a = 0;
		int sochan = 0;
		int b = 1;
		int sole = 0;
		
		while(a<= number){
			sochan++;
			a= a+2;
		}
		while(b<=number) {
			sole++;
			b=b+2;
		}
		
		System.out.println("So cac so chan la: "+sochan);
		System.out.println("So cac so le la: "+sole);

		int i;
		int j;

		for (i = 0; i <= number; i = i + 2) {
			System.out.println("so Chan = " + i);
		}
		for (j = 1; j <= number; j = j + 2) {
			System.out.println("so le = " + j);
		}
	}
}
