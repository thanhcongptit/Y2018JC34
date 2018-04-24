package Lab2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab_2_Exercise_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Running();
	}

	public static void Running() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		String run = "";
		int exerciseNumber = 0;
		System.out.println("Nhập bài bạn muốn làm(4,5,6,7,8,9)!");
		try {
			exerciseNumber = sc.nextInt();

		} catch (Exception e) {
			// TODO: handle exception
			exerciseNumber = 0;
		}

		while (check) {
			switch (exerciseNumber) {
			case 4:
				Exercise_4();
				break;
			case 5:
				Exercise_5();
				break;
			case 6:
				Exercise_6();
				break;
			case 7:
				Exercise_7();
				break;
			case 8:
				Exercise_8();
				break;
			case 9:
				Exercise_9();
				break;

			default:
				break;
			}

			System.out.println("");
			System.out.println("Nhấn 0 để thoát. Nhấn Enter để tiếp tục!");
			run = sc.nextLine();
			if (run.equals("0")) {
				check = false;
			} else
				check = true;
			System.out.println("Nhập bài bạn muốn làm(4,5,6,7,8,9)!");
			try {
				exerciseNumber = sc.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				exerciseNumber = 0;
			}
		}
	}

	public static void Exercise_4() {
		Scanner sc = new Scanner(System.in);
		int month = 0;
		int year = 0;
		String check = "";
		boolean test = true;
		do {
			try {
				System.out.println("Month: ");
				month = Integer.parseInt(sc.nextLine());
				System.out.println("Year: ");
				year = Integer.parseInt(sc.nextLine());
				if ((month < 1 || month > 12) || year < 0) {
					throw new FileNotFoundException();
				} else {
					if (month == 2 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
						System.out.println("Tháng " + month + " năm " + year + " có 29 ngày!");
					} else {
						if (month == 2 && ((year % 400 != 0) || (year % 4 != 0 && year % 100 != 0)))
							System.out.println("Tháng " + month + " năm " + year + " có 28 ngày!");
					}
					if (month == 4 || month == 6 || month == 9 || month == 11) {
						System.out.println("Tháng " + month + " năm " + year + " có 30 ngày");
					} else {
						if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
								|| month == 12)
							System.out.println("Tháng " + month + " năm " + year + " có 31 ngày");
					}
				}
				System.out.println("Nhấn 0 để thoát, nhấn Enter để tiếp tục!");
				check = sc.nextLine();
				if (check.equalsIgnoreCase("0")) {
					test = false;
				} else {
					test = true;
				}

				// break;
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				// System.out.println("Nhập không đúng. Mời nhập lại!");
			} catch (Exception e) {
				System.out.println("Nhập không đúng. Mời nhập lại!");
			}

		} while (test);

	}

	public static void Exercise_5() {
		Scanner sc = new Scanner(System.in);
		String name = "";
		String relationship = "";
		String sex = "";
		String age = "";
		boolean test = true;
		String check = "";
		do {
			try {
				System.out.println("Mời bạn nhập tên: ");
				name = sc.nextLine();
				System.out.println("Mối quan hệ: "); // ("\\d+"))
				relationship = sc.nextLine();
				System.out.println("Giới tính: ");
				sex = sc.nextLine();
				System.out.println("Tuổi: ");
				age = sc.nextLine();
				if (relationship.matches("\\d+") || sex.matches("\\d+")) {
					throw new FileNotFoundException();
				}

				if (name.equals("") || relationship.equals("") || sex.equals("") || age.equals("")) {
					System.out.println("Bạn chưa nhập đủ thông tin!");
				} else {
					if (Integer.parseInt(age) < 19) {
						System.out.println("Bạn chưa đủ tuổi tham gia!");
					} else {
						////////////////////////////////////////////////////////////
						if (sex.equalsIgnoreCase("nam") && Integer.parseInt(age) < 22
								&& (relationship.equalsIgnoreCase("chưa có gia đình")
										|| relationship.equalsIgnoreCase("ly hôn"))) {
							System.out.println("Bạn không đủ điều kiện tham gia!");
						} else {
							if ((sex.equalsIgnoreCase("nam") && Integer.parseInt(age) >= 22
									&& (relationship.equalsIgnoreCase("chưa có gia đình")
											|| relationship.equalsIgnoreCase("ly hôn")))) {
								System.out.println("Mời bạn tham gia!");
							}
						}
						/////////////////////////////////////////////////////////////////
						if ((sex.equalsIgnoreCase("nữ") || sex.equalsIgnoreCase("nu")) && Integer.parseInt(age) < 19
								&& !(relationship.equalsIgnoreCase("chưa có gia đình")
										|| relationship.equalsIgnoreCase("ly hôn"))) {
							System.out.println("Bạn không đủ điều kiện tham gia!");
						} else {
							if ((sex.equalsIgnoreCase("nữ") || sex.equalsIgnoreCase("nu"))
									&& Integer.parseInt(age) >= 19 && (relationship.equalsIgnoreCase("chưa có gia đình")
											|| relationship.equalsIgnoreCase("ly hôn"))) {
								System.out.println("Mời bạn tham gia!");
							}
						}
					}
				}
				System.out.println("Nhấn Enter để tiếp tục. Nhấn 0 để thoát!");
				check = sc.nextLine();
				if (check.equals("0")) {
					test = false;
					sc.close();
				} else {
					test = true;
				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Nhập sai định dạng (mối quan hệ/giới tính). Mời bạn nhập lại!");
			}

		} while (test);
	}

	public static void Exercise_6() {
		String number = "";
		int numberConver = 0;
		int countEven = 0;
		int countOdd = 0;
		int count = 0;
		String check = " ";
		boolean test = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Mời bạn nhập số: ");
				number = sc.nextLine();
				if (!number.matches("\\d+")) { // check input is number or string
					throw new FileNotFoundException();
				}
				numberConver = Integer.parseInt(number);
				while (numberConver > 0) {
					int i = numberConver % 10;
					if (i % 2 == 0) {
						countEven++;
					} else
						countOdd++;
					numberConver = numberConver / 10;
					count++;
					// System.out.println(number);
				}
				if (countEven == count) {
					System.out.println("Dãy chắn!");
				} else {
					if (countOdd == count) {
						System.out.println("Dãy lẻ!");
					} else
						System.out.println("Dãy không xác định!");
				}
				System.out.println("Nhấn 0 để thoát, nhấn Enter để tiếp tục!");
				check = sc.nextLine();
				if (check.equals("0")) {
					test = false;
				} else {
					test = true;
				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Bạn phải nhập số. Mời bạn nhập lại!");
			}

		} while (test);
	}

	public static void Exercise_7() {
		Scanner sc = new Scanner(System.in);
		String a, b, c;
		float aConver, bConver, cConver;

		do {
			try {
				System.out.println("Fill a, b, c: ");
				a = sc.nextLine();
				b = sc.nextLine();
				c = sc.nextLine();
				if (!a.matches("\\d+") || !b.matches("\\d+") || !c.matches("\\d+")) {
					throw new FileNotFoundException();
				}
				aConver = Float.parseFloat(a);
				bConver = Float.parseFloat(b);
				cConver = Float.parseFloat(c);
				if (aConver == 0) {
					if (bConver == 0) {
						if (cConver == 0) {
							System.out.println("The equation have unlimited solution!");
						} else {
							System.out.println("The equation has no solution!");
						}
					} else {
						System.out.println("The equation has a solution x = " + (-cConver / 2 * bConver));
					}
				} else {
					float delta = (float) (Math.pow(bConver, 2) - 4 * aConver * cConver);
					if (delta < 0) {
						System.out.println("The equation has no solution!");
					} else {
						if (delta == 0) {
							float x = -bConver / 2 * aConver;
							System.out.println("Solution x = " + x);
						} else {
							double x1 = (-bConver - Math.sqrt(delta)) / 2 * aConver;
							double x2 = (-bConver + Math.sqrt(delta)) / 2 * aConver;
							System.out.println("Solution X1 = " + x1);
							System.out.println("Solution X2 = " + x2);
						}
					}

				}
				break;

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("You want fill a number!");

			}

		} while (true);

	}

	public static void Exercise_8() {
		Scanner sc = new Scanner(System.in);
		String a, b, c;
		float aConver, bConver, cConver;

		do {
			try {
				System.out.println("Fill a, b, c: ");
				a = sc.nextLine();
				b = sc.nextLine();
				c = sc.nextLine();
				if (!a.matches("\\d+") || !b.matches("\\d+") || !c.matches("\\d+")) {
					throw new FileNotFoundException();
				}
				aConver = Float.parseFloat(a);
				bConver = Float.parseFloat(b);
				cConver = Float.parseFloat(c);
				if (aConver == 0) {
					if (bConver == 0) {
						if (cConver == 0) {
							System.out.println("The equation have unlimited solution!");
						} else {
							System.out.println("The equation has no solution!");
						}
					} else {
						System.out.println("The equation has a solution x = " + (-cConver / 2 * bConver));
					}
				} else {
					float delta = (float) (Math.pow(bConver, 2) - 4 * aConver * cConver);
					if (delta < 0) {
						System.out.println("The equation has no solution!");
					} else {
						if (delta == 0) {
							float x = -bConver / 2 * aConver;
							System.out.println("Solution x = " + x);
						} else {
							double x1 = (-bConver - Math.sqrt(delta)) / 2 * aConver;
							double x2 = (-bConver + Math.sqrt(delta)) / 2 * aConver;
							System.out.println("Solution X1 = " + x1);
							System.out.println("Solution X2 = " + x2);
						}
					}

				}
				break;

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("You want fill a number!");

			}

		} while (true);

	}

	public static void Exercise_9() {

	}

}
