package com.imic.student.Nguyen_Duc;
import java.util.Scanner;

public class ExerciseDay5Lad01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tong = 0;
		int soluong = 0;
		System.out.println("Nhap So Phan Tu Mang : ");
		soluong = input.nextInt();
		int[] a = new int[soluong];
		for( int i = 0; i < soluong; i++) {
			System.out.println("Nhap Vao So Nguyen Cua Mang : ");
			a[i] = input.nextInt();
		}
		System.out.println("-----------------");
		for( int i = 0; i < soluong; i++) {
			if( a[i]%2 == 0) {
				System.out.println("So Chan o Phan Tu Thu " + i + " La : " + a[i]);
			}
			
		}

	}

}
