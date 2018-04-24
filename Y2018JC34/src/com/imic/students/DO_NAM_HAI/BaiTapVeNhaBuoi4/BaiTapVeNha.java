package com.imic.students.DO_NAM_HAI.BaiTapVeNhaBuoi4;

import java.util.Scanner;

public class BaiTapVeNha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.println("        Bài tập Về Nhà         ");
		System.out.println(" +-----------------------------+ ");
		System.out.println(" | 1 Tính số ngày trong tháng  | ");
		System.out.println(" | 2 Đăng kí tham gia kết bạn  | ");
		System.out.println(" | 3 Số chẵn - số lẻ           | ");
		System.out.println(" | 4 Ket Thuc                  | ");
		System.out.println(" +-----------------------------+ ");
		System.out.print("     Bạn muốn kiểm tra bài nào :   ");

		try {
			int chonSo = nhap.nextInt();
			nhap.nextLine();
			switch (chonSo) {

			case 1:
				System.out.println("+--------------------------+");
				System.out.println("| Tính số ngày trong tháng |");
				System.out.println("+--------------------------+");

				String thang = "";
				String nam = "";
				try {
					do {
						System.out.print("Nhập vào tháng cần xem : ");
						thang = nhap.nextLine();
					} while (thang.equals(""));
					do {
						System.out.print("Nhập vào năm cần xem : ");
						nam = nhap.nextLine();
					} while (nam.equals(""));
					if ((Integer.parseInt(nam)) < 0 || (Integer.parseInt(nam)) > 9999) {
						System.out.print("Mời bạn nhập lại năm cần xem : ");
					} else {

						switch (Integer.parseInt(thang)) {
						case 1:
							System.out.println("tháng 1 năm " + Integer.parseInt(nam) + "có 31 ngày");
							break;
						case 2:
							if ((Integer.parseInt(nam)) % 4 == 0 || (Integer.parseInt(nam)) % 100 == 0) {
								System.out.println("tháng 2 năm " + Integer.parseInt(nam) + " có 29 ngày ");
							} else {
								System.out.println("tháng 2 năm " + Integer.parseInt(nam) + " có 28 ngày");
							}
							break;
						case 3:
							System.out.println("tháng 3 năm " + Integer.parseInt(nam) + " có 31 ngày");
							break;
						case 4:
							System.out.println("tháng 4 năm " + Integer.parseInt(nam) + " có 30 ngày");
							break;
						case 5:
							System.out.println("tháng 5 năm " + Integer.parseInt(nam) + " có 31 ngày");
							break;
						case 6:
							System.out.println("tháng 6 năm " + Integer.parseInt(nam) + " có 30 ngày");
							break;
						case 7:
							System.out.println("tháng 7 năm " + Integer.parseInt(nam) + " có 31 ngày");
							break;
						case 8:
							System.out.println("tháng 8 năm " + Integer.parseInt(nam) + " có 31 ngày");
							break;
						case 9:
							System.out.println("tháng 9 năm" + Integer.parseInt(nam) + " có 30 ngày");
							break;
						case 10:
							System.out.println("tháng 10 năm" + Integer.parseInt(nam) + " có 31 ngày");
							break;
						case 11:
							System.out.println("tháng 11 năm " + Integer.parseInt(nam) + " có 30 ngày");
							break;
						case 12:
							System.out.println("tháng 12 năm " + Integer.parseInt(nam) + " có 31 ngày");
							break;
						default:
							System.out.println("Mời bạn nhập lại tháng hoặc năm");
							break;
						}
					}
				} catch (Exception a) {
					System.out.println("vui lòng nhập số");
				}
				break;

			case 2:
				System.out.println("+--------------------------+");
				System.out.println("| Đăng kí tham gia kết bạn |");
				System.out.println("+--------------------------+");

				String ten = "";
				String tuoi = "";
				String honNhan = "";
				String gioiTinh = "";

				do {
					System.out.print("Nhập tên của bạn : ");
					ten = nhap.nextLine();
				} while (ten.equals(""));

				try {
					do {
						System.out.print("Tuổi của bạn : ");
						tuoi = nhap.nextLine();
					} while (tuoi.equals(""));

					System.out.println("Giới tính : 1.Nam ");
					System.out.println("            2.Nữ ");
					System.out.print("Giới tính của bạn (chọn số) : ");
					gioiTinh = nhap.nextLine();

					System.out.println("Tình trạng hôn nhân: 1. Đã có gia đình ");
					System.out.println("                     2. Chưa có gia đình ");
					System.out.println("                     3. Đã ly hôn ");
					System.out.print("Tình trạng hôn nhân của bạn (chọn số): ");
					honNhan = nhap.nextLine();

					switch (Integer.parseInt(gioiTinh)) {
					case 1:
						if (Integer.parseInt(tuoi) >= 22) {
							if (Integer.parseInt(honNhan) == 1) {
								System.out.println("Không được phép tham gia");
							} else if (Integer.parseInt(honNhan) == 2 || Integer.parseInt(honNhan) == 3) {
								System.out.println("Được phép tham gia");
							} else {
								System.out.println("Mời bạn chọn lại");
							}
						} else {
							System.out.println("Không được phép tham gia");
						}
						break;
					case 2:
						if (Integer.parseInt(tuoi) >= 19) {
							if (Integer.parseInt(honNhan) == 1) {
								System.out.println("Không được phép tham gia");
							} else if (Integer.parseInt(honNhan) == 2 || Integer.parseInt(honNhan) == 3) {
								System.out.println("Được phép tham gia");
							} else {
								System.out.println("Mời bạn chọn lại");
							}
						} else {
							System.out.println("Không được phép tham gia");
						}
						break;
					}

				} catch (Exception b) {
					System.out.println("Mời bạn nhập số");
				}
				break;

			case 3:
				System.out.println("+-----------------+");
				System.out.println("| Số chẵn - Số lẻ |");
				System.out.println("+-----------------+");

				int soNhap = 0;
				int soDem = soNhap;
				System.out.print("Mời bạn nhập số tùy thích : ");
				try {
					soNhap = nhap.nextInt();
					if (soNhap % 2 == 0) {
						while (0 <= soDem && soDem <= soNhap) {
							soDem++;
							if (soDem % 2 == 0) {
								System.out.println("Ta được số chẵn : " + soDem);
							}
						}
					} else {
						while (0 <= soDem && soDem <= soNhap) {
							soDem++;
							if (soDem % 2 == 1) {
								System.out.println("Ta được số lẻ : " + soDem);
							}
						}
					}

				} catch (Exception a) {
					System.out.println("Mời bạn nhập số ");
				}
				break;

			case 4:
				System.out.println("---------Kết thúc chương trình---------");
				break;

			default:
				System.out.println("Mời bạn chọn lại bài cần kiểm tra ");
			}

		} catch (Exception b) {
			System.out.println(" Mời bạn nhập số ");
		}
	}
}
