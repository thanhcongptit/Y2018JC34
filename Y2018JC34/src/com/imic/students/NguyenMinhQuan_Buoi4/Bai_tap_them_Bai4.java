package com.imic.students.NguyenMinhQuan_Buoi4;

import java.util.Scanner;

public class Bai_tap_them_Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("+-------------------+");
		System.out.println("1.Giai PT bac nhat");
		System.out.println("2.Giai PT bac hai");
		System.out.println("3.Tinh tien dien");
		System.out.println("4.Ket thuc");
		System.out.println("+-------------------+");
		System.out.println("Chon chuc nang:");

		String luachon = sc.nextLine();

		if (luachon.equalsIgnoreCase("1")) {
			System.out.println("Ban chon giai PT bac nhat");
			System.out.println("------ Giai phuong trinh ax + b = 0 ---------");
			System.out.println("Nhap so a");
			int a = sc.nextInt();
			System.out.println("Nhap so b");
			int b = sc.nextInt();
			double ketqua = -b / a;
			if (a == 0) {
				if (b == 0) {
					System.out.println("Phuong trinh vo so nghiem");
				} else {
					System.out.println("Phuong trinh vo nghiem");

				}
			} else {
				System.out.println("Phuong trinh co nghiem : x=" + ketqua);
			}

		}

		if (luachon.equalsIgnoreCase("2")) {
			System.out.println("Ban chon giai PT bac hai");
			System.out.println("Nhap so a");
			int a = sc.nextInt();

			System.out.println("Nhap so b");
			int b = sc.nextInt();

			System.out.println("Nhap so c");
			int c = sc.nextInt();

			int ketqua1 = sc.nextInt();

			int delta = b ^ 2 - 4 * a * c;

			int nghiemkep = -b / (2 * a);

			double nghiemx1 = (-b + (Math.sqrt(delta))) / (2 * a);

			double nghiemx2 = (-b - (Math.sqrt(delta))) / (2 * a);
			if (a == 0) {

				if (b == 0) {

					if (c == 0) {
						System.out.println("Phuong trinh vo so nghiem");
					} else {
						System.out.println("Phuong trinh vo nghiem");

					}
				} else {
					System.out.println("Phuong trinh co nghiem : x=" + ketqua1);
				}
			}

			else {
				if (delta < 0) {

					System.out.println("PT vo nghiem");
				}

				else if (delta == 0) {
					System.out.println("PT co nghiem kep x= " + nghiemkep);
				}

				else {
					System.out.println("PT co 2 nghiem phan biet x1 = " + nghiemx1);
					System.out.println("PT co 2 nghiem phan biet x2 = " + nghiemx2);
				}

			}
		}
		
		if(luachon.equalsIgnoreCase("3")){
			System.out.println("Ban chon tinh tien dien");
			
			System.out.println("Nhap so tien dien:");
			int sodien = sc.nextInt();

			int tien1 = sodien*1000;
			int tien2 = 50*1000+(sodien-50)*1200;

			if(sodien<50) 	{
				System.out.println("Tien phai dong la:" +tien1 );
			}

			else {
				System.out.println("Tien phai dong la:" +tien2);
			}
			
			if(luachon.equalsIgnoreCase("4")) {
				System.out.println("Thoat Chuong trinh");
				
				
			}
			
		}

	}

}
