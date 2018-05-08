package com.imic.student.ToMinhTuyen;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {
	// Viet chuong trinh nhap mang so nguyen tu ban phim
	// Sap xep va xuat mang vua nhap ra man hinh
	// xuat phan tu co gia tri nho nhat ra man hinh
	// Tinh va xuat ra manh hinh trung binh cong cac phan tu chia het cho 3

	public static void main(String[] args) {
		int soluong = 0;
		int min = 0;
		int dem = 0;
		int tong = 0;
		boolean check = true;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu cua mang");
		while (check) {
			try {
				soluong = scanner.nextInt();
				check = false;
			} catch (Exception e) {
				System.out.println("Ban da nhap sai moi ban nhap lai");
				scanner.nextLine();
				check = true;
			}

		}

		int a[] = new int[soluong];
		System.out.println("Nhap Cac phan tu cua Mang");
		for (int i = 0; i < a.length; i++) {
			while (!check) {

				try {

					System.out.println("a[" + i + "]");
					scanner.nextLine();
					a[i] = scanner.nextInt();
					check = false;
					break;
				} catch (Exception e) {
					System.out.println("Ban nhap sai Moi ban nhap lai");

					check = false;
				}
			}
		}
		System.out.println("Mang goc : " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Mang  sap xep tang dan: " + Arrays.toString(a));
		// System.out.println("phan tu nho nhat cua mang la: "+ a[0]);

		for (int i = 0; i < a.length; i++) {
			min = Math.min(a[0], a[i]);

		}
		System.out.println("phan tu nho nhat cua mang la: " + min);

		for (int temp : a) {
			if ((temp % 3) == 0) {
				tong = tong + temp;
				dem++;

			}
		}
		if (dem == 0) {
			System.out.println("khong co phan tu nao cua mang chia het cho 3");
		} else {
			System.out.println("Trung Binh cong cua can phan tu chia het cho 3 la: " + (tong / dem));
		}
	}

}
