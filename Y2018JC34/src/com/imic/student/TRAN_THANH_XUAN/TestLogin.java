package com.imic.student.TRAN_THANH_XUAN;

import java.util.Scanner;

public class TestLogin {

	public static void main(String[] args) {
		/*
		 * YeÌ‚u cÃ¢Ì€u nguÌ›Æ¡Ì€i duÌ€ng nháº¡Ì‚p vaÌ€o thoÌ‚ng tin UserName vaÌ€ PassWord. ï‚§ KiÃªÌ‰m
		 * tra thoÌ‚ng tin Ä‘aÌ†ng nháº¡Ì‚p. TruÌ›Æ¡Ì€ng hÆ¡Ì£p teÌ‚n truy cáº¡Ì‚p nguÌ›Æ¡Ì€i duÌ€ng khoÌ‚ng
		 * nháº¡Ì‚p thiÌ€ Ä‘uÌ›a ra thoÌ‚ng baÌ�o â€œBaÌ£n chuÌ›a nháº¡Ì‚p teÌ‚n truy cáº¡Ì‚p!â€� vaÌ€ khi
		 * nguÌ›Æ¡Ì€i duÌ€ng khoÌ‚ng nháº¡Ì‚p máº¡Ì‚t khÃ¢Ì‰u thiÌ€ thoÌ‚ng baÌ�o â€œBaÌ£n chuÌ›a nháº¡Ì‚p máº¡Ì‚t
		 * khÃ¢Ì‰uâ€�. ï‚§ KiÃªÌ‰m tra nÃªÌ�u teÌ‚n truy cáº¡Ì‚p laÌ€ : abc vaÌ€ máº¡Ì‚t khÃ¢Ì‰u laÌ€ 123456
		 * thiÌ€ thoÌ‚ng baÌ�o â€œBaÌ£n Ä‘aÌƒ Ä‘aÌ†ng nháº¡Ì‚p thaÌ€nh coÌ‚ng!â€�. NguÌ›Æ¡Ì£c laÌ£i thiÌ€
		 * thoÌ‚ng baÌ�o â€œÄ�aÌ†ng nháº¡Ì‚p khoÌ‚ng thaÌ€nh coÌ‚ng.Vui loÌ€ng kiÃªÌ‰m tra thoÌ‚ng tin
		 * Ä‘aÌ†ng nháº¡Ì‚pâ€�.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("User name: ");
		String userName = sc.nextLine();
		//sc.nextLine();
		System.out.println("Password: ");
		String passWord = sc.nextLine();
		if (userName.equals("") || passWord.equals("")) {
			System.out.println("Ban chua nhap User name hoac Pass word!");
		} else {
			if (userName.equals("abc") && passWord.equals("123456")) {
				System.out.println("Ban da dang nhap thanh cong!");
			} else {
				System.out.println("Dang nhap khong thanh cong!");
			}
		}
	}

}
