package com.imic.students.Vietanh.BaiTapVeNhaBuoi5;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Xin moi nhap so luong phan tu cua mang");
		int soluong = sc.nextInt();

		int a[] = new int[soluong];

		for (int i = 0; i < soluong; i++) {
			System.out.println("Xin moi nhap phan tu thu: " + i);
			a[i] = sc.nextInt();

		}
        for(int i = 0; i <a.length;i++) {
        	if(a[i]%2==0) {
        		System.out.println("So chan trong mang la: "+a[i]);
        		
        	}
        }
	}

}
