package com.imic.students.Dao_Thanh_Long;

import java.util.Scanner;

public class _20180525_Lab8 {
	
	public static void main(String[] args) {
		Scanner objSc = new Scanner(System.in);
		
		
		bai3_Lab8(objSc);
		
		objSc.close();
	}

	public static final double sum(double...x){
		double s=0;
		for(double i:x){
			s=s+i;
		}
		return s;
	}
	
	public static final double findMax(double...x){
		double max;
		max = x[0];
		for(double i:x){
			if(max < i){
				max = i;
			}
		}
		return max;
	}
	
	public static final double findMin(double...x){
		double min;
		min = x[0];
		for(double i:x){
			if(min < i){
				min = i;
			}
		}
		return min;
	}
	
	
	
	public static final void bai3_Lab8(Scanner objSc){
		String str;
		System.out.printf("Nhap ho ten : ");
		str = objSc.nextLine();
		String[] temp2;
		temp2 = str.split(" ");
		String temp3="";
		for(String s1:temp2){
			char firstChar = s1.charAt(0);
			char upperFirstChar = String.valueOf(firstChar).toUpperCase().charAt(0);
			s1 = upperFirstChar + s1.substring(1);
			temp3 = temp3+s1+" ";
		}	
		System.out.println("Ho ten : "+temp3);
	}
	
	
}
