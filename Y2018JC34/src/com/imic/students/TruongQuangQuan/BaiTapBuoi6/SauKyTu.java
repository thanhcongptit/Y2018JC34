package com.imic.students.TruongQuangQuan.BaiTapBuoi6;

import java.util.Scanner;

public class SauKyTu {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("nhập sâu ký tự : ");

		String sauKyTu = sc.nextLine();
		String[] mangSau = sauKyTu.split(" ");

		for (int i = 0; i < mangSau.length; i++) {
			int count = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (mangSau[j].equalsIgnoreCase(mangSau[i])) {
					count++;
				}
			}
			if (count == 0) {
				for (int j = 0; j < mangSau.length; j++) {
					if (mangSau[j].equalsIgnoreCase(mangSau[i])) {
						count++;
					}
				}
				System.out.printf("Số lần xuất hiện của sâu ký tự '%s': %d lần %n ", mangSau[i], count);
			}
		}
	}
}
