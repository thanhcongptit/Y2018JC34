package com.imic.student.ToMinhTuyen.btvn.buoi10;

import java.util.Scanner;

public class Lab6_bai1 {

	// Nhập họ tên từ bàn phím. Xuất tên, họ và tên đệm ra màn hình. trong đó Tên và
	// Họ xuất IN HOA

	public static void main(String[] args) {
		String hoten;
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap ho ten:");
		hoten = sc.nextLine();
		
		int i = hoten.indexOf(" ");		//lấy vị trí cua " " đầu tiên
		int j = hoten.lastIndexOf(" ");	//lấy vị trí của " " cuối cùng

		String ten = hoten.substring(j);	// tên = chuỗi từ vị trí " " cuối cùng
		String ho = hoten.substring(0, i);	// họ = chuỗi từ vị trí 0 đến vị trí " "  đầu tiên
		String tendem = hoten.substring(i, j); // tên đệm = chuỗi từ vị trí " " đầu tiên đến vị trí " " cuối cùng

		ho = ho.toUpperCase();	//chuyển họ sang IN HOA
		ten = ten.toUpperCase();	// chuyển tên sang IN HOA

		System.out.println("Ho: " + ho);
		System.out.println("Ten :" + ten);
		System.out.println("Ten dem: " + tendem);

	}

}
