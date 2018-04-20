package com.imic.student.Nguyen_Duc;

import java.util.Scanner;

public class ExerciseDay4Lad06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, countA = 0, countB = 0;
		
		for( a = 0; a <= 10; a++) {
			System.out.println("Enter your Auto Number 0 ==> 100 :");
			b = input.nextInt();
			if( b%2 == 0) {
				countA += 1;
			}
			else {
				countB += 1;
			}
		}
		System.out.println("Even number is : " + countA);
		System.out.println("Even number is : " + countB);
		

	}

}
