
//Viết chương trình nhập 2 mẩng họ tên và điểm SV

package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi5;

import java.util.Arrays;
import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		try {
			int n = 0;

			System.out.print(" Mời bạn nhập số lượng học sinh : ");
			n = nhap.nextInt();
			String hoTen[] = new String[n];
			double diem[] = new double[n];
			System.out.println("Moi ban nhap ten hoc sinh va diem so : ");
			for (int i = 0; i < n; i++) {
				nhap.nextLine();
				System.out.print("Ten hoc sinh : ");

				hoTen[i] = nhap.nextLine();

				System.out.print("Diem: ");
				diem[i] = nhap.nextInt();

			}

			for (int j = 0; j < n; j++) {

				if (diem[j] < 5) {
					System.out.println("hoc sinh " + hoTen[j] + " hoc luc yeu");

				} else if (5 <= diem[j] && diem[j] < 6.5) {
					System.out.println("hoc sinh " + hoTen[j] + " hoc luc trung binh");

				} else if (6.5 <= diem[j] && diem[j] < 7.5) {
					System.out.println("hoc sinh " + hoTen[j] + " hoc luc kha");

				} else if (7.5 <= diem[j] && diem[j] < 9) {
					System.out.println("hoc sinh " + hoTen[j] + " hoc luc gioi");

				} else {
					System.out.println("hoc sinh " + hoTen[j] + " hoc luc xuat sac");

				}
			}

			for (int a = 0; a < n - 1; a++) {
				for (int b = a + 1; b < n; b++) {
					if (diem[a] > diem[b]) {
						double temp = diem[a];
						diem[a] = diem[b];
						diem[b] = temp;

					}
				}
			}
			System.out.print("Thứ tự điểm tăng dần là : " + Arrays.toString(diem));
		} catch (Exception a) {
			System.out.println("Mời bạn nhập lại số");
		}
	}

}
