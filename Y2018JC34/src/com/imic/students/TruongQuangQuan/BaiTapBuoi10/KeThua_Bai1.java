package com.imic.students.TruongQuangQuan.BaiTapBuoi10;

import java.util.Scanner;

public class KeThua_Bai1 {
	public static void main(String[] args) {

		KeThua_HinhChuNhat hcn = new KeThua_HinhChuNhat();
		KeThua_HinhVuong hv = new KeThua_HinhVuong();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập thông tin hcn : ");
		System.out.println("Chiều dài : ");
		hcn.setDai(scanner.nextDouble());
		System.out.println("Chiều rộng : ");
		hcn.setRong(scanner.nextDouble());

		System.out.println("Thông tin hình vuông : ");
		System.out.println("Cạnh = ");
		hv.setDai(scanner.nextDouble());
		hv.setRong(hv.getDai());

		hcn.xuat();
		hv.xuat();
	}
}
