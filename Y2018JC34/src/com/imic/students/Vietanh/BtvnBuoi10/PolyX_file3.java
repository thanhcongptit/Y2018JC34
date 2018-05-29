package com.imic.students.Vietanh.BtvnBuoi10;

import java.util.Scanner;

final public class PolyX_file3 {

	public static double sum(double... mang) {
		double tong = 0;
		for (int i = 0; i < mang.length; i++) {
			tong = tong + mang[i];
		}
		return tong;
	}

	public static double PolyXmin(double... mang) {
		double soMin = 0;
		for (int i = 0; i < mang.length - 1; i++) {
			for (int j = i + 1; j < mang.length; j++) {
				soMin = mang[0];
				if (mang[j] < soMin) {
					soMin = mang[j];
				}
			}
		}
		return soMin;
	}

	public static double PolyXmax(double... mang) {
		double soMax = 0;
		for (int i = 0; i < mang.length - 1; i++) {
			for (int j = i + 1; j < mang.length; j++) {
				soMax = mang[0];
				if (mang[j] > soMax) {
					soMax = mang[j];
				}
			}
		}
		return soMax;
	}
	
	public static void toUpperFirstChar() {
		Scanner sc = new Scanner(System.in);
		   System.out.println("Xin moi nhap ho ten k viet hoa");
		   String name = sc.nextLine();
		    
		    String[] mangChuoi = name.split(" ");
		    
		    String nameNew = "";
		    String space = " ";
		    
		    for(int i=0;i<mangChuoi.length;i++) {
		    	char firstChar = mangChuoi[i].charAt(0);
		    	String chuoiKytu = String.valueOf(firstChar);
		    	String viethoa =chuoiKytu.toUpperCase();
		    	mangChuoi[i] = viethoa+mangChuoi[i].substring(1);
		    	nameNew = nameNew+ mangChuoi[i]+space;
		    	
		    }
		    System.out.println("Sau khi viet hoa:"+nameNew);
		    sc.close();
		}
	}


