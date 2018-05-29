package com.imic.students.Dao_Thanh_Long;

import java.util.ArrayList;
import java.util.Scanner;

public class _20180525_Lab6 {

	public static void main(String[] args) {
		Scanner objSc = new Scanner(System.in);
//		bai1_Lab6(objSc);
//		bai2_Lab6(objSc);
		bai3_Lab6(objSc);
		
		objSc.close();
	}
	
	
	public static void bai1_Lab6(Scanner objSc){
		String fullName;
		System.out.printf("Nhap ho ten : ");
		fullName = objSc.nextLine();
		
//		// Cach 1 : 
//		String[] nameArray;
//		nameArray = fullName.split(" ");
//		System.out.printf("Ho : "+ nameArray[0].toUpperCase());
//		System.out.println();
//		
//		System.out.printf("Ten dem : ");
//		for(int i =1;i<nameArray.length-1;i++){
//			System.out.printf(nameArray[i]);
//		}
//		System.out.println();
//		
//		System.out.printf("Ten : "+nameArray[nameArray.length-1].toUpperCase());
//		System.out.println();
		
		// Cach 2 : 
		System.out.println("Ho : " + fullName.trim().substring(0, fullName.trim().indexOf(' ')).toUpperCase());
		
		System.out.println("Ten dem : " + fullName.trim().substring(fullName.trim().indexOf(' ')+1, fullName.trim().lastIndexOf(' ')));
		
		System.out.println("Ten : " + fullName.trim().substring(fullName.trim().lastIndexOf(' ')+1).toUpperCase());
	}

	public static void bai2_Lab6(Scanner objSc){
		ArrayList<SanPham2> dsSanPham = new ArrayList<SanPham2>();
		
		String tenSP,hang;
		double donGia;
		for(int i=0;i<5;i++){
			System.out.printf("Ten SP %d : ",i+1);
			tenSP = objSc.nextLine();
			
			System.out.printf("Don gia %d : ",i+1);
			donGia = objSc.nextDouble();
			objSc.nextLine();
			
			System.out.printf("Hang %d : ",i+1);
			hang = objSc.nextLine();
			System.out.println();
			
			SanPham2 sp = new SanPham2();
			sp.nhap(tenSP, donGia, hang);
			dsSanPham.add(sp);
		}
		
		int count=0;
		for(SanPham2 sp1:dsSanPham){
			if(sp1.getHang().equals("Nokia")){
				sp1.xuat();
				count++;
			}
		}
		if(count==0){
			System.out.println("Khong co san pham nao cua hang Nokia");
		}
	}
	
	public static void bai3_Lab6(Scanner objSc){
		String hoTen,email,sdt,cmt;
		ArrayList<SinhVien_Lab6> svList = new ArrayList<SinhVien_Lab6>();
		
		for(int i=0;i<5;i++){
			System.out.printf("Ho ten :");
			hoTen = objSc.nextLine();
			String regex = "\\w+@\\w+\\.\\w+";
			System.out.printf("Email : ");
			email = objSc.nextLine();
			while(!email.matches(regex)){
				System.out.println("Dinh dang email khong dung. Moi ban nhap lai");
				System.out.printf("Email : ");
				email = objSc.nextLine();
			}
			
			System.out.printf("SDT : ");
			sdt = objSc.nextLine();
			while(!sdt.matches("\\d{10,11}")){
				System.out.println("Dinh dang SDT khong dung. Moi ban nhap lai");
				System.out.printf("SDT : ");
				sdt = objSc.nextLine();
			}
			
			System.out.printf("CMT : ");
			cmt = objSc.nextLine();
			while(!cmt.matches("\\d{9}")){
				System.out.println("Dinh dang CMt khong dung. Moi ban nhap lai");
				System.out.printf("CMT : ");
				cmt = objSc.nextLine();
			}
			
			SinhVien_Lab6 sv = new SinhVien_Lab6(hoTen, email, sdt, cmt);
			svList.add(sv);
		}
		
		for(SinhVien_Lab6 sv:svList){
			sv.xuat();
		}
	}
	
}
