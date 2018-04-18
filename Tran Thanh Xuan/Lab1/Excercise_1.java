package Lab1;

import java.util.Scanner;

public class Excercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Fill in name: ");
		String name = sc.nextLine();
		System.out.println("Fill in pass mark: ");
		double passMark = sc.nextDouble();
		System.out.printf("%s %.2f điểm", name, passMark);

	}

}
