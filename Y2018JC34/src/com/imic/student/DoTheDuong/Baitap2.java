package com.imic.student.DoTheDuong;

import java.util.Scanner;



public class Baitap2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ThÃ´ng tin chÆ°Æ¡ngg trÃ¬nh Báº¡n Muá»‘n Háº¹n HÃ²");
		System.out.println("Nháº­p Há»� vÃ  TÃªn");
		String hoTen = scanner.nextLine();
		if (hoTen.equals("")) {
			System.out.println("Báº¡n chÆ°a nháº­p há»� tÃªn");
		}
		
		System.out.println("Nháº­p tuá»•i");
		String tuoi = scanner.nextLine();
		if (tuoi.equals("")) {
			System.out.println("Báº¡n chÆ°a nháº­p tuá»•i");
		}
		
		System.out.println("Nháº­p giá»›i tÃ­nh");
		String gioiTinh = scanner.nextLine();
		if (gioiTinh.equals("")) {
			System.out.println("Báº¡n chÆ°a nháº­p giá»›i tÃ­nh");
		}

		System.out.println("TÃ¬nh tráº¡ng hÃ´n nhÃ¢n");
		String honNhan = scanner.nextLine();
		if (honNhan.equals("")) {
			System.out.println("Báº¡n chÆ°a nháº­p TÃ¬nh tráº¡ng hÃ´n nhÃ¢n");
		}
			
			if (Integer.parseInt(tuoi) >= 22 && gioiTinh.equals("Nam") && honNhan.equals("Ä�á»™c thÃ¢n") || honNhan.equals("Ly hÃ´n")) {
				System.out.println("Báº¡n Ä‘Æ°á»£c tham gia");
			} else if (gioiTinh.equals("Ná»¯") && Integer.parseInt(tuoi) >= 18 && honNhan.equals("Ä�á»™c thÃ¢n") || honNhan.equals("Ly hÃ´n")) {
				System.out.println("Báº¡n Ä‘á»§ Ä‘iá»�u kiá»‡n tham gia");
			} else {
				System.out.println("Báº¡n chÆ°a Ä‘á»§ Ä‘iá»�u kiá»‡n tham gia");
			}
		} 
	}


