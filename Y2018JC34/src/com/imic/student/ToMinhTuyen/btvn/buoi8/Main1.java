package com.imic.student.ToMinhTuyen.btvn.buoi8;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		/* khong su dung phuong thuc nhap() va xuat() tu calass SanPham
		 
		 TODO Auto-generated method stub
		 System.out.println(" Nhap so luong san pham");
		 Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		 scanner.nextLine();
		
		 SanPham sanpham[] = new SanPham[n];
		 for (int i = 0; i < sanpham.length; i++) {
		 sanpham[i] = new SanPham();
		 System.out.println(" San pham "+ (i+1));
		 String tenSP = scanner.nextLine();
		 sanpham[i].setTenSP(tenSP);
		
		 System.out.println("Gia San Pham " + (i+1));
		 double giaSP = scanner.nextDouble();
		 sanpham[i].setDonGia(giaSP);
		
		 System.out.println("Giam gia % cua sp "+ (i+1) );
		 double giamGia = scanner.nextDouble();
		 sanpham[i].setGiamGia(giamGia);
		 scanner.nextLine();
		
		 }
		 for (int i = 0; i < sanpham.length; i++) {
			sanpham[i].xuat();
			double thuenk = sanpham[i].getDonGia() * 10 / 100;
			sanpham[i].thuenhapkhau(thuenk);
		}
			*/
		
		
		// Bai 2: Goi phuong thuc nhap() va xuat() tu class SanPham()
		 	
		System.out.println(" Nhap so luong san pham");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		SanPham sanpham[] = new SanPham[n];
		
		for (int i = 0; i < sanpham.length; i++) {
			sanpham[i] = new SanPham();
			sanpham[i].nhap();

		}
		for (int i = 0; i < sanpham.length; i++) {
			sanpham[i].xuat();
			
		}
		// Bai 3: khoi tao 2 ham tao 2 tham so va 3 tham so
		
		SanPham sp1 = new SanPham("banhkem", 250000, 10);
		SanPham sp2 = new SanPham("Banhbao", 10000);
		sp1.xuat();
		sp2.xuat();
		
		//Bai 4: Ok
		// TEST
		SanPham sp3 = new SanPham();
		sp3.nhap();
		SanPham sp4 = new SanPham(sp3.getTenSP(), sp3.getDonGia());
		sp4.xuat();
		
		
	}

}
