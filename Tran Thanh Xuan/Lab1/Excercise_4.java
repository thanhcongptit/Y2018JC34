package Lab1;

import java.util.Scanner;

public class Excercise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float a, b, c;
		System.out.println("Fill a, b, c: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		float delta = (float) (Math.pow(b, 2) - 4 * a * c);
		if (delta < 0) {
			System.out.println("The equation has no solution!");
		} else {
			if (delta == 0) {
				float x = -b / 2 * a;
				System.out.println("Solution x = " + x);
			} else {
				double x1 = (-b - Math.sqrt(delta)) / 2 * a;
				double x2 = (-b + Math.sqrt(delta)) / 2 * a;
				System.out.println("Solution X1 = " + x1);
				System.out.println("Solution X2 = " + x2);
			}
		}

	}

}