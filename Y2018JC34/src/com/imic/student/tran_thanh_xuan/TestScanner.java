package com.imic.student.tran_thanh_xuan;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age;
		String name;
		String add;
		System.out.println("Mời bạn nhập số tuổi: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("Mời bạn nhập tên: ");
		name = sc.nextLine();
		System.out.println("Mời bạn nhập địa chỉ: ");
		add = sc.nextLine();
		
		System.out.println("Tên: " + name);
		System.out.println("Tuổi: " + age);
		System.out.println("Địa chỉ: " + add);
		
	}

}
