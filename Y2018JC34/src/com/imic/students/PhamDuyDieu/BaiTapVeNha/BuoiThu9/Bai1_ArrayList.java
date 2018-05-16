package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu9;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Bai1_ArrayList {
/*
 * Nhập danh sách số thực với số lượng tùy ý.
 * Sau đó xuất danh sách vừa nhập và tổng của nó.
 */
	public static void main(String[] args) {
		boolean vongLap = true;
		ArrayList<Double> soThuc = new ArrayList<Double>();
		do {		
		menu();
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		switch (key) {
		case 1:
			nhapVoHan(soThuc);
			vongLap = true;
			break;
		case 2:
			xuat(soThuc);
			vongLap = true;
			break;
		case 3:
			tinhTong(soThuc);
			vongLap = true;
			break;
		case 4:
			vongLap = false;
			System.out.println("CHÀO TẠM BIỆT..!");
			break;
		}
		} while (vongLap);
	}
	public static void nhapVoHan(ArrayList<Double> arr) {
		boolean kiemTra = true;
		System.out.println("Nhập số thực cần add\nĐể thoát gõ \"exit\"..!");
		do {
			try {			
		Scanner sc = new Scanner(System.in);
		double a=0;
		System.out.print( "Arr["+arr.size()+"] = ");
		a = sc.nextDouble();
		arr.add(a);
			} catch (Exception e) {
			kiemTra = false;
			break;
			}
		} while (kiemTra);
}
	public static void xuat(ArrayList<Double> arr) {
		for(Double a: arr) {
			System.out.print(a+ "\t");
		}
		System.out.println("");
	}
	public static double tinhTong(ArrayList<Double> arr) {
		double tong=0;
		for(int i = 0; i<arr.size(); i++) {
			tong += arr.get(i);
		}
		System.out.println("Tổng của mảng = "+ tong);
		return tong;
		
	}
	public static void menu() {
		System.out.println("NHẬP LỰA CHỌN");
		System.out.println("1: Nhập mảng");
		System.out.println("2: Xuất mảng");
		System.out.println("3: Tính tổng");
		System.out.println("4: Thoát chương trình");
	}
}
