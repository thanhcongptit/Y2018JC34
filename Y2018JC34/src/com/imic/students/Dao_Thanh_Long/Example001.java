package com.imic.students.Dao_Thanh_Long;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Example001 {

	public static void main(String[] args) {
		String str;
		String[] strArray1;
		ArrayList<String> strArray2 = new ArrayList<String>();
		ArrayList<String> strTemp1 = new ArrayList<String>();
		Scanner objSc = new Scanner(System.in);
		System.out.println("Nhap xau ki tu");
		str = objSc.nextLine();
		
		strArray1 = str.split(" ");		
		// mang cac tu
		for(int i=0;i<strArray1.length;i++){
			strTemp1.add(strArray1[i]);
		}
		
		// xoa cac tu giong nhau
		for(int i=0;i<strArray1.length-1;i++){
			for(int j=i+1;j<strArray1.length;j++){
				if(strArray1[i].equals(strArray1[j])){
					strTemp1.set(j, "");
				}
			}
		}
		
		// Luu cac tu con lai sau khi xoa vao mang strArray2
		for(int i=0;i<strTemp1.size();i++){
			if(strTemp1.get(i).equals("")){
				
			}else{
				strArray2.add(strTemp1.get(i));
			}
		}
		
		// Dem so lan xuat hien	
		int dem;
		for(int i=0;i<strArray2.size();i++){
			dem = 0;
			for(int j=0;j<strArray1.length;j++){
				if(strArray2.get(i).equals(strArray1[j])){
					dem+=1;
				}
			}
			System.out.println(strArray2.get(i) + " xuat hien " + dem + " lan");
		}
		objSc.close();
	}
	

}
