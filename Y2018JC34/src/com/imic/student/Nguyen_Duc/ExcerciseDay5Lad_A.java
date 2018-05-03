package com.imic.student.Nguyen_Duc;
import java.util.Scanner;

public class ExcerciseDay5Lad_A {

	public static void main(String[] args) {
		int a = 0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Nhap So Nguyen Duong : ");
			a = input.nextInt();
			if(a < 0) {
				System.out.println("K phai So Nguyen Duong.!!! \nMoi Ban Nhap Lai\n--------------");
			}
		System.out.println("-----------------");	
		}while( a <= 0);
		
		TinhTongCacChuSo t1 = new TinhTongCacChuSo();
		t1.tinhTong(a);
		Timcacuoc u1 = new Timcacuoc();
		u1.Tim(a);		
	}
}

class TinhTongCacChuSo{
	public int tinhTong(int a) {
		int tong = 0, count = 0;
		while(a > 0) {
			tong += a%10;
			a/=10;
			count++;
		}
		System.out.println("So Ban Vua Nhap Co : " + count + " Chu so");
		System.out.println("Tong Cac Chu So La : " + tong);
		return tong;
	}
}
class Timcacuoc{
	public int Tim(int a) {
		System.out.println("Uoc lan Luot La :");
		for(int i = 1; i <= a; i++) {
			if( a % i == 0) {
				System.out.println(i);
				if( Kiemtrasonguyento(i) == 1 ) {
					System.out.println("Voi " + i + " La So Nguyen to");
				}
			}
		}
		return 0;
	}
	public static int Kiemtrasonguyento(int x){
		
			int count = 0;
			for(int i = 1; i <= x ; i++) {
				if( x % i == 0) {
					count++;
				}
			}
			if( count == 2) {
				return 1;
			}
			else {
				return 0;
			}
		}
}
	
