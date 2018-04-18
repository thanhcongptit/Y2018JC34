package Lab1;

import java.util.Scanner;

public class Excercise_2 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Fill in width");
		float width = sc.nextFloat();
		System.out.println("Fill in length");
		float length = sc.nextFloat();
		double acreage = width * length;
		double perimeter = (width + length) * 2;
		float CMin = Math.min(width, length);
		System.out.println("Acreage = " + acreage);
		System.out.println("Perimeter = " + perimeter);
		System.out.println("Line min = " + CMin);

	}
}
