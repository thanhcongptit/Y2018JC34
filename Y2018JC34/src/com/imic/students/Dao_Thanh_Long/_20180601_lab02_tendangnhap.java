package com.imic.students.Dao_Thanh_Long;

import java.util.Scanner;

public class _20180601_lab02_tendangnhap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[7];
		int temp,sum=0;
		System.out.println("Nhap 5 phan tu la so nguyen");
		
		for(int i=0;i<8;i++){
			if(i >= input.length){
				System.out.println("Ban da nhap du so phan tu cua mang");
				break;
			}
				System.out.printf("a%d = ",i);
				temp = sc.nextInt();
				input[i] = temp;
				sum = sum+temp;
				sc.nextLine();
		}
		
		System.out.println("tong 5 phan tu trong mang : "+sum);
		
		sc.close();

	}

}
