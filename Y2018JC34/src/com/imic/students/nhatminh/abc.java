package com.imic.students.nhatminh;

import java.util.Scanner;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc = new Scanner(System.in);
        System.out.println("MOI BAN NHAP SO PHAN TU CUA MANG");
        int a = sc.nextInt();
        int b[]=new int[a];
        int tong = 0;
        System.out.println("ban vua nhap mot mang b["+a+"]:");
        for(int i=0;i<a;i++) {
        	System.out.println("Nhap gia tri phan tu b["+i+"] = ");
        	b[i] = sc.nextInt();
        	tong +=b[i];
        	if(i==(a-1)) {
        		System.out.println(tong/a);
        	}
        }
        
        
        	
        }
	}

        
        
        

        	
        
        	
      
        
        
        
        		
        
        
	 
     
        	
        
        	
        
        
        
       
        
	


