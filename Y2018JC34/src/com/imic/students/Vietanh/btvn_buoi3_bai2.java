package com.imic.students.Vietanh;

import java.util.Scanner;

public class btvn_buoi3_bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Xin moi ban nhap chieu dai");
		int cd = sc.nextInt();
		System.out.println("xin moi ban nhap chieu rong");
		int cr = sc.nextInt();
		
		int canhnhonhat =Math.min(cd, cr);
		System.out.println("Chu vi hcn la: "+ (cd+cr)*2);
		System.out.println("Dien tich hcn la: "+(cd*cr));
		System.out.println("Canh nho cua hcn la: "+canhnhonhat);
		
	}

}
