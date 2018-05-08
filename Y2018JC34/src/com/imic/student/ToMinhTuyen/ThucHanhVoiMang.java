package com.imic.student.ToMinhTuyen;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ThucHanhVoiMang {

	public static void main(String[] args) {
		int soluong;
		int tong = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Moi Ban Nhap So Luong phan tu cua mang");
		soluong = sc.nextInt();
		int a[] = new int[soluong];
		System.out.println("Nhap cac phan tu cua mang");
		for (int i = 0; i < soluong; i++) {
			System.out.println("Phan tu " + i);
			a[i] = sc.nextInt();
		}
		for (int temp : a) {
			tong = tong + temp;
		}
		double tb = tong / soluong;
		System.out.println("Trung binh cong cac phan tu cua mang :" + tb);
		
		
		

	}

}
