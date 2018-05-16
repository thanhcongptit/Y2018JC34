package com.imic.students.TruongQuangQuan.BaiTapBuoi9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//Viết chương trình thực hiện các chức năng sau
//1. Nhậpdanhsáchhọvàtên
// 2. Xuấtdanhsáchvừanhập 
//3. Xuấtdanhsáchngẫunhiên
//  4. Sắpxếpgiảmdầnvàxuấtdanhsách
// 5. Tìmvàxóahọtênnhậptừbànphím 
public class Bai2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();

		int i = 0;
		boolean checkInput = true;
		int tiepTuc = 0;

		while (true) {
			System.out.printf("Mời bạn nhập phần tử thứ % d %n", i + 1);
			System.out.print("Họ tên: ");
			a.add(scanner.nextLine());
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

		System.out.println("Mảng gốc:");
		print(a);

		Collections.shuffle(a);
		System.out.println("Xuất ngẫu nhiên:");
		print(a);

		Collections.sort(a, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		System.out.println("Sắp xếp giảm dần:");
		print(a);

		System.out.println("Họ tên cần xóa");
		String name = scanner.nextLine();
		for (i = 0; i < a.size(); i++) {
			if (a.get(i).equalsIgnoreCase(name)) {
				a.remove(i);
				i--;
			}
		}

		System.out.println("Mảng đã xóa");
		print(a);
	}

	public static void print(ArrayList<String> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("----------------------------");
	}
}
