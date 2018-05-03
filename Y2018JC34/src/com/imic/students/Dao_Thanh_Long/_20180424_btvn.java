package com.imic.students.Dao_Thanh_Long;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _20180424_btvn {

	public static void main(String[] args) {
		Scanner objSc = new Scanner(System.in);
		System.out.println("==================================================================================");
		System.out.println("Bai 3 : Viet chuong trinh nhap mang so nguyen tu ban phim");
		System.out.println("- Sap xep va xuat mang vua nhap ra man hinh");
		System.out.println("- Xuat phan tu co gia tri nho nhat ra man hinh");
		System.out.println("- Tinh va xuat ra man hinh trung binh cong cac phan tu chia het cho 3");
		System.out.println();
		bai3(objSc);
		
		System.out.println("==================================================================================");
		System.out.println("Bai 4 : Viet chuong trinh nhap 2 mang ho ten va diem cua sinh vien");
		System.out.println("- Xuat 2 mang da nhap, moi sinh vien co them hoc luc");
		System.out.println("- sap xep danh sach sinh vien da nhap tang dan theo diem");
		System.out.println();
		bai4(objSc);
		
		System.out.println("==================================================================================");
		System.out.println("Bài 1 : Viết chương trình nhập số nguyên dương n và thực hiện các chức năng sau: ");
		System.out.println("a) Tính tổng các chữ số của n.");
		System.out.println("b) Liệt kê các ước số của n.");
		System.out.println("c) Liệt kê các ước số là nguyên tố của n.");
		System.out.println();
		bai1Them(objSc);
		
		System.out.println("==================================================================================");
		System.out.println("Bài 2 : Viết chương trình nhập vào một mảng số nguyên có n phần tử");
		System.out.println("a) Xuất giá trị các phần tử của mảng.");
		System.out.println("b) Tìm phần tử có giá trị lớn nhất, nhỏ nhất.");
		System.out.println("c) Đếm số phần tử là số chẵn");
		System.out.println("d) Tìm các phần tử là số nguyên tố.");
		System.out.println("e) Sắp xếp mảng tăng dần");
		System.out.println("f) Tìm phần tử có giá trị x");
		System.out.println();
		bai2Them(objSc);
		objSc.close();
	}

	/*
	 * Bai 3 : Viet chuong trinh nhap mang so nguyen tu ban phim
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
				System.out.println("- Array[] = " + Arrays.toString(array));
				
				// Sap xep tang dan
				System.out.println();
				System.out.println("- Sap xep cac phan tu trong mang theo thu tu tang dan");
				Arrays.sort(tempArr);
				System.out.println("Array[] = " + Arrays.toString(tempArr));

				// Hien thi cac phan tu co gia tri nho nhat
				System.out.println();
				System.out.println("- Cac phan tu co gia tri nho nhat");
				getIndexOfMin(array,n,tempArr[0]);
				
				// Tinh trung binh cong
				trungBinhCong(array,n);
				
			}
			
		} catch (Exception e) {
			System.out.println("Gia tri ban nhap khong phu hop");
			return;
		}
		
		
		
	}
	
	/*
	 * Bai 4 : Viet chuong trinh nhap 2 mang ho ten va diem cua sinh vien
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
				System.out.println();
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
			System.out.println("- Hien thi ho ten va diem");
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
			System.out.println("- Sap xep danh sach sinh vien tang dan theo diem");
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
			System.out.println();
		} catch (Exception e) {
			
		}
	}
	
	/*
	 * Bài 1 : Viết chương trình nhập số nguyên dương n và thực hiện các chức năng sau: 
	 *	a) Tính tổng các chữ số của n. 
	 *	b) Liệt kê các ước số của n. 
	 *	c) Liệt kê các ước số là nguyên tố của n.
	 * */
	public static void bai1Them(Scanner objSc){
		int n=0;
		boolean loop = true;
		while(loop){
			try {
				System.out.println("nhap n");
				n = objSc.nextInt();
				loop = false;
			} catch (Exception e) {
			}
		}
		
		tongCacChuSo(n);
		uocSo(objSc,n);
		uocSoNguyenTo(objSc,n);
	}
	
	/*
	 * Bài 2 : Viết chương trình nhập vào một mảng số nguyên có n phần tử
	 *	a) Xuất giá trị các phần tử của mảng.
	 *	b) Tìm phần tử có giá trị lớn nhất, nhỏ nhất.
	 *	c) Đếm số phần tử là số chẵn
	 *	d) Tìm các phần tử là số nguyên tố.
	 *	e) Sắp xếp mảng tăng dần
	 *	f) Tìm phần tử có giá trị x
	 * */
	public static void bai2Them(Scanner objSc){
		
		int n=0;
		int array[];
		boolean loop = true;
		
		while(loop){
			System.out.println("Nhap so phan tu cua mang");
			try {
				System.out.printf("n = ");
				n = objSc.nextInt();
				loop = false;
			} catch (Exception e) {
				System.out.println("So vua nhap khong phu hop. Nhap lai n.");
			}
		}
		
		System.out.println();
		System.out.println("Nhap cac phan tu cua mang");
		
		array = new int[n];
		for(int i=0;i<n;i++){
			loop = true;
			while(loop){
				try {
					System.out.printf("a[%d] = ",i);
					array[i] = objSc.nextInt();
					objSc.nextLine();
					System.out.println();
					loop = false;
				} catch (Exception e) {
					System.out.println("So vua nhap khong phu hop.Nhap lai");
				}
			}
		}
		
		
		int min = array[0];
		int max = array[0];
		int count=0;
		for(int i=1;i<n;i++){
			if (min > array[i]){
				min = array[i];
			}
			if (max < array[i]){
				max = array[i];
			}
			if(array[i]%2 == 0){
				count++;
			}
		}
		
		// Hien thi phan tu co gia tri nho nhat trong mang
		System.out.println("Cac phan tu co gia tri nho nhat trong mang");
		for(int i=0;i<n;i++){
			if (array[i] == min){
				System.out.printf("a[%d] = ",i);
			}
		}
		System.out.printf("%d",min);
		System.out.println();
				
		// Hien thi phan tu co gia tri lon nhat trong mang
		System.out.println("Cac phan tu co gia tri lon nhat trong mang");
		for(int i=0;i<n;i++){
			if (array[i] == max){
				System.out.printf("a[%d] = ",i);
			}
		}
		System.out.printf("%d",max);
		System.out.println();
		
		System.out.printf("Trong mang co %d phan tu la so chan",count);
		System.out.println();
		
		// Tim cac phan tu la so nguyen to
		System.out.println("Danh sach so nguyen to trong mang");
		for (int i=0;i<n;i++){
			if(soNguyenTo(array[i])){
				System.out.printf("a[%d] = %d",i,array[i]);
				System.out.println();
			}
		}
		
		// Sap xep theo gia tri tang dan
		int temp1[] = new int[n];
//		int temp2[] = new int[n];
		temp1 = Arrays.copyOf(array, n);
		Arrays.sort(temp1);
//		for(int i=0;i<n;i++){
//			temp2[i] = temp1[n-i];
//		}
		System.out.println("Sap xep mang theo thu tu tang dan");
		System.out.println("a[] = " + Arrays.toString(temp1));
		
		// Tim phan tu co gia tri x
		System.out.println("Nhap gia tri can tim kiem");
		loop = true;
		int x;
		while(loop){
			try {
				System.out.printf("x = ");
				x = objSc.nextInt();
				for(int i=0;i<n;i++){
					if(array[i] == x){
						System.out.printf("a[%d] ",i);
					}
				}
				System.out.println();
				loop = false;
			} catch (Exception e) {				
			}
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
			System.out.println("- Khong co so nao chia het cho 3");
		}else{
			System.out.println("- TBC = " + (sum/count));
			System.out.println();
		}
	}
	
	public static void tongCacChuSo(int n){
		int temp;
		temp = n;
		boolean loop = true;
		int tong = 0;
		do {
			tong += temp%10;
			temp = temp/10;
		} while (temp > 10);
		
		tong += temp;
		System.out.println("- Tong cac chu so cua n = " + tong);
	}
	
	public static void uocSo(Scanner objSc,int n){
		System.out.println("- Danh sach uoc so cua n : ");
		for(int i=1;i<=n;i++){
			if (n%i == 0){
				System.out.printf("%d ",i);
			}
		}
		System.out.println();
	}
	
	public static void uocSoNguyenTo(Scanner objSc,int n){	
		System.out.println("- Danh sach uoc so cua n la so nguyen to");
		for(int i=1;i<=n;i++){
			if (n%i == 0){
				if(soNguyenTo(i)){
					System.out.printf("%d",i);
					System.out.println();
				}
			}
		}		
	}
	
	public static boolean soNguyenTo(int i){
		int count=0;
		for(int j=1;j<=i;j++){
			if(i%j == 0){
				count++;
			}
		}
		if(count == 2){
			return true;
		}else{
			return false;
		}
	}
}