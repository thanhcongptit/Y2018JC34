package com.imic.student.Nguyen_Duc;

import java.util.Scanner;

public class Demo1 {
	public static Scanner input;
	public static int age;
	public static String name;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		name = input.nextLine();
		
		System.out.println("Enter your age : ");
		age = input.nextInt();

	}

}
