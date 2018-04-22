package BaiTap1;

import java.util.Scanner;

public class Lab3 {
	public static void main(String[] args) {

		Scanner nhap = new Scanner(System.in);
		System.out.print("1 canh cua khoi lap phuong bang : ");
		int a = nhap.nextInt();          // nhap 1 canh cua hinh lap phuong
		double TheTich = Math.pow(a, 3); // tinh the tich hinh lap phuong
		System.out.println("The tich cua khoi lap phuong = " + TheTich);

	}
}
