package com.imic.student.Nguyen_Duc;
import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class ExerciseDay5Lad03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int min = 0;
		int max = 0;
		int n = 0;
		int s = 0;
		int count = 0;
		System.out.println("Nhap Vap So Phan Tu Cua Mang : ");
		System.out.println("-----------------");
		n = input.nextInt();
		int[] a = new int[n];
 		for( int i = 0; i < n; i++) {
 			System.out.println("Nhap Phan Tu Thu " + i + " : ");
			a[i] = input.nextInt();
			
			System.out.println("-----------------");
		}
 		
 		min = a[0];
		max = a[0];
		for( int i = 0; i < n ; i++) {
			x = Math.min(min, a[i]);
			y = Math.max(max, a[i]);
			if( x == a[i]) {
				min  = a[i];
			}
			if( y == a[i]) {
				max = a[i];
			}
		}
		for( int i = 0; i < n; i++) {
			if( a[i]%3 == 0) {
				s += a[i];
				count++;
			}
		}

 		
 		System.out.println("Mang Ban Vua Nhap : " + Arrays.toString(a));
 		Arrays.sort(a);
 		System.out.println("Mang Khi Duoc Sap Xep Giam Dan : " + Arrays.toString(a));
 		System.out.println("Min la : " + min);
 		System.out.println("Max la : " + max);
 		System.out.println("Trung Binh Cong So Chia Het Cho 3 Trong Mang La : " + s/count);
 		
	}

}
