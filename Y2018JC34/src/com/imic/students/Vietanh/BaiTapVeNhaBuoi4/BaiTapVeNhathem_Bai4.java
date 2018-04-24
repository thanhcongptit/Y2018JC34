package com.imic.students.Vietanh.BaiTapVeNhaBuoi4;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class BaiTapVeNhathem_Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("+--------------------+");
		System.out.println("Xin moi ban chon");
		System.out.println("1.Giai phuong trinh bac nhat");
		System.out.println("2.Giai phuong trinh bac hai");
		System.out.println("3.Tinh tien dien");
		System.out.println("4. Ket thuc");
		System.out.println("+--------------------+");

		int nhap = sc.nextInt();
		switch (nhap) {
		case 1: 
			System.out.println("Phuong trinh bac 1 : Ax+B=0");
			System.out.println("Xin moi nhap he so a de tinh");
			String a = sc.nextLine();
			System.out.println("Xin moi nhap he so b de tinh");
			String b = sc.nextLine();

			if (a.equals("") || b.equals("")) {
				System.out.println("Ban chua nhap gia tri vui long nhap");

			} else {
				if (a.equals("0")) {
					if (b.equals("0")) {
						System.out.println("Vo so nghiem");
					} else {
						System.out.println("Vo nghiem");
					}

				}else {
					int a1 = Integer.parseInt(a);
					int b1 = Integer.parseInt(b);
					System.out.println("Phuong trinh co nghiem duy nhat x= "+(-b1/a1));
					
				}
					
				}break;
		case 2: System.out.println("Xin moi nhap cac he so de giai phuong trinh bac 2");
	
		System.out.println("Xin moi nhap he so a");
		String A = sc.nextLine();
		System.out.println("Xin moi nhap he so b");
		String B = sc.nextLine();
		System.out.println("Xin moi nhap he so c");
		String C = sc.nextLine();
		
		if(A.equals("")||B.equals("")||C.equals("")) {
			System.out.println("Ban chua nhap, vui long nhap");
			
		}else {
			System.out.println("a= "+A );
			System.out.println("b= "+B);
			System.out.println("c= "+C);
		}
		
		if(A.equals("0")) {
			System.out.println("Giai phuong trinh bac nhat");
			if (B.equals("0")) {
				if (C.equals("0")) {
					System.out.println("Vo so nghiem");
				} else {
					System.out.println("Vo nghiem");
				}

			}else {
				int B1 = Integer.parseInt(B);
				int C1 = Integer.parseInt(C);
				System.out.println("Phuong trinh co nghiem duy nhat x= "+(-C1/B1));
				
			}
				
			
		
			
		}
		
		
		else {
			int A1 = Integer.parseInt(A);
			int B1 = Integer.parseInt(B);
			int C1 = Integer.parseInt(C);
			int denta = (B1*B1)-(4*A1*C1);
			System.out.println("Denta: "+denta);
			if(denta<0) {
				System.out.println("Vo nghiem");
				
			}else if(denta==0) {
				System.out.println("Phuong trinh co nghiem kep x= "+((-B1)/(2*A1)));
				
			}else {
				double x1 =(-B1+Math.sqrt(denta))/(2*A1);
				double x2 =(-B1-Math.sqrt(denta))/(2*A1);
				System.out.println("Phuong trinh co 2 nghiem phan biet:");
				System.out.println("X1= "+x1);
				System.out.println("X2= "+x2);
			}
		}break;
		
		case 3:	System.out.println("Xin moi nhap vao so dien");
		int sodien = sc.nextInt();
		if(sodien<50) {
			System.out.println("Tien dien hang thang la: "+ (sodien*1000));
			
		}else {
			int tien =50*1000 + (sodien - 50)*1200;
			System.out.println("Tien dien hang thang la: "+tien);
		}break;
		
		case 4: System.out.println("Ket thuc");
		break;
		default: System.out.println("Ban chua chon dung, vui long chon lai");
		break;
}   
}
}
