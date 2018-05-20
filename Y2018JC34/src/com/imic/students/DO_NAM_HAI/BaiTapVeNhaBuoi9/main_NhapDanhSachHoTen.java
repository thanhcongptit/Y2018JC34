package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi9;

import java.util.Scanner;

public class main_NhapDanhSachHoTen {
	public static void main(String[] args) {
		NhapDanhSachHoTen ht = new NhapDanhSachHoTen();
		Scanner nhap = new Scanner(System.in);

		int chon = 0;
		try {
			while (chon != 6) {
				ht.menu();

				System.out.print(" bạn chọn mục nào : ");
				chon = nhap.nextInt();
				switch (chon) {
				case 1:
					ht.nhap();
					break;
				case 2:
					ht.xuat();
					break;
				case 3:
					ht.ngauNhien();
					break;
				case 4:
					ht.sapXep();
					break;
				case 5:
					ht.xoaHoTen();
					break;
				case 6:
					System.out.println(" Kết thúc");
				}

			}
		}

		catch (Exception a) {
			System.out.println(" Mời bạn nhập số");
		}
	}
}