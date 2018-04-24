package com.imic.students.vuvietduongbaitapvenha.buoi4;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner songay = new Scanner(System.in);
		System.out.println("Moi ban nhap thang");
		int thang = 0;
		try {
			thang = songay.nextInt();
		} catch (Exception e) {
			System.out.println("ban da nhap sai vui long nhap lai");
		}
		System.out.println("thang ban muon xem ngay la: " +thang);
		System.out.println("moi ban nhap nam");
		int nam =0;
		try {
			nam = songay.nextInt();
			
		} catch (Exception e) {
		System.out.println("ban da nhap sai vui long nhap lai");
		}
		System.out.println("nam ban muon xem ngay la: " +nam);
		if (thang == 0 || thang >=13) {
			System.out.println("ban nhap sai thang moi ban nhap lai");
		}else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
		System.out.println("Thang co 30 ngay");
		}else if (thang == 2 && nam % 400 == 0 || nam % 4 == 0 && nam % 100 != 0) {
			System.out.println("Thang co 29 ngay");
		}else if ( thang == 2 && nam % 400 != 0) {
			System.out.println(" Thang co 28 ngay");
		}else System.out.println("Thang co 31 ngay");
	}
}
