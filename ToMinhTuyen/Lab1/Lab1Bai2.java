package Lab1;

import java.util.Scanner;

public class Lab1Bai2 {

	public static void main(String[] args) {
		double canh1;
		double canh2;
		double dientich;
		double chuvi;

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai canh thu nhat");
		canh1 = sc.nextDouble();
		sc.nextLine();

		System.out.println("Nhap chieu dai canh thu 2");
		canh2 = sc.nextDouble();
		sc.nextLine();

		dientich = canh1 * canh2;
		chuvi = (canh1 + canh2) * 2;
		double chieudai = Math.max(canh1, canh2);
		double chieurong = Math.min(canh1, canh2);

		System.out.println("Dien tich cua hinh chu nhat la: " + dientich);
		System.out.println("chu vi cua hinh chu nhat la: " + chuvi);
		System.out.println("chieu dai cua hinh chu nhat la: " + chieudai);
		System.out.println("chieu rong cua hinh chu nhat la: " + chieurong);
		/*
		 * if (canh1 > canh2) { System.out.println("chieu dai cua hinh chu nhat la: " +
		 * canh1); System.out.println("chieu rong cua hinh chu nhat la: " + canh2); }
		 * else System.out.println("chieu dai cua hinh chu nhat la: " + canh2);
		 * System.out.println("chieu rong cua hinh chu nhat la: " + canh1);
		 */
	}

}
