package com.imic;

import java.util.Scanner;

class VongLapWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cout  = 100;
		
		while(cout < 100) { //dung thi lam 
			//TODO
			System.out.println("wellcome to java!");
			cout ++;
		}
		
		System.out.println("-------KET THUC ---------");
		
		int count = 100;
		String username = "";
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Nhap username");
			username = scanner.nextLine();
			
		} while (username.equals("")); 
	}

}
