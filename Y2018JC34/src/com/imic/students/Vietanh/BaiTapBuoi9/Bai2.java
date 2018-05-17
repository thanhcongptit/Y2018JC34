package com.imic.students.Vietanh.BaiTapBuoi9;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		ArrayList<Double> doubleList = new ArrayList<Double>();
		Scanner sc = new Scanner(System.in);

		boolean check = true;
		while (check) {
			System.out.println("Nhap so thuc:");
			double sothuc = sc.nextDouble();
			doubleList.add(sothuc);
			sc.nextLine();

			System.out.println("Ban co muon nhap them");
			System.out.println("Y or N");
			String nhap = sc.nextLine();
			if (nhap.equalsIgnoreCase("N")) {
				check = false;
			}
            System.out.println("---------");
		}
		System.out.println("Mang so thuc");
		for(int i=0;i<doubleList.size();i++) {
			double temp = doubleList.get(i);
			System.out.println(temp);
		}
		System.out.println("--------------");
		double tong=0;
		for(double temp:doubleList) {
			tong = tong+temp;
		}
		System.out.println("Tong so thuc:"+tong);
	}
}
