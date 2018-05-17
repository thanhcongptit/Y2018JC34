package com.imic.student.ToMinhTuyen.btvn.buoi9;

import java.util.ArrayList;
import java.util.Scanner;
public class Bai_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		ArrayList<Double> sothuc = new ArrayList<Double>();
	
		while (true) {
			System.out.println("Nhap so thuc");
			double st  = scanner.nextDouble();
			sothuc.add(st);
			scanner.nextLine();
		
			System.out.println("Nhap them so thuc khong: Y/N");
			if (scanner.nextLine().equalsIgnoreCase("N")) {
				break;
			}
		}
		System.out.println("Mang Nhap vao: " + sothuc.toString());
		double tong = 0;
		for(int i = 0; i<sothuc.size(); i++) {
			tong = tong + sothuc.get(i);
		}
		System.out.println("Tong cac phan tu cua mang la: " + tong);
	}

}
