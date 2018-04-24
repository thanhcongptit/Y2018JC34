package com.imic.students.nhatminh;

import java.util.Scanner;

public class btvn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap username");
		String username = sc.nextLine();
		System.out.println("Nhap password");
		String password = sc.nextLine();
		String i = "";
		if(username.equalsIgnoreCase(i)){
			System.out.println("Ban chua nhap username");
		}
		if(password.equalsIgnoreCase(i)){
			System.out.println("Ban chua nhap password");
		}
    	String trueusername ="abc";
    	String truepass = "123456";
    	if(username.equalsIgnoreCase(trueusername)){
    		System.out.println("username dung");
    	}
    	else
    		System.out.println("username sai");
    	if(password.equalsIgnoreCase(truepass)){
    		System.out.println("password dung");
    	}
    	else 
    		System.out.println("password sai");
    		
	}
}
    		
    	
    		
    		
    	
    	
    		
    	
    		
		

