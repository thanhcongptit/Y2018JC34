package Lab1;

import java.util.Scanner;

public class Excercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Fill in length: ");
		float length = sc.nextFloat();
		double volume = Math.pow(length, 3);
		System.out.println("Volume = " + volume);
	}

}
