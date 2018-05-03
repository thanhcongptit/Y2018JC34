package com.imic.student.Nguyen_Duc;
import java.util.Arrays;
import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;
public class ExerciseDay5Lad_B {

	public static void main(String[] args) {
		int n = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap Vao So Phan Tu Cua Mang");
		n = input.nextInt();
		int[] a = new int[n];
		System.out.println("-----------");
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap Phan Tu Thu " + i + " : ");
			a[i]  = input.nextInt();
		}
		System.out.println("Gia Tri Phan Tu Trong Mang La : " + Arrays.toString(a));
		
		Mang m = new Mang();
		m.MaxMin(a);
		m.SoChan(a);
		m.SoNguyenTo(a);
		m.TangDanGiamDan(a);
		m.Tim(a);
	}
}
class Mang{
	public int MaxMin(int[] a){
		int min = 0, max = 0, x = 0, y = 0;
		for(int i = 0; i < a.length; i++) {
			min = a[0];
			max = a[0];
			x = Math.min(min, a[i]);
			y = Math.max(max, a[i]);
			if( x == a[i]) {
				min = a[i];
			}
			if( y == a[i]) {
				max = a[i];
			}
		}
		System.out.println("Min la : " + min + "\nMax la : " + max);
		System.out.println("----------------");
		return 0;
	}
	public int SoChan(int[] a) {
		int dem = 0;
		for(int i = 0; i < a.length; i++) {
			if( a[i] % 2 == 0) {
				dem++;
			}
		}
		System.out.println("Tong So Chan Trong Mang La : "  + dem);
		System.out.println("----------------");
		return dem;
	}
	public int SoNguyenTo(int[] a) {
		int dem = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 1; j <= a[i]; j++) {
				if(a[i] % j == 0) {
					dem++;
				}
			if( dem == 2) {
				System.out.println(a[i]);
				System.out.println("La So Nguyen To");
				System.out.println("---------------");
			}
		}
			
		}
		return 0;
	}
	public int TangDanGiamDan(int[] a) {
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
 		Arrays.sort(a);
 		System.out.println("Mang Khi Duoc Sap Xep Gian Dan :" + Arrays.toString(a));
 		System.out.println("---------------");
		return 0;
	}
	public int Tim(int[] a) {
		int x = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap So Bat Ky");
		x = input.nextInt();
		for(int i = 0; i < a.length; i++) {
			if(a[i] == x) {
				System.out.println("Phan Tu Thu " + i + " Co gia Tri = " + x);
			}
		}
		return 0;
	}
}