package Lab2;

import java.util.Scanner;

public class Lab_2_Exercise_9 {
// chưa bắt try catch(xâu, số âm)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Fill your electricity indicator: ");
		int electricityIndicator = sc.nextInt();
		int priceElectricity = 0;
		if (electricityIndicator <= 50) {
			priceElectricity = electricityIndicator * 1000;
		} else {
			priceElectricity = electricityIndicator * 1000 + (electricityIndicator - 50) * 1200;
		}
		System.out.println("Price electricity: " + priceElectricity);
	}

}
