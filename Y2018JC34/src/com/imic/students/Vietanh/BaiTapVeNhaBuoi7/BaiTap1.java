package com.imic.students.Vietanh.BaiTapVeNhaBuoi7;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Xin moi ban nhap 1 chuoi bat ki");
	String chuoi = sc.nextLine();
	
	String []mangChuoi = chuoi.split(" ");
	String a[] = chuoi.split(" ");
	
	for(int i=0;i<a.length-1;i++) {
		for(int j = i+1;j<a.length;j++) {
			if(a[i].equals(a[j])) {
				a[j] = "0";
			}
		}
	}
	System.out.println(Arrays.toString(a));
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<mangChuoi.length;j++) {
			
		}
	}
}
}
