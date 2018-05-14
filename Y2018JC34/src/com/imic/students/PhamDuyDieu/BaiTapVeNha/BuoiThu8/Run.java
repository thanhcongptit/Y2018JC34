package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu8;

import java.util.Scanner;

public class Run {

	private static Scanner scanner;

	public static void main(String[] args) {
		SanPham sp1 = new SanPham();
		scanner = new Scanner(System.in);
		System.out.println("Nhập tên rồi nhập giá sp2");
		SanPham sp2 = new SanPham(scanner.nextLine(), scanner.nextDouble());
		sp1.input();
		sp1.xuat();
		sp2.xuat();

	}
}
