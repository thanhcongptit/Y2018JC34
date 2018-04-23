package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu4;

import java.util.Scanner;

public class Bai6_ChonKieuChanLe {
	/*
	 * Yêu cầu: Nhập vào 1 số cần xử lý và chọn kiểu chẵn hoặc lẻ. Duyệt từ 0 đến số
	 * đó xem có bao nhiêu số chắn hoặc lẻ. Sử dụng While - Do While - For
	 */
	public static void main(String[] args) {
		int soCanXuLy;
		String chonKieu;
		String chuoiSo = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số cần xử lý: ");
		soCanXuLy = sc.nextInt();
		if (soCanXuLy % 2 == 0) {
			System.out.println("Số trên là số chẵn.\nTừ 0 đến " + soCanXuLy + " có " + (soCanXuLy / 2) + " số chẵn.");
			for (int i = 0; i <= soCanXuLy; i++) {
				if (i % 2 == 0) {
					chuoiSo = chuoiSo + i + " ";
				}
			}
		} else {
			System.out.println("Số trên là số lẻ.\nTừ 0 đến " + soCanXuLy + " có " + ((soCanXuLy / 2) + 1) + " số lẻ.");
			for (int i = 0; i <= soCanXuLy; i++) {
				if (i % 2 != 0) {
					chuoiSo = chuoiSo + i + " ";
				}

			}
		}
		System.out.println("Chuỗi số đó là: \n"+ chuoiSo);
	}
}
