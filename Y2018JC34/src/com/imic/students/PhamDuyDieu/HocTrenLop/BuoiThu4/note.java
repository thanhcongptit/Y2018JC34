package com.imic.students.PhamDuyDieu.HocTrenLop.BuoiThu4;

import java.util.Scanner;

public class note {

	public static void main(String[] args) {
		/*
		 * Kieemr tra chuooix cos rong hay khong ta dung lenh
		 * String s = "tsdd";
		 * String sosanh = "";
		 * if(S.equalsIgnoreCase(sosanh)){
		 * }
		 * 
		 */
		while (true) {
			String ten;
			int tuoi=0;
			String tinhTrangHonNhan;
			String gioiTinh;
			String sosanh = "";
			Scanner sc = new Scanner(System.in);
			System.out.print("Moi ban nhap thong tin dang ky:\nHo va ten: ");
			ten = sc.nextLine();
			System.out.print("Tuoi: ");
			tuoi = sc.nextInt();
			sc.nextLine();
			System.out.println("Tinh trang hon nhan: ");
			tinhTrangHonNhan = sc.nextLine();
			System.out.println("Gioi tinh: \n1: Nam\n2: Nu");
			gioiTinh = sc.nextLine();
			if(sosanh = Integer.parseUnsignedInt(tuoi)) {
				System.out.println("chưa nhập");
			}
			else {
				System.out.println("Đã nhập");
			}
			
		}
	}
}


