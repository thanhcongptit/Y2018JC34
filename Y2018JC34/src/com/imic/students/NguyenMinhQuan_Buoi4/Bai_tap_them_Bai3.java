package com.imic.students.NguyenMinhQuan_Buoi4;

import java.util.Scanner;

public class Bai_tap_them_Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
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
	}

}
