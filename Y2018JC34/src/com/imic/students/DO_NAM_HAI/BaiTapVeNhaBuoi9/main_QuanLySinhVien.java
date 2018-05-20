package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi9;

import java.util.Scanner;

public class main_QuanLySinhVien {
	public static void main(String[] args) {
		QuanLySinhVien sv = new QuanLySinhVien();
		Scanner nhap = new Scanner(System.in);
		int chon = 0;
		try {
			while (chon != 7) {
				sv.menu();

				System.out.print(" bạn chọn mục nào : ");
				chon = nhap.nextInt();
				switch (chon) {
				case 1:
					sv.nhap();
					break;
				case 2:
					sv.suaSinhVien();
					break;
				case 3:
					sv.xoaID();
					break;
				case 4:
					sv.sapXepTheoDiemTrungBinh();
					break;
				case 5:
					sv.sapXepTheoTen();
					break;
				case 6:
					sv.xuat();
					break;
				case 7:
					System.out.println(" Kết thúc");
				}

			}
		}

		catch (Exception a) {
			System.out.println(" Mời bạn nhập lại");
		}
	}

}
