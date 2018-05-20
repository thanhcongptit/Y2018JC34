package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi9;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		ArrayList<Double> soThuc = new ArrayList<Double>();
		Scanner nhap = new Scanner(System.in);
		double a;
		String chon;
		while (true) {
		System.out.print(" Nhập số : ");
		try {
			a = nhap.nextDouble();
			nhap.nextLine();
			soThuc.add(a);
			System.out.print(" Bạn có muốn nhập thêm (Y/N)? :");
			chon = nhap.nextLine();
			if (chon.equalsIgnoreCase("N")) {
				break;
			}

		}
		catch(Exception b) {
			System.out.println("Nhâp lại số");
			break;
		}
		}
		
		System.out.print(" các số đã nhập : ");
		for(int i=0;i<soThuc.size();i++) {
			System.out.print(soThuc.get(i)+ ",");
		}
		

	}
}
