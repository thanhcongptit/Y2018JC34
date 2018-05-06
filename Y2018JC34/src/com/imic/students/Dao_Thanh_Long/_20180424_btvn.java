package com.imic.students.Dao_Thanh_Long;

import java.util.Arrays;
import java.util.Scanner;

public class _20180424_btvn {

	
	
	public static void main(String[] args) {
		Scanner objSc = new Scanner(System.in);
//		bai3(objSc);
		bai4(objSc);
		objSc.close();
	}

	/*
	 * Viet chuong trinh nhap mang so nguyen tu ban phim
	 * - Sap xep va xuat mang vua nhap ra man hinh
	 * - Xuat phan tu co gia tri nho nhat ra man hinh
	 * - Tinh va xuat ra man hinh trung binh cong cac phan tu chia het cho 3
	 * */
	public static void bai3(Scanner objSc){
		
		int n=0;
		int[] array,tempArr;
		int min;
		boolean boolTemp = true;
//		while(boolTemp){}
		try {
			System.out.printf("So luong phan tu cua mang = ");
			n = objSc.nextInt();
			if( n < 0){
				System.out.println("Gia tri ban nhap khong phai la so nguyen duong");
				return;
			}else{
				array = new int[n];
				tempArr = new int[n];
				
				array = getArrValue(objSc,n);
				tempArr = Arrays.copyOf(array, n);
				
				// Xuat mang vua nhap ra man hinh
				System.out.println("Array[] = " + Arrays.toString(array));
				
				// Sap xep tang dan
				System.out.println();
				System.out.println("Sap xep cac phan tu trong mang theo thu tu tang dan");
				Arrays.sort(tempArr);
				System.out.println("Array[] = " + Arrays.toString(tempArr));

				// Hien thi cac phan tu co gia tri nho nhat
				System.out.println();
				System.out.println("Cac phan tu co gia tri nho nhat");
				getIndexOfMin(array,n,tempArr[0]);
				
				// Tinh trung binh cong
				trungBinhCong(array,n);
				
			}
			
		} catch (Exception e) {
			System.out.println("Gia tri ban nhap khong phu hop");
			return;
		}
		
		
		
	}
	
	public static int[] getArrValue(Scanner objSc,int n){
		int[] tempArr = new int[n];
		boolean boolTemp = true;
		
		for (int i=0;i<n;i++){
			boolTemp = true;
			while(boolTemp){
				try {
					System.out.printf("a[%d] = ",i);
					tempArr[i] = objSc.nextInt();
					System.out.println();
					boolTemp = false;
					
				} catch (Exception e) {
					System.out.println("Gia tri ban nhap khong phu hop.Vui long nhap lai");
					boolTemp = true;
					objSc.nextLine();
				}
			}
		}
		return tempArr;
	}
	
	public static void getIndexOfMin(int[] array,int n,int min){	
		int count=0;
		for(int i=0;i<n;i++){
			if(min == array[i]){
				System.out.printf("a[%d] = %d",i,array[i]);
				System.out.println();
			}
		}
	}
	
	public static void trungBinhCong(int[] arr,int n){
		int sum=0,count=0;
	
		for(int i=0;i<n;i++){
			if(arr[i]%3 == 0 ){
				sum += arr[i];
				count++;
			}
		}
		
		if(count == 0){
			System.out.println("Khong co so nao chia het cho 3");
		}else{
			System.out.println("TBC = " + (sum/count));
			System.out.println();
		}
	}
	
	
	/*
	 * Viet chuong trinh nhap 2 mang ho ten va diem cua sinh vie
	 * - Xuat 2 mang da nhap, moi sinh vien co them hoc luc
	 * - sap xep danh sach sinh vien da nhap tang dan theo diem
	 * 
	 * */
	public static void bai4(Scanner objSc){
		String[] hoTen,hocLuc;
		float[] diem;	
		float min;
		int[] indexArr;
		int n;	
		try {
			System.out.printf("n = ");
			n = objSc.nextInt();
			
			hoTen = new String[n];
			hocLuc = new String[n];
			diem = new float[n];
			
			// Nhap mang ho ten
			System.out.println("Nhap ho ten va diem cua sinh vien");
			for (int i=0;i<n;i++){
				objSc.nextLine();
				System.out.printf("Ho_Ten[%d] = ",i);
				hoTen[i] = objSc.nextLine();
				
				System.out.printf("Diem[%d] = ",i);
				diem[i] = objSc.nextFloat();
				if (diem[i] < 5){
					hocLuc[i] = "Yeu";
				}else if ( 5 <= diem[i] && diem[i] < 6.5){
					hocLuc[i] = "Trung binh";
				}else if ( 6.5 <= diem[i] && diem[i] < 7.5){
					hocLuc[i] = "Kha";
				}else if ( 7.5 <= diem[i] && diem[i] < 9){
					hocLuc[i] = "Gioi";
				}else if(9 <= diem[i]){
					hocLuc[i] = "Gioi";
				}
			}
			
			// Hien thi Ho ten va diem
			System.out.println();
			System.out.println("Hien thi ho ten va diem");
			System.out.printf("Ho_Ten[] = [" );
			for(int i=0;i<n;i++){
				if (i == (n-1)){
					System.out.printf(hoTen[i] + "]");
				}else{
					System.out.printf(hoTen[i] + " , ");
				}
			}
			System.out.println();
			System.out.println("Diem[] = " + Arrays.toString(diem));
			
			//Sap xep sinh vien da nhap tang dan theo diem
			System.out.println();
			System.out.println("Sap xep danh sach sinh vien tang dan theo diem");
			float tempFloat;
			String tempString;
			
			for  ( int  i =  0 ; i <n -  1 ; i ++) {  
		        for  ( int  j =  0 ; j <n -  1  - i; j ++) {  
		            if  (diem [j]> diem [j +  1 ]) {  
		            	tempFloat = diem [j];  
		                diem [j] = diem [j +  1 ];  
		                diem [j +  1 ] = tempFloat; 
		                
		                tempString = hoTen [j];
		                hoTen [j] = hoTen [j +  1 ];  
		                hoTen [j +  1 ] = tempString; 
		                
		                tempString = hocLuc [j];
		                hocLuc [j] = hocLuc [j +  1 ];  
		                hocLuc [j +  1 ] = tempString;
		            }  
		        }  
		    }
			
			System.out.printf("Ho_Ten[] = [" );
			for(int i=0;i<n;i++){
				if (i == (n-1)){
					System.out.printf(hoTen[i] + "]");
				}else{
					System.out.printf(hoTen[i] + " , ");
				}
			}
			System.out.println();
			System.out.println("Diem[] = " + Arrays.toString(diem));
			System.out.printf("Hoc_Luc[] = [" );
			for(int i=0;i<n;i++){
				if (i == (n-1)){
					System.out.printf(hocLuc[i] + "]");
				}else{
					System.out.printf(hocLuc[i] + " , ");
				}
			}
			
			
		} catch (Exception e) {
			
		}
	}
	
	
}
