package com.imic.students.Dao_Thanh_Long;

import java.util.Scanner;

public class Example001 {

	public static void main(String[] args) {		
		int soPhanTu=0;
		double arr[];
		double tong=0;
		boolean tiepTuc = true;
		Scanner objSc = new Scanner(System.in);
		
		while(tiepTuc){
			try {
				System.out.println("Nhap so phan tu cua mang a");
				soPhanTu = objSc.nextInt();
				tiepTuc = false;
			} catch (Exception e) {
				System.out.println("Gia tri ban nhap khong hop le");
				objSc.nextLine();
			}
		}
		
		arr = new double[soPhanTu];	
		
		for(int i=0;i<soPhanTu;i++){
			System.out.printf("a[%d] = ",i);
			arr[i] = objSc.nextDouble();
			tong += arr[i];
		}	
		System.out.printf("Trung binh cong = %.2f" , (tong/soPhanTu));
			
		objSc.close();
	}

}
