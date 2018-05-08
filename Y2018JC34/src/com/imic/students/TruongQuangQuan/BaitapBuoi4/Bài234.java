package com.imic.students.TruongQuangQuan.BaitapBuoi4;

import java.util.Scanner;

public class Bài234 {
	public static void main(String[] args) {

		while (true) {

			System.out.println("------------------------------");
			System.out.println("Má»�i báº¡n nháº­p bÃ i táº­p sÃ´: ");
			System.out.println("2: PhÆ°Æ¡ng trÃ¬nh báº­c 2");
			System.out.println("3: TÃ­nh tiá»�n Ä‘iá»‡n");
			System.out.println("4: Káº¿t thÃºc chÆ°Æ¡ng trÃ¬nh");

			Scanner scanner = new Scanner(System.in);
			int numberExsercise = 0;
			boolean checkInput = true;

			do {
				try {
					numberExsercise = scanner.nextInt();
					while (true) {
						if (numberExsercise == 2 || numberExsercise == 3||numberExsercise==4) {
							break;
						} else {
							System.out.printf("Xin lá»—i, khÃ´ng cÃ³ bÃ i %d , hÃ£y nháº­p láº¡i %n", numberExsercise);
							System.out.println("2: PhÆ°Æ¡ng trÃ¬nh báº­c 2");
							System.out.println("3: TÃ­nh tiá»�n Ä‘iá»‡n");
							System.out.println("4: Káº¿t thÃºc chÆ°Æ¡ng trÃ¬nh");
							numberExsercise = scanner.nextInt();
						}
						checkInput = true;
					}

				} catch (Exception e) {
					System.out.println("Báº¡n nháº­p sai kiá»ƒu dá»¯ liá»‡u, hÃ£y nháº­p láº¡i");
					System.out.println("2: PhÆ°Æ¡ng trÃ¬nh báº­c 2");
					System.out.println("3: TÃ­nh tiá»�n Ä‘iá»‡n");
					System.out.println("4: Káº¿t thÃºc chÆ°Æ¡ng trÃ¬nh");
					scanner.nextLine();
					checkInput = false;
				}
			} while (!checkInput);
			
		//káº¿t thÃºc chÆ°Æ¡ng trÃ¬nh.	
		if (numberExsercise == 4) {
				break;					
			}

			switch (numberExsercise) {
			
			case 2://bÃ i 2
				int a = 0, b = 0, c = 0;
				do {
					try {
						double delta = 0;
						System.out.println("BÃ i 2 : Giáº£i phÆ°Æ¡ng trÃ¬nh báº­c 2");
						System.out.println("HÃ£y nháº­p cÃ¡c giÃ¡ trá»‹ a,b,c: ");
						System.out.print("a= ");
						a = scanner.nextInt();
						System.out.println();
						System.out.print("b= ");
						b = scanner.nextInt();
						System.out.println();
						System.out.print("c= ");
						c = scanner.nextInt();
						System.out.println();

						if (a == 0) {
							if (b == 0) {
								if (c == 0) {
									System.out.println("PhÆ°Æ¡ng trÃ¬nh cÃ³ vÃ´ sá»‘ nghiá»‡m");
								} else
									System.out.println("PhÆ°Æ¡ng trÃ¬nh vÃ´ nghiá»‡m");
							} else
								System.out.println("x= " + -b / a);
						} else

							delta = (Math.pow(b, 2) - 4 * a * c);
						if (delta < 0) {
							System.out.println("PhÆ°Æ¡ng trÃ¬nh vÃ´ nghiá»‡m");
						} else if (delta == 0) {
							System.out.println("PhÆ°Æ¡ng trÃ¬nh cÃ³  nghiá»‡m kÃ©p x= " + -b / (2 * a));
						} else {
							System.out.println("PhÆ°Æ¡ng trÃ¬nh cÃ³ 2 nghiá»‡m");
							System.out.println("x1= " + (-b + Math.sqrt(delta)) / (a * 2));
							System.out.println("x2= " + (-b - Math.sqrt(delta)) / (a * 2));
							checkInput = true;
						}
					} catch (Exception e) {
						System.out.println("Báº¡n nháº­p sai kiá»ƒu dá»¯ liá»‡u, hÃ£y nháº­p láº¡i");
						scanner.nextLine();
						checkInput = false;
					}

				} while (!checkInput);
				break;
				
			case 3://bÃ i 3
				do {
					try {

						System.out.println("BÃ i 3: TÃ­nh tiá»�n Ä‘iá»‡n");
						System.out.println("HÃ£y nháº­p vÃ o tá»•ng sá»‘ Ä‘iá»‡n dÃ¹ng trong thÃ¡ng: ");

						double soDien = scanner.nextDouble();
						double money = 0;

						if (soDien <= 50) {
							money = soDien * 1000;
						} else {
							money = 50 * 1000 + (soDien - 50) * 1200;
						}
						System.out.println("Tá»•ng sá»‘ tiá»�n Ä‘iá»‡n lÃ : " + money);
						checkInput = true;
					} catch (Exception e) {
						System.out.println("Báº¡n nháº­p sai kiá»ƒu dá»¯ liá»‡u, hÃ£y nháº­p láº¡i");
						scanner.nextLine();
						checkInput = false;
					}
				} while (!checkInput);
				break;
			default:
				break;
			}
		}
	}
}
