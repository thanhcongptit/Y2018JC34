package com.imic.students.Vietanh.BtvnBuoi10;

import java.util.ArrayList;
import java.util.Scanner;

import com.imic.students.Vietanh.BaiTapBuoi8.HocSinh;
import com.imic.students.Vietanh.BaiTapBuoi8.SanPham4;

public class btvn_file1 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		ArrayList<SanPham4> spList = new ArrayList<SanPham4>();
//		ArrayList<HocSinh> svList = new ArrayList<HocSinh>();
//		boolean check = true;
//		while(check) {
//			Chon(sc, spList, svList);
//			System.out.println("Ban co muon chon them bai tap");
//			System.out.println("Y or N");
//			String chon = sc.nextLine();
//			if(chon.equalsIgnoreCase("N")) {
//				check = false;
//			}
//		}
		
		String mau = "\\.";
		String ten = ".";
		if(ten.matches(mau)) {
			System.out.println("ok");
		}else {
			System.out.println("not oke");
		}

	}

	public static void Bai1(Scanner sc) {
		System.out.println("xin moi nhap ho ten");
		String name = sc.nextLine();

		int khoangtrang1 = name.indexOf(" ");
		String ho = name.substring(0, khoangtrang1);

		int khoangtrangcuoi = name.lastIndexOf(" ");
		String tendem = name.substring(khoangtrang1, khoangtrangcuoi);

		String ten = name.substring(khoangtrangcuoi);

		String hoviethoa = ho.toUpperCase();

		String tenviethoa = ten.toUpperCase();

		System.out.println(hoviethoa + tendem + tenviethoa);
	}

	public static void Nhap(Scanner sc, ArrayList<SanPham4> spList) {
		SanPham4 sp = new SanPham4();
		System.out.println("Xin moi nhap ten san pham");
		sp.setName(sc.nextLine());
		System.out.println("Xin moi nhap gia san pham");
		sp.setGiasp(sc.nextDouble());
		sc.nextLine();
		System.out.println("Xin moi nhap hang san pham");
		sp.setHang(sc.nextLine());
		spList.add(sp);

	}

	public static void Bai2(Scanner sc, ArrayList<SanPham4> spList) {
		for (int i = 0; i < 5; i++) {
			Nhap(sc, spList);
			System.out.println("-------------");
		}

		for (int i = 0; i < spList.size(); i++) {
			SanPham4 giatriMang = spList.get(i);
			if (giatriMang.getHang().equalsIgnoreCase("nokia")) {
				System.out.println(giatriMang.toString());
			}
		}
	}

	public static void Nhapsv(Scanner sc, ArrayList<HocSinh> svList) {
		System.out.println("-----------");
		HocSinh sv = new HocSinh();
		System.out.println("Nhap ho ten sinh vien");
		sv.setTenHS(sc.nextLine());
		System.out.println("Nhap email");
		sv.setEmail(sc.nextLine());
		System.out.println("Nhap so dien thoai sinh vien");
		sv.setPhoneNumber(sc.nextLine());
		System.out.println("Nhap so CMND sinh vien");
		sv.setCMND(sc.nextLine());
		svList.add(sv);

	}

	public static void Bai3(Scanner sc, ArrayList<HocSinh> svList) {
		for (int i = 0; i < 5; i++) {
			Nhapsv(sc, svList);
			System.out.println("-----------");
		}

		String mauEmail = "\\w+@[gmail]+[.\\w]{4,7}";
		String mauSoDT = "0\\d{9,10}";
		String mauCMND = "\\d{12}";
		for (int i = 0; i < svList.size(); i++) {
			HocSinh giatrimang = svList.get(i);
			if (!giatrimang.getEmail().matches(mauEmail)) {
				System.out.println("email cua :" + giatrimang.getTenHS() + " sai quy dinh");
				System.out.println(giatrimang.getEmail());
				System.out.println("------------");

			}
			if (!giatrimang.getPhoneNumber().matches(mauSoDT)) {
				System.out.println("So dien thoai cua:" + giatrimang.getTenHS() + " sai quy dinh");
				System.out.println(giatrimang.getPhoneNumber());
				System.out.println("------------");

			}
			if (!giatrimang.getCMND().matches(mauCMND)) {
				System.out.println("So CMND cua:" + giatrimang.getTenHS() + " sai quy dinh");
				System.out.println(giatrimang.getCMND());
				System.out.println("------------");
			} else {
				System.out.println("Thong tin sinh vien:" + giatrimang.toString());
				System.out.println("------------");
			}
		}
	}

	public static void Chon(Scanner sc,  ArrayList<SanPham4> spList, ArrayList<HocSinh> svList) {
		System.out.println("Xin moi ban chon cac bai tap sau");
		System.out.println("Bai1");
		System.out.println("Bai2");
		System.out.println("Bai3");
		System.out.println("---------");
		System.out.println("Ban chon");
		int chon = sc.nextInt();
		sc.nextLine();
		switch (chon) {
		case 1 : Bai1(sc);
		System.out.println("---------");
		break;
		case 2 : Bai2(sc, spList);
		System.out.println("---------");
		break;
		case 3 : Bai3(sc, svList);
		System.out.println("---------");
		break;
		default : System.out.println("Bai tap ban chon khong nam trong so bai tap tren");
		System.out.println("---------");
		break;
		}

	}
}
