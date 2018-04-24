package com.imic.students.Vietanh.BaiTapVeNhaBuoi4;

import java.util.Scanner;

public class BaiTapThem_Bai2 {
	public static void main(String[] args) {
		System.out.println("Xin moi nhap cac he so de giai phuong trinh bac 2");
		Scanner sc = new Scanner(System.in);
		System.out.println("Xin moi nhap he so a");
		String a = sc.nextLine();
		System.out.println("Xin moi nhap he so b");
		String b = sc.nextLine();
		System.out.println("Xin moi nhap he so c");
		String c = sc.nextLine();
		
		if(a.equals("")||b.equals("")||c.equals("")) {
			System.out.println("Ban chua nhap, vui long nhap");
			
		}else {
			System.out.println("a= "+a );
			System.out.println("b= "+b);
			System.out.println("c= "+c);
		}
		
		if(a.equals("0")) {
			System.out.println("Giai phuong trinh bac nhat");
			if (b.equals("0")) {
				if (c.equals("0")) {
					System.out.println("Vo so nghiem");
				} else {
					System.out.println("Vo nghiem");
				}

			}else {
				int b1 = Integer.parseInt(b);
				int c1 = Integer.parseInt(c);
				System.out.println("Phuong trinh co nghiem duy nhat x= "+(-c1/b1));
				
			}
				
			
		
			
		}
		else {
			int a1 = Integer.parseInt(a);
			int b1 = Integer.parseInt(b);
			int c1 = Integer.parseInt(c);
			int denta = (b1*b1)-(4*a1*c1);
			System.out.println("Denta: "+denta);
			if(denta<0) {
				System.out.println("Vo nghiem");
				
			}else if(denta==0) {
				System.out.println("Phuong trinh co nghiem kep x= "+((-b1)/(2*a1)));
				
			}else {
				double x1 =(-b1+Math.sqrt(denta))/(2*a1);
				double x2 =(-b1-Math.sqrt(denta))/(2*a1);
				System.out.println("Phuong trinh co 2 nghiem phan biet:");
				System.out.println("X1= "+x1);
				System.out.println("X2= "+x2);
			}
		}

	}

}
