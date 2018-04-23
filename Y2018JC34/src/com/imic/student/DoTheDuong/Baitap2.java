package com.imic.student.DoTheDuong;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Baitap2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Thông tin chươngg trình Bạn Muốn Hẹn Hò");
		System.out.println("Nhập Họ và Tên");
		String hoTen = scanner.nextLine();
		if (hoTen.equals("")) {
			System.out.println("Bạn chưa nhập họ tên");
		}
		
		System.out.println("Nhập tuổi");
		String tuoi = scanner.nextLine();
		if (tuoi.equals("")) {
			System.out.println("Bạn chưa nhập tuổi");
		}
		
		System.out.println("Nhập giới tính");
		String gioiTinh = scanner.nextLine();
		if (gioiTinh.equals("")) {
			System.out.println("Bạn chưa nhập giới tính");
		}

		System.out.println("Tình trạng hôn nhân");
		String honNhan = scanner.nextLine();
		if (honNhan.equals("")) {
			System.out.println("Bạn chưa nhập Tình trạng hôn nhân");
		}
			
			if (Integer.parseInt(tuoi) >= 22 && gioiTinh.equals("Nam") && honNhan.equals("Độc thân") || honNhan.equals("Ly hôn")) {
				System.out.println("Bạn được tham gia");
			} else if (gioiTinh.equals("Nữ") && Integer.parseInt(tuoi) >= 18 && honNhan.equals("Độc thân") || honNhan.equals("Ly hôn")) {
				System.out.println("Bạn đủ điều kiện tham gia");
			} else {
				System.out.println("Bạn chưa đủ điều kiện tham gia");
			}
		} 
	}


