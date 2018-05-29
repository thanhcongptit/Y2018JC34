package com.imic.students.TruongQuangQuan.BaiTapBuoi10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Chuoi_Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Chuoi_SanPham sp[] = new Chuoi_SanPham[5];

		for (int i = 0; i < sp.length; i++) {
			
			Chuoi_SanPham spTemp = new Chuoi_SanPham();
			System.out.printf("Nhập thông tin sản phâm %d %n", i + 1);
			System.out.print("Tên sản phẩm : ");
			spTemp.setTen(scanner.nextLine());
			System.out.print("Giá sản phẩm : ");
			try {
				spTemp.setGia(scanner.nextDouble());
				scanner.nextLine();
			} catch (InputMismatchException e) {
				e.getMessage();
				scanner.nextLine();
			}
			System.out.print("Hãng sản xuât : ");
			spTemp.setHang(scanner.nextLine());
			sp[i] = spTemp;
		}

		System.out.println("Các sản phẩm hãng Nokia");
		for (int i = 0; i < sp.length; i++) {
			Chuoi_SanPham spTemp = sp[i];
			if (spTemp.getHang().equalsIgnoreCase("Nokia")) {
				System.out.println(sp[i]);
			}
		}
	}
}
