package com.imic.students.TruongQuangQuan.BaiTapBuoi9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

// Xây dựng ứng dụng quản lý sản phẩm (thông tin mỗi sản phẩm gồm tên và giá)
// theo menu như sau
// 	1. Nhập danh sách sản phẩm từ bàn phím
//	2. Sắp xếp giảm dần theo giá và xuất ra màn hình
//	3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím
//	4. Xuất giá trung bình của các sản phẩm

public class Bai3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<SPham> a = new ArrayList<SPham>();

		boolean checkInput = true;
		int tiepTuc = 0;

		while (true) {
			input(scanner, a);
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

		System.out.println("Mảng gốc: ");
		print(a);

		Collections.sort(a, new Comparator<SPham>() {
			@Override
			public int compare(SPham o1, SPham o2) {
				if (o1.getPrice() > o2.getPrice()) {
					return -1;
				} else if (o1.getPrice() < o2.getPrice()) {
					return 1;
				} else
					return 0;
			}
		});
		print(a);

		System.out.println("Tên sản phẩm cần xóa");
		String name = scanner.nextLine();
		for (int i = 0; i < a.size(); i++) {
			SPham sp = a.get(i);
			if (sp.getName().equalsIgnoreCase(name)) {
				a.remove(i);
				i--;
			}
		}

		System.out.println("Mảng sau khi xóa tên");
		print(a);

		double total = 0;
		for (int i = 0; i < a.size(); i++) {
			SPham sp = a.get(i);
			total += sp.getPrice();
		}
		System.out.println("Giá trung bình các của sản phẩm : " + total / a.size());
	}

	public static void input(Scanner scanner, ArrayList<SPham> a) {

		SPham sp = new SPham();
		System.out.println("Tên sản phẩm : ");
		String name = scanner.nextLine();
		System.out.println("Giá sản phẩm : ");
		double price = scanner.nextDouble();
		sp.setName(name);
		sp.setPrice(price);
		a.add(sp);
	}

	public static void print(ArrayList<SPham> a) {
		for (int j = 0; j < a.size(); j++) {
			System.out.println(a.get(j));
		}
		System.out.println("=====================================");
	}
}
