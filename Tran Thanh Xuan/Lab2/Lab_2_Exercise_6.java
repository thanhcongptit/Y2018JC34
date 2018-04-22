package Lab2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab_2_Exercise_6 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
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

}
