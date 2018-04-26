package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu5;

import java.util.Scanner;
/*
 * Bài 2: Nhap vao mang 10 phan tu, sap xep theo thu tu giam dan 
 */
public class Bai2_SapXepMang {

	public static void main(String[] args) {
		int b = 0;
		boolean check = true;
		String chuoi = "";
		Scanner sc = new Scanner(System.in);
		while(check) {
			try {
				System.out.println("Nhập số phần tử của mảng: ");
				b = new Scanner(System.in).nextInt();
				check = false;
			}catch (Exception e) {
				System.out.println("Bạn đã nhập sai kiểu dữ liệu. Vui lòng nhập lại..!");
			}
		}
		
		int a[] = new int[b];
		System.out.println("Bạn vừa tạo mảng a[" + b + "].\nMỜI BẠN NHẬP GIÁ TRỊ CÁC PHẦN TỬ.");
		for (int i = 0; i < b; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		SapXep(a);
		System.out.println("Sắp xếp");
		show(a);
	}
	   public static void SapXep(int [] arr) {
	        int temp = arr[0];
	        for (int i = 0 ; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] < arr[j]) {
	                    temp = arr[j];
	                    arr[j] = arr[i];
	                    arr[i] = temp;
	                }
	            }
	        }
	    }
	    public static void show(int [] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }

	}