package com.imic.students.Dao_Thanh_Long;

import java.util.Scanner;

public class _20180511_btvn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner objSc = new Scanner(System.in);
//		bai2(objSc);
		bai3(objSc);
		
		objSc.close();
		
	}

	public static void bai2(Scanner objSc){
		String tenSP;
		double donGia;
		double giamGia;
		sanPham[] dsSanPham = new sanPham[2];
		System.out.println("");
		System.out.println("Nhap thong tin 2 san pham");
		for(int i=0 ;i<2;i++){
			System.out.printf("Ten SP %d : ",i);
			tenSP = objSc.nextLine();
			
			System.out.printf("Gia SP %d : ",i);
			donGia = objSc.nextDouble();
			objSc.nextLine();

			System.out.printf("Giam gia SP %d : ",i);
			giamGia = objSc.nextDouble();
			objSc.nextLine();	
			
			dsSanPham[i] = new sanPham();
			dsSanPham[i].nhap(tenSP, donGia, giamGia);
		}
		
		for(int i=0;i<2;i++){
			dsSanPham[i].xuat();
		}
	}
	
	public static void bai3(Scanner objSc){		
		String tenSP;
		double donGia;
		double giamGia;
		
		sanPham[] dsSanPham = new sanPham[2];
		System.out.println("");
		System.out.println("Nhap thong tin san pham 1, khong giam gia");
		System.out.printf("Ten SP %d : ",1);
		tenSP = objSc.nextLine();
		System.out.printf("Gia SP %d : ",1);
		donGia = objSc.nextDouble();
		objSc.nextLine();
		dsSanPham[0] = new sanPham(tenSP, donGia);
		
		
		System.out.println("");
		System.out.println("Nhap thong tin san pham 2, co giam gia");
		System.out.printf("Ten SP %d : ",2);
		tenSP = objSc.nextLine();	
		System.out.printf("Gia SP %d : ",2);
		donGia = objSc.nextDouble();
		objSc.nextLine();
		System.out.printf("Giam gia SP %d : ",2);
		giamGia = objSc.nextDouble();
		objSc.nextLine();
		dsSanPham[1] = new sanPham(tenSP, donGia,giamGia);
		
		for(int i=0;i<2;i++){
			dsSanPham[i].xuat();
		}
	}
	
}
