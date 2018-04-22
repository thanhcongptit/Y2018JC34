package com.imic.student.DoTheDuong;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Baitap2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Thong tin chuong trinh Ban Muon Hen Ho");
		System.out.println("Nhập Họ và Tên");
		String hoTen = scanner.nextLine();
		if (hoTen.equals("")) {
			System.out.println("Ban chua nhap ho ten");
		}
		
		System.out.println("Nhập tuổi");
		String tuoi = scanner.nextLine();
		if (tuoi.equals("")) {
			System.out.println("Ban chua nhap tuoi");
		}
		
		System.out.println("Nhập giới tính");
		String gioiTinh = scanner.nextLine();
		if (gioiTinh.equals("")) {
			System.out.println("Ban chua nhap gioi tinh");
		}

		System.out.println("Tình trạng hôn nhân");
		String honNhan = scanner.nextLine();
		if (honNhan.equals("")) {
			System.out.println("Ban chua nhap tinh trang hon nhan");
		}
			
			if (Integer.parseInt(tuoi) >= 22 && gioiTinh.equals("Nam") && honNhan.equals("docthan")) {
				System.out.println("Bạn được tham gia");
			} else {
				System.out.println("Ban ko du dieu kien tham gia");
			}
			if (gioiTinh.equals("Nu") && Integer.parseInt(tuoi) >= 18 && honNhan.equals("Docthan")) {
				System.out.println("Bạn được tham gia");
			}else {
				System.out.println("Ban chua du dieu kien tham gia");
			}
		} 
	}


