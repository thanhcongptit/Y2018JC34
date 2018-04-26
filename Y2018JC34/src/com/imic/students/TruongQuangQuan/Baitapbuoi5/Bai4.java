package com.imic.students.TruongQuangQuan.Baitapbuoi5;

import java.util.Arrays;
import java.util.Scanner;

//BÀI 4 (2 ĐIỂM)
//Viết chương trình nhập 2 mảng họ tên và điểm của sinh viên.
// Xuất 2 mảng đã nhập, mỗi sinh viên có thêm học lực
//
//LAB3: MẢNG VÀ LỆNH LẶP
//
//MOB1012 – LẬP TRÌNH JAVA 1 TRANG 3
//
//o Yếu: điểm < 5
//o Trung bình: 5 <= điểm < 6.5
//o Khá: 6.5 <= điểm < 7.5
//o Giỏi: 7.5<= điểm < 9
//o Xuất sắc: điểm >= 9
// Sắp xếp danh sách sinh viên đã nhập tăng dần theo điểm
public class Bai4 {
	public static void main(String[] args) {

		int n = 0;
		boolean checkInput = true;
		Scanner sc = new Scanner(System.in);

		do {
			try {
				System.out.print("Tổng số sinh viên : ");
				n = sc.nextInt();
				sc.nextLine();
				checkInput = true;
			} catch (Exception e) {
				System.out.println("Bạn đã nhập sai kiểu dữ liệu, hãy nhập lại");
				sc.nextLine();
				checkInput = false;
			}
		} while (!checkInput);

		String name[] = new String[n];
		double point[] = new double[n];

		int i = 0;

		while (i < name.length) {
			System.out.printf("Sinh viên thứ %d : ", i+1);
			name[i] = sc.nextLine();
			i++;
		}
		System.out.println("---------------------------");

		i = 0;
		int j = 0;
		checkInput = true;
		do {
			try {
				while (i < point.length) {
					System.out.printf("Điểm sinh viên %s \t: ", name[i]);
					point[i] = sc.nextDouble();
					i++;
					checkInput = true;
				}
			} catch (Exception e) {
				System.out.println("Bạn đã nhập sai kiểu dữ liệu, hãy nhập lại");
				sc.nextLine();
				checkInput = false;
			}
		} while (!checkInput);
		System.out.println("-----------------------------");

		String result[] = new String[n];

		for (int k = 0; k < point.length; k++) {
			if (point[k] < 5) {
				result[k] = "Yếu";
			} else if (point[k] >= 5 && point[k] < 6.5) {
				result[k] = "Trung bình";
			} else if (point[k] >= 6.5 && point[k] < 7.5) {
				result[k] = "Khá";
			} else if (point[k] >= 7.5 && point[k] < 9) {
				result[k] = "Giỏi";
			} else if (point[k] >= 9) {
				result[k] = "Xuất sắc";
			}
		}

		for (int j2 = 0; j2 < point.length; j2++) {
			System.out.printf("Sinh viên %s \t : %.2f điểm -----> Học lực :  %s  %n", name[j2], point[j2], result[j2]);
		}
		System.out.println("-------------------------------------");

		j = 0;
		for (i = 0; i < point.length - 1; i++) {
			for (j = i + 1; j < point.length; j++) {
				if (point[j] < point[i]) {
					double temp = point[i];
					point[i] = point[j];
					point[j] = temp;
					String temp1 = name[i];
					name[i] = name[j];
					name[j] = temp1;
				}
			}
		}
		
		System.out.println("Sắp xếp danh sách sinh viên tăng dần theo điểm:");
		for (int k = 0; k < result.length; k++) {
			System.out.printf(k + 1 + " : Sinh viên %s : %.2f điểm %n", name[k], point[k]);
		}
	}
}
