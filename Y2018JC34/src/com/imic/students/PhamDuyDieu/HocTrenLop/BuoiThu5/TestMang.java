package com.imic.students.PhamDuyDieu.HocTrenLop.BuoiThu5;

import java.util.Scanner;

public class TestMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Khai báo mảng số nguyên: 
 * int[]a;
 * int b[];
 * String[]
 * BÀI TẬP: Nhập vào 1 mảng số nguyên. Tính và xuất trung bình cộng.
 */
		int b=0;
		int TBC=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào số lượng phần tử của mảng: ");
		b = sc.nextInt();
		int a[] = new int[b];
		System.out.println("Bạn vừa khai báo mảng a["+b+"]\nMời bạn nhập vào giá trị các phần tử: ");
		for(int i=0; i<b; i++) {
			System.out.println("a["+i+"] = ");
			a[i]= sc.nextInt();
			TBC +=a[i];
			if(i==(b-1)) {
				System.out.println("Trung bình cộng: "+ ((TBC)/b));
			}
		}
		
		
	}

}
