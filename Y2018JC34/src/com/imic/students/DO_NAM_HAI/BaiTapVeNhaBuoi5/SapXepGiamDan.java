
//BTVN: Nhap vao mang 10 phan tu, sap xep theo thu tu giam dan 

package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi5;

import java.util.Arrays;
import java.util.Scanner;

public class SapXepGiamDan {
	public static void main(String[] args) {

		Scanner nhap = new Scanner(System.in);
		try {
			int[] soNguyen = new int[10];

			for (int i = 0; i < 10; i++) {

				System.out.print(" Mời bạn nhập số nguyên : ");
				soNguyen[i] = nhap.nextInt();

			}
			Arrays.sort(soNguyen);
			for (int i = 0; i < 9; i++) {
				for (int j = i + 1; j < 10; j++) {
					if (soNguyen[i] < soNguyen[j]) {
						int temp = soNguyen[i];
						soNguyen[i] = soNguyen[j];
						soNguyen[j] = temp;

					}

				}

			}
			System.out.print("Sắp xếp theo thứ tự giảm dần : " + Arrays.toString(soNguyen));
		} catch (Exception a) {
			System.out.println("Mời ban nhập lại số");
		}
	}

}