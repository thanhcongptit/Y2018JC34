package BaiTap1;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		double a, b, c;
		System.out.print("gia tri cua a bang : ");
		a = nhap.nextDouble();    // nhap gia tri cua so a
		System.out.print("gia tri cua b bang : ");
		b = nhap.nextDouble();    // nhap gia tri cua so b
		System.out.print("gia tri cua c bang : ");
		c = nhap.nextDouble();    // nhap gia tri cua so c
		double delta = Math.pow(b, 2) - 4 * a * c; // tinh gia tri delta

		System.out.println("Gia tri cua can delta = " + Math.sqrt(delta));

	}
}
