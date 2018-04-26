
//BTVN:  Nhập vào 1 mảng số nguyên , in ra tất cả các số chẵn ra ngoài màn hình

package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi5;

import java.util.Scanner;

public class SoChan {

	public static void main(String[] args) {

		Scanner nhap = new Scanner(System.in);

		int n = 0;
		int tong = 0;
		try {
			System.out.print(" Mời bạn nhập số lượng index : ");
			n = nhap.nextInt();

			int[] soNguyen = new int[n];

			for (int i = 0; i < n; i++) {

				System.out.print(" Mời bạn nhập số nguyên : ");
				soNguyen[i] = nhap.nextInt();

			}
			for (int x : soNguyen) {
				if (x % 2 == 0) {
					System.out.println("Ta được số chẵn trong mảng : " + x);
				}

			}
		}

		catch (Exception a) {
			System.out.println(" Mời bạn nhập lại số ");
		}
	}
}
