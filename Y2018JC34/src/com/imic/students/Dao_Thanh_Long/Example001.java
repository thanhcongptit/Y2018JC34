package com.imic.students.Dao_Thanh_Long;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Example001 {
	private int a = 5;
	
	
	public void change(int a){
		this.a = a + a;
		
	}
	public static void main(String[] args) {
		Example001 example = new Example001();
		int b = 10;
		example.change(6);
//		example.change(b);
		System.out.println("a " + example.a );
		System.out.println("b " + b );
		
		Scanner objSc = new Scanner(System.in);
//		String str;
//		String[] strArray1;
//		
//		
//		ArrayList<String> strArray2 = new ArrayList<String>();
//		ArrayList<String> strTemp1 = new ArrayList<String>();
		
//		System.out.println("Nhap xau ki tu");
//		str = objSc.nextLine();
//		
//		strArray1 = str.split(" ");		
//		// mang cac tu
//		for(int i=0;i<strArray1.length;i++){
//			if (!strArray1[i].equals("")){
//				strTemp1.add(strArray1[i]);
//			}
//			
//		}
//		
//		Set<String> str3 = new TreeSet<String>();
//		str3.addAll(strTemp1);
//		int dem;
//		for(String str4 : str3 ){
//			dem = 0;
//			for(int j=0;j<strArray1.length;j++){
//				if(str4.equals(strArray1[j])){
//					dem+=1;
//				}
//			}
//			System.out.println(str4 + " xuat hien " + dem + " lan");
//		}
//		
////		// xoa cac tu giong nhau
////		for(int i=0;i<strArray1.length-1;i++){
////			for(int j=i+1;j<strArray1.length;j++){
////				if(strArray1[i].equals(strArray1[j])){
////					strTemp1.set(j, "");
////				}
////			}
////		}
////		
////		// Luu cac tu con lai sau khi xoa vao mang strArray2
////		for(int i=0;i<strTemp1.size();i++){
////			if(strTemp1.get(i).equals("")){
////				
////			}else{
////				strArray2.add(strTemp1.get(i));
////			}
////		}
////
////		// Dem so lan xuat hien	
////		int dem;
////		for(int i=0;i<strArray2.size();i++){
////			dem = 0;
////			for(int j=0;j<strArray1.length;j++){
////				if(strArray2.get(i).equals(strArray1[j])){
////					dem+=1;
////				}
////			}
////			System.out.println(strArray2.get(i) + " xuat hien " + dem + " lan");
////		}
		objSc.close();
	}
	

}
