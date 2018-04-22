package BaiTap1;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("chieu dai a = ");
		int a = nhap.nextInt();      // nhap chieu dai
		System.out.print("chieu rong b = ");
		int b = nhap.nextInt();      // nhap chieu rong
		double ChuVi = (a + b) * 2;   /* tinh chu vi va the tich */
		double DienTich = a * b;
		System.out.println("Chu vi cua hinh chu nhat = " + ChuVi);
		System.out.println("Dien tich cua hinh chu nhat = " + DienTich);
		System.out.println("Canh nho nhat la : " + Math.min(a, b));
	}
}
