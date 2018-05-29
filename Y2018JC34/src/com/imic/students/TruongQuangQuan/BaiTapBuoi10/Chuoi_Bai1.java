package com.imic.students.TruongQuangQuan.BaiTapBuoi10;

import java.util.Scanner;

public class Chuoi_Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập họ tên : ");
		String name = scanner.nextLine();
		String ho = name.substring(0, name.indexOf(" "));
		String tenDem = name.substring(name.indexOf(" "), name.lastIndexOf(" "));
		String ten = name.substring(name.lastIndexOf(" "), name.length());
		System.out.println(ho.toUpperCase() + tenDem + ten.toUpperCase());
	}
}
