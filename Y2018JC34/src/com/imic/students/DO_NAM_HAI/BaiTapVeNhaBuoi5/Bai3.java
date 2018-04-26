
//Viết chương trình nhập mảng số nguyên từ bàn phím.
// Sắp xếp và xuất mảng vừa nhập ra màn hình.
// Xuất phần tử có giá trị nhỏ nhất ra màn hình
// Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3

package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi5;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);

		int tong = 0;
		int n = 0;
		try {
			System.out.print(" Mời bạn nhập số lượng index : ");
			n = nhap.nextInt();

			int[] soNguyen = new int[n];

			for (int i = 0; i < n; i++) {

				System.out.print(" Mời bạn nhập số nguyên : ");
				soNguyen[i] = nhap.nextInt();

			}

			Arrays.sort(soNguyen);

			System.out.println("Sau khi sắp xếp số nguyên vừa nhập, ta được " + Arrays.toString(soNguyen));

			for (int i = 0; i < n; i++) {
				System.out.println("giá trị nhỏ nhất là :" + Math.min(soNguyen[0], soNguyen[i]));
				break;
			}
			int soBiChia = 0;
			for (int x : soNguyen) {

				if (x % 3 == 0) {
					tong += x;
					soBiChia++;
				}
			}
			System.out.println("trung bình cộng  các phần tử chia hết cho 3 = " + tong / soBiChia);
		} catch (Exception a) {
			System.out.println("Mời bạn nhập lại số");
		}
	}
}
