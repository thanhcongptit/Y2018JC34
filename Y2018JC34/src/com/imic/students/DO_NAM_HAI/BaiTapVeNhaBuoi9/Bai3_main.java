package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi9;

import java.util.Scanner;

public class Bai3_main {
	public static void main(String[] args) {
		Bai3_SanPham sp = new Bai3_SanPham();
		Scanner nhap = new Scanner(System.in);
		int chon = 0;
		try {
			while (chon != 5) {
				sp.menu();

				System.out.print(" bạn chọn mục nào : ");
				chon = nhap.nextInt();
				switch (chon) {
				case 1:
					sp.nhap();
					break;
				case 2:
					sp.sapXep();
					break;
				case 3:
					sp.xoaSanPham();
					break;
				case 4:
					sp.giaTrungBinh();
					break;
				case 5:
					System.out.println(" Kết thúc");
				}

			}
		}

		catch (Exception a) {
			System.out.println(" Mời bạn nhập số");
		}
	}

}
