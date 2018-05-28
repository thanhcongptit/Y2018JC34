package com.imic.students.Dao_Thanh_Long;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _20180525_Lab7 {

	private static ArrayList<SinhVienPoLy_Lab7> svList = new ArrayList<SinhVienPoLy_Lab7>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner objSc = new Scanner(System.in);
//		bai1_Lab7(objSc);
		bai4_Lab7(objSc);
		objSc.close();

	}

	public static void bai1_Lab7(Scanner objSc) {
		double dai, rong;
		ArrayList<ChuNhat_Lab7> cn = new ArrayList<ChuNhat_Lab7>();

		for (int i = 0; i < 2; i++) {
			System.out.println("Hinh chu nhat " + (i + 1));
			System.out.printf("chieu dai = ");
			dai = objSc.nextDouble();

			System.out.printf("chieu rong = ");
			rong = objSc.nextDouble();

			ChuNhat_Lab7 cn1 = new ChuNhat_Lab7(rong, dai);
			cn.add(cn1);
		}

		System.out.println("Hinh vuong ");
		System.out.printf("do dai canh = ");
		dai = objSc.nextDouble();
		ChuNhat_Lab7 vu = new Vuong_Lab7(dai);
		cn.add(vu);

		for (ChuNhat_Lab7 cn1 : cn) {
			cn1.xuat();
		}

	}

	public static void bai4_Lab7(Scanner objSc) {
//		menu();
		String str = "";
		boolean loop = true;
		
		while(loop){
			menu();
			
			str = objSc.nextLine();
			switch (str) {
			case "1": {
				nhap(objSc);
				break;
			}
			case "2": {
				xuat();
				break;
			}
			case "3": {
				svGioi();
				break;
			}
			case "4": {
				sapXep();
				break;
			}
			default:{
				loop = false;
				System.out.println("Game over");
				break;
			}
			}
		}
		

	}

	public static void menu() {
		System.out.println("*===================== MENU ================== *");
		System.out.println("*1, Nhap danh sach sinh vien                   *");
		System.out.println("*2, Xuat thong tin danh sach sinh vien         *");
		System.out.println("*3, Xuat danh sach sinh vien co hoc luc gioi   *");
		System.out.println("*4, Sap xep danh sach sinh vien theo diem      *");
		System.out.println("*5, Ket thuc                                   *");
		System.out.println("*============================================= *");
	}

	public static void nhap(Scanner objSc) {
		String hoTen, nganh;
		double diem1, diem2, diem3;

		System.out.printf("Ho ten : ");
		hoTen = objSc.nextLine();

		System.out.printf("Nganh (IT/Biz): ");
		nganh = objSc.nextLine();
//		objSc.nextLine();

		if (nganh.equals("IT")) {
			System.out.printf("Diem java : ");
			diem1 = objSc.nextDouble();

			System.out.printf("Diem html : ");
			diem2 = objSc.nextDouble();

			System.out.printf("Diem Css : ");
			diem3 = objSc.nextDouble();

			SinhVienPoLy_Lab7 sv = new SinhVienIT(hoTen, nganh, diem1, diem2,
					diem3);
			svList.add(sv);
		} else {
			System.out.printf("Diem marketing : ");
			diem1 = objSc.nextDouble();

			System.out.printf("Diem sales : ");
			diem2 = objSc.nextDouble();

			SinhVienPoLy_Lab7 sv = new SinhVienBiz(hoTen, nganh, diem1, diem2);
			svList.add(sv);
		}
		objSc.nextLine();
	}

	public static void xuat() {
		if (svList.isEmpty()) {
			System.out.println(" Danh sach sinh vien trong ");
		} else {
			for (SinhVienPoLy_Lab7 sv : svList) {
				sv.xuat();
			}
		}
	}

	public static void svGioi() {
		if (svList.isEmpty()) {
			System.out.println(" Danh sach sinh vien trong ");
		} else {
			for (SinhVienPoLy_Lab7 sv : svList) {
				if (sv.getHocLuc().equals("Gioi")) {
					sv.xuat();
				}
			}
		}
	}

	public static void sapXep() {
		if (svList.isEmpty()) {
			System.out.println(" Danh sach sinh vien trong ");
		} else {
			Collections.sort(svList);
			for (SinhVienPoLy_Lab7 sv : svList) {
				sv.xuat();
			}
		}
	}

}
