package com.imic.student.TRAN_THANH_XUAN_BTVN_9_150518;

import java.util.ArrayList;
import java.util.Scanner;

public class DoubleArrayslist {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> doubleArrayslist = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong day: ");
		int numberArr = sc.nextInt();
		for (int i = 0; i < numberArr; i++) {
			init(sc, doubleArrayslist);
		}
		double sum = 0;
		for (int i = 0; i < doubleArrayslist.size(); i++) {
			System.out.print(doubleArrayslist.get(i) + " ");
			sum = sum + doubleArrayslist.get(i);
		}
		System.out.println();
		System.out.println("Sum = " + sum);
	}

	public static void init(Scanner sc, ArrayList<Double> arr) {
		double num = sc.nextDouble();
		arr.add(num);
	}

}
