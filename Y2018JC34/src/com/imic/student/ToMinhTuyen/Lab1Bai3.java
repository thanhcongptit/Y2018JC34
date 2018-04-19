package com.imic.student.ToMinhTuyen;
import java.util.Scanner;
public class Lab1Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a;
		double V;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap Chieu dai canh");
		a = sc.nextFloat();
		//V = a * a * a;
		V = Math.pow(a, 3);
		
		System.out.println("The tich cua hinh lap phuong la: " + V);
		
	
	}

}
