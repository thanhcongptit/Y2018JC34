package com.imic.students.NguyenMinhQuan_Buoi4;

import java.util.Scanner;

public class Bai_6_imic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap 1 so bat ky: ");
		int socanxuly =sc.nextInt();
		
		if(socanxuly %2 ==0) {
			
			System.out.println("Day la so chan");
		}
		else {
			System.out.println("Day la so le");
		}
	}

}
