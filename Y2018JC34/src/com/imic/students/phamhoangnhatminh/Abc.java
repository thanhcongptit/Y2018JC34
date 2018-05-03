package com.imic.students.phamhoangnhatminh;

import java.util.Arrays;
import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("MOI BAN NHAP SO PHAN TU CUA MANG");
        int a = sc.nextInt();
        int b[]=new int[a];
        System.out.println("ban vua nhap mot mang b["+a+"]:");
        for(int i=0;i<a;i++) {
        	System.out.println("Nhap gia tri phan tu b["+i+"] = ");
        	b[i] = sc.nextInt();
        	if(i==(a-1)) {
        		if(i==(a-1)) {
            		Arrays.sort(b);
        		}
        		System.out.println("thu tu tang dan la");
           		 for( int x : b) {
           	    
           		System.out.println(x);
           		continue;
           		}
           		 int c = b [0];
           		 System.out.println("gia tri nho nhat la ");
           		 System.out.println(c);
        	
        		}
        	}
        		
        	
	}
	}

