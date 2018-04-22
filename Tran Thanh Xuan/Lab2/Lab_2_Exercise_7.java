package Lab2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab_2_Exercise_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
