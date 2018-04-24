package com.imic.students.Vietanh;

import java.util.Scanner;

public class bttrenlop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Xin moi ban nhap mang voi n so nguyen");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		for(int i=0; i<n;i++) {
			System.out.println("a" + i + "=");
			a[i] = sc.nextInt();
			
			
		}
    double tong = 0;
    for(int x:a) {
    	tong = (tong+x);
    	
    	
    }   
    double tbc = tong/n;
    	System.out.println("Trung binh cong: "+tbc);
	}

}
