package com.imic.student.Nguyen_Duc;

import java.util.Scanner;

public class ExerciseDay4Lad07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float a , b , c , x , x1, x2;
		
		
		System.out.println("Giai Phuong Trinh Bac 2 : ax^2 + bx +c ");
		
			System.out.println("Moi Ban nhap Tham so a : ");
			a = input.nextFloat();
			System.out.println("Moi Ban nhap Tham so b: ");
			b = input.nextFloat();
			System.out.println("Moi Ban nhap Tham so c : ");
			c = input.nextFloat();
			
		
		
		if( a == 0) {
			if( b == 0) {
				System.out.println("Phuong trinh Vo Nghiem");
			}
			else {
				x1 = x2 = -c/b;
				System.out.println("Phuong Trinh Co Nghiem X = " + x1);
				return;
			}
		}
		
		x = b*b - (4*a*c) ;
		if( x > 0 ) {
			x1 = (float)(-b + Math.sqrt(x))/(2*a) ;
			x2 = (float)(-b - Math.sqrt(x) )/(2*a) ;
			System.out.println("Phuong Trinh Co 2 Nghiem X1  = " + x1 + ": X2 = " + x2  );
			
		}
		else if( x == 0) {
			System.out.println("Phuong Trinh Co Nghiem Kep : x1 = x2 = " + (-b/2*a));
			
		}
		else {
			System.out.println("Phuong Trinh Vo Nghiem !!! ");
		}


	}

}
