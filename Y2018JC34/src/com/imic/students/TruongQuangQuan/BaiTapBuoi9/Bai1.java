package com.imic.students.TruongQuangQuan.BaiTapBuoi9;

import java.util.ArrayList;
import java.util.Scanner;

// Nhập danh sách số thực với số lượng tùy ý từ bàn phím 
// sau đó xuất danh sách vừa nhập và tổng của nó.
public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> a = new ArrayList<Double>();
		int i = 0;
		int tiepTuc = 0;
		boolean checkInput = true;

		while (true) {
			System.out.printf("Mời bạn nhập phần tử thứ % d %n", i + 1);
			System.out.print("Number = ");
			a.add(scanner.nextDouble());
			scanner.nextLine();
			i++;
			do {
				try {
					System.out.println("1\t\t: Không nhập nữa");
					System.out.println("2,3,4,...\t: Nhập tiếp");
					tiepTuc = scanner.nextInt();
					scanner.nextLine();
					checkInput = true;
				} catch (Exception e) {
					System.out.println("Bạn đã nhập sai kiểu dữ liệu, hãy nhập lại");
					scanner.nextLine();
					checkInput = false;
				}
			} while (!checkInput);
			if (tiepTuc == 1) {
				break;
			}
		}

		System.out.println("Mảng gốc");
		for (int j = 0; j < a.size(); j++) {
			System.out.print(a.get(j) + ",");
		}
		System.out.println();

		double total = 0;
		for (double x : a) {
			total += x;
		}
		System.out.println("Tổng các số thực đã nhập = " + total);
	}
}
