package com.imic.student.TRAN_THANH_XUAN;

import java.util.Arrays;
import java.util.Scanner;

public class Xu_ly_xau {

	public static void main(String[] args) {
		int countString = 0;
		int count[] = new int[10];
		Scanner sc = new Scanner(System.in);
		String chuoi = sc.nextLine();
		String[] mangChuoi = chuoi.split(" ");// tach chuoi vao mang
		System.out.println(mangChuoi.length);
		System.out.println(Arrays.toString(mangChuoi));

		for (int i = 0; i < mangChuoi.length; i++) { // dem so dau cach
			if (mangChuoi[i].equals("")) {
				countString++;
			}
		}
		int countMang = mangChuoi.length - countString; // xac dinh so phan tu cua mang chuoi
		for (int i = countMang - 1; i >= 0; i--) {
			for (int j = 0; j < countMang; j++) {
				if (mangChuoi[i].equalsIgnoreCase(mangChuoi[j])) {
					count[i]++;
				}
			}

		}
		// -----------------------------------------------------
		for (int i = 0; i < countMang; i++) {
			if (!Test(mangChuoi, i)) {
				System.out.println(mangChuoi[i] + " " + count[i]);
			}
		}

	}

	public static boolean Test(String[] a, int b) {
		for (int i = b; i >= 1; i--) {
			for (int j = b; j >= 1; j--) {
				if (a[i].equalsIgnoreCase(a[j - 1])) {
					return false;
				}
			}
		}
		return true;
	}

}
