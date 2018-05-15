package com.imic.students.Dao_Thanh_Long;
import java.util.Arrays;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Student[] student = new Student[3];
		Student temp = new Student();
		Scanner objSc = new Scanner(System.in);
		
		String str="";
		int salary;
		
		
		
		
		System.out.println("Nhap ten ten va luong cua nhan vien");
		for(int i=0;i<3;i++){
			student[i] = new Student();
			System.out.printf("Ho ten %d : ",i);
			str = objSc.nextLine();
			student[i].setName(str);
			
			System.out.printf("Luong %d : ",i);
			salary = objSc.nextInt();
			student[i].setSalary(salary);
			objSc.nextLine();
		}
		System.out.printf("Ho ten : ");
		for(int i=0;i<3;i++){
			System.out.printf(student[i].getName() + " ");
			
		}
		System.out.println();
		System.out.printf("Luong : ");
		for(int i=0;i<3;i++){
			System.out.printf(student[i].getSalary() + " ");
			
		}
		
		System.out.println();
		for  ( int  i =  0 ; i <2 ; i ++) {  
	        for  ( int  j =  0 ; j <2  - i; j ++) {  
	            if  (student[j].getSalary()> student[j+1].getSalary()) {  
	            	temp.setName(student[j].getName());
					temp.setSalary(student[j].getSalary());
					
					student[j].setName(student[j+1].getName());
					student[j].setSalary(student[j+1].getSalary());
					
					student[j+1].setName(temp.getName());
					student[j+1].setSalary(temp.getSalary());
					
	            }  
	        }  
	    }
		System.out.println();
		System.out.println("Sap xep theo thu tu luong tang dan ");
		System.out.printf("Ho ten : ");
		for(int i=0;i<3;i++){
			System.out.printf(student[i].getName() + " ");
			
		}
		System.out.println();
		System.out.printf("Luong : ");
		for(int i=0;i<3;i++){
			System.out.printf(student[i].getSalary() + " ");
		}
				
		System.out.println();
		System.out.println();
		System.out.println("===============================================");
		System.out.println("Cach 2 : Su dung compareable ");
		
		studentCompareable[] student2 = new studentCompareable[3];
		
		for(int i=0;i<3;i++){
			
			System.out.printf("Ho ten %d : ",i);
			str = objSc.nextLine();
			
			System.out.printf("Luong %d : ",i);
			salary = objSc.nextInt();
			objSc.nextLine();
			
			student2[i] = new studentCompareable(str,salary);
		}
		
		for(int i=0;i<3;i++){
			System.out.println(student2[i].toString());
		}
		
		System.out.println();
		System.out.println("Sap xep theo thu tu luong tang dan ");
		Arrays.sort(student2);
		
		
		
		studentCompareable temp1 = new studentCompareable();
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2 - i; j++) {
//				if (student2[j].compareTo(student2[j + 1]) > 0) {
//					temp1 = student2[j];
//					student2[j] = student2[j + 1];
//					student2[j + 1] = temp1;
//				}
//			}
//		}
		
		for(int i=0;i<3;i++){
			System.out.println(student2[i].toString());
		}
		objSc.close();
	}

}
