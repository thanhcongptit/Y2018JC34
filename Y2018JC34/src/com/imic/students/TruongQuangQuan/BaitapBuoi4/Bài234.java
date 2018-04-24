package com.imic.students.TruongQuangQuan.BaitapBuoi4;

import java.util.Scanner;

public class Bài234 {
	public static void main(String[] args) {

		while (true) {

			System.out.println("------------------------------");
			System.out.println("Mời bạn nhập bài tập sô: ");
			System.out.println("2: Phương trình bậc 2");
			System.out.println("3: Tính tiền điện");
			System.out.println("4: Kết thúc chương trình");

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
							System.out.printf("Xin lỗi, không có bài %d , hãy nhập lại %n", numberExsercise);
							System.out.println("2: Phương trình bậc 2");
							System.out.println("3: Tính tiền điện");
							System.out.println("4: Kết thúc chương trình");
							numberExsercise = scanner.nextInt();
						}
						checkInput = true;
					}

				} catch (Exception e) {
					System.out.println("Bạn nhập sai kiểu dữ liệu, hãy nhập lại");
					System.out.println("2: Phương trình bậc 2");
					System.out.println("3: Tính tiền điện");
					System.out.println("4: Kết thúc chương trình");
					scanner.nextLine();
					checkInput = false;
				}
			} while (!checkInput);
			
		//kết thúc chương trình.	
		if (numberExsercise == 4) {
				break;					
			}

			switch (numberExsercise) {
			
			case 2://bài 2
				int a = 0, b = 0, c = 0;
				do {
					try {
						double delta = 0;
						System.out.println("Bài 2 : Giải phương trình bậc 2");
						System.out.println("Hãy nhập các giá trị a,b,c: ");
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
									System.out.println("Phương trình có vô số nghiệm");
								} else
									System.out.println("Phương trình vô nghiệm");
							} else
								System.out.println("x= " + -b / a);
						} else

							delta = (Math.pow(b, 2) - 4 * a * c);
						if (delta < 0) {
							System.out.println("Phương trình vô nghiệm");
						} else if (delta == 0) {
							System.out.println("Phương trình có  nghiệm kép x= " + -b / (2 * a));
						} else {
							System.out.println("Phương trình có 2 nghiệm");
							System.out.println("x1= " + (-b + Math.sqrt(delta)) / (a * 2));
							System.out.println("x2= " + (-b - Math.sqrt(delta)) / (a * 2));
							checkInput = true;
						}
					} catch (Exception e) {
						System.out.println("Bạn nhập sai kiểu dữ liệu, hãy nhập lại");
						scanner.nextLine();
						checkInput = false;
					}

				} while (!checkInput);
				break;
				
			case 3://bài 3
				do {
					try {

						System.out.println("Bài 3: Tính tiền điện");
						System.out.println("Hãy nhập vào tổng số điện dùng trong tháng: ");

						double soDien = scanner.nextDouble();
						double money = 0;

						if (soDien <= 50) {
							money = soDien * 1000;
						} else {
							money = 50 * 1000 + (soDien - 50) * 1200;
						}
						System.out.println("Tổng số tiền điện là: " + money);
						checkInput = true;
					} catch (Exception e) {
						System.out.println("Bạn nhập sai kiểu dữ liệu, hãy nhập lại");
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
