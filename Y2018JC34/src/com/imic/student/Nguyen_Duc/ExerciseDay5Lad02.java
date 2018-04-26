package com.imic.student.Nguyen_Duc;
import java.util.Arrays;
import java.util.Scanner;

public class ExerciseDay5Lad02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = 0;
		System.out.println("Nhap Vao So Phan Tu Cua Mang : ");
		n = input.nextInt();
		System.out.println("-----------------");
		int[] a = new int[n];
 		for( int i = 0; i < n; i++) {
 			System.out.println("Nhap Phan Tu Thu " + i + " : ");
			a[i] = input.nextInt();
			System.out.println("-----------------");
	 	
		}
 		System.out.println("Mang Ban Vua Nhap : " + Arrays.toString(a));
 		Arrays.sort(a);
 		System.out.println("Mang Khi Duoc Sap Xep Tang Dan : " + Arrays.toString(a));
 		for( int x = 0; x < a.length - 1; x++) {
 			for( int y = x + 1; y < a.length; y++) {
 				if( a[x] < a[y] ) {
 					int temp = a[x];
 					a[x] = a[y];
 					a[y] = temp;
 				}

 			}
 		}
 		System.out.println("Mang Khi Duoc Sap Xep Giam Dan : " + Arrays.toString(a));
	}		
}
