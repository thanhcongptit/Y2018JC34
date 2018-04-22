package BaiTap1;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print(" ho va ten : ");
		String hoten = nhap.nextLine(); // nhap ho ten
		System.out.print("diem trung binh mon : ");
		double diem = nhap.nextDouble(); // nhap diem trung binh mon
		System.out.println("Ho va ten " + hoten + " diem trung binh mon la " + diem + " diem");

	}
}
