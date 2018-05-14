package com.imic.students.TruongQuangQuan.BaitapBuoi4;

import java.util.Scanner;
import java.lang.NumberFormatException;

public class bai5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("TÃªn cá»§a báº¡n : ");
		String name = scanner.nextLine();

		while (name.equalsIgnoreCase("")) {
			System.out.println("Báº¡n chÆ°a nháº­p tÃªn, hÃ£y nháº­p láº¡i ");
			System.out.println("TÃªn cá»§a báº¡n : ");
			name = scanner.nextLine();
		}

		boolean checkInput = true;
		int i = 0;

		do {
			try {

				System.out.println("Tuá»•i : ");
				String age = scanner.nextLine();
				while (age.equalsIgnoreCase("")) {
					System.out.println("Báº¡n chÆ°a nháº­p tuá»•i, hÃ£y nháº­p láº¡i ");
					System.out.println("Tuá»•i : ");
					age = scanner.nextLine();
				}
				i = Integer.parseInt(age);
				checkInput = true;
			} catch (Exception e) {
				System.out.println("Báº¡n Ä‘Ã£ nháº­p sai kiá»ƒu dá»¯ liá»‡u tuá»•i,hÃ£y nháº­p láº¡i");
				checkInput = false;
			}
		} while (!checkInput);

		System.out.println("TÃ¬nh tráº¡ng hÃ´n nhÃ¢n : ");
		String maritalStatus = scanner.nextLine();

		while (maritalStatus.equalsIgnoreCase("")) {
			System.out.println("Báº¡n chÆ°a nháº­p tÃ¬nh tráº¡ng hÃ´n nhÃ¢n, hÃ£y nháº­p láº¡i ");
			System.out.println("TÃ¬nh tráº¡ng hÃ´n nhÃ¢n : ");
			maritalStatus = scanner.nextLine();
		}

		System.out.println("Giá»›i tÃ­nh : ");
		String sex = scanner.nextLine();

		while (sex.equalsIgnoreCase("")) {
			System.out.println("Báº¡n chÆ°a nháº­p giá»›i tÃ­nh, hÃ£y nháº­p láº¡i ");
			System.out.println("Giá»›i tÃ­nh : ");
			sex = scanner.nextLine();
		}


		if (i >= 22 && (maritalStatus.equalsIgnoreCase("ChÆ°a cÃ³ gia Ä‘Ã¬nh") || maritalStatus.equalsIgnoreCase("Ly hÃ´n")))

		if (i >= 22
				&& (maritalStatus.equalsIgnoreCase("ChÆ°a cÃ³ gia Ä‘Ã¬nh") || maritalStatus.equalsIgnoreCase("Ly hÃ´n"))

				&& sex.equalsIgnoreCase("Nam")) {
			System.out.printf("ChÃ o má»«ng %s tham gia káº¿t báº¡n", name);
		} else if (i >= 19
				&& (maritalStatus.equalsIgnoreCase("ChÆ°a cÃ³ gia Ä‘Ã¬nh") || maritalStatus.equalsIgnoreCase("Ly hÃ´n"))
				&& sex.equalsIgnoreCase("Ná»¯")) {
			System.out.printf("ChÃ o má»«ng %s tham gia káº¿t báº¡n", name);
		} else {
			System.out.println("Xin lá»—i, báº¡n chÆ°a Ä‘á»§ Ä‘iá»�u kiá»‡n tham gia");
		}

	}

}
