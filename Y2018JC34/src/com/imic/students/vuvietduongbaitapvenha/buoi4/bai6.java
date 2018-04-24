package com.imic.students.vuvietduongbaitapvenha.buoi4;

import java.util.Scanner;

public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("moi ban nhap so");
		int so = sc.nextInt();
		System.out.println("so ban nhap la: " + so);
		int tongchan = 0;
		int tongle = 0;
		int i = 0;
		while (i >= so) {
			if (i % 2 == 0) {
				tongchan = tongchan + 1;
				i ++;
			}else tongle = tongle +1;
			i ++;
		}
		System.out.println(" tong so cac so chan la: " + tongchan);
		System.out.println(" tong so cac so le la: " + tongle);
	
	}

}
