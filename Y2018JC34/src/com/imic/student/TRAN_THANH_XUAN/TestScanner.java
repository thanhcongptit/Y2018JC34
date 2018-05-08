package com.imic.student.TRAN_THANH_XUAN;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		String name;
		String add;
		System.out.println("Má»�i báº¡n nháº­p sá»‘ tuá»•i: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("Má»�i báº¡n nháº­p tÃªn: ");
		name = sc.nextLine();
		System.out.println("Má»�i báº¡n nháº­p Ä‘á»‹a chá»‰: ");
		add = sc.nextLine();
		
		System.out.println("TÃªn: " + name);
		System.out.println("Tuá»•i: " + age);
		System.out.println("Ä�á»‹a chá»‰: " + add);
		
	}

}
