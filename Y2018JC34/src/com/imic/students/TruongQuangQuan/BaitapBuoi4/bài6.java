package com.imic.students.TruongQuangQuan.BaitapBuoi4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bài6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập số : ");
		try {
			int number = scanner.nextInt();
			scanner.nextLine();

			if (number % 2 == 0) {
				System.out.println("Số bạn nhập là số chẵn");
			} else {
				System.out.println("Số bạn nhập là số lẻ");
			}

			int i = 1;
			int j = 0;
			System.out.printf("Các số lẻ từ 0 đến %d là: ", number);
			while (i <= number) {
				j++;
				System.out.print(i + " ");
				i = i + 2;
			}
			System.out.println();
			System.out.printf("Từ 0 đến %d có %d số lẻ", number, j);
			System.out.println();
			i = 0;
			j = 0;
			System.out.printf("Các số chẵn từ 0 đến %d là: ", number);
			while (i <= number) {
				j++;
				System.out.print(i + " ");
				i = i + 2;
			}
			System.out.println();
			System.out.printf("Từ 0 đến %d có %d số chẵn", number, j);

			System.out.println();
		} catch (InputMismatchException e) {
			System.out.println(" Bạn nhập sai kiểu dữ liệu ");
		}
	}
}
