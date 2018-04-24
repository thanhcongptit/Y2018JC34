package Lab2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab_2_Exercise_4 {

	public static void main(String[] args) {
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
				//System.out.println("Nhập không đúng. Mời nhập lại!");
			} catch (Exception e) {
				System.out.println("Nhập không đúng. Mời nhập lại!");
			}

		} while (test);

	}
}
