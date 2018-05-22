package com.imic.students.Vietanh.BaiTapBuoi9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bt_them {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SinhVien> svList = new ArrayList<SinhVien>();
		boolean check = true;

		while (check) {
			System.out.println("----------");
			Chon(svList, sc);
			System.out.println("----------");
			System.out.println("Ban co muon chon them cac chuc nang");
			System.out.println("Y or N");
			if (sc.nextLine().equalsIgnoreCase("N")) {
				check = false;
			}

		}

	}

	public static void AddSv(ArrayList<SinhVien> svList, Scanner sc) {

		SinhVien sv = new SinhVien();
		System.out.println("Xin moi nhap name");
		sv.setName(sc.nextLine());
		System.out.println("Xin moi nhap ma sinh vien");
		sv.setId(sc.nextInt());
		System.out.println("Xin moi nhap tuoi sinh vien");
		sv.setAge(sc.nextInt());
		sc.nextLine();
		System.out.println("Xin moi nhap dia chi sinh vien");
		sv.setAd(sc.nextLine());
		System.out.println("Xin moi nhap diem trung binh sinh vien");
		sv.setDiemtrungbinh(sc.nextDouble());
		sc.nextLine();

		svList.add(sv);

	}

	public static void Show(ArrayList<SinhVien> svList) {
		for (int i = 0; i < svList.size(); i++) {
			System.out.println(svList.get(i).toString());
		}
	}

	public static void Editbyid(ArrayList<SinhVien> svList, Scanner sc) {
		SinhVien sv = new SinhVien();
		System.out.println("Xin moi nhap id muon thay doi");
		int idchange = sc.nextInt();
		for (int i = 0; i < svList.size(); i++) {
			SinhVien giatrimang = svList.get(i);

			if (idchange == giatrimang.getId()) {

				svList.set(i, sv);

				sv.setName(sc.nextLine());
				System.out.println("Xin moi nhap name moi");
				sv.setName(sc.nextLine());
				System.out.println("Xin moi nhap ma sinh vien moi");
				sv.setId(sc.nextInt());
				System.out.println("Xin moi nhap tuoi sinh vien moi");
				sv.setAge(sc.nextInt());
				sc.nextLine();
				System.out.println("Xin moi nhap dia chi sinh vien moi");
				sv.setAd(sc.nextLine());
				System.out.println("Xin moi nhap diem trung binh sinh vien moi");
				sv.setDiemtrungbinh(sc.nextDouble());
				sc.nextLine();

			}
		}
	}

	public static void Xoabyid(ArrayList<SinhVien> svList, Scanner sc) {
		System.out.println("Xin moi nhap id muon xoa");
		int iddelete = sc.nextInt();
		for (int i = 0; i < svList.size(); i++) {
			SinhVien giatrimang = svList.get(i);
			if (iddelete == giatrimang.getId()) {
				svList.remove(i);
			}
		}
	}

	public static void Sortbyname(ArrayList<SinhVien> svList) {
		Collections.sort(svList);
		// Show(svList);
		System.out.println("Da sap xep xong");
	}

	public static void Sortbydiem(ArrayList<SinhVien> svList) {
		Collections.sort(svList, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				return (int) (o2.getDiemtrungbinh() - o1.getDiemtrungbinh());
			}
		});
		// Show(svList);
		System.out.println("Da sap xep xong");
	}

	public static void Chon(ArrayList<SinhVien> svList, Scanner sc) {
		System.out.println("Xin moi ban chon cac chuc nang sau");
		System.out.println("1.Add sinh vien");
		System.out.println("2.Edit sinh vien by id");
		System.out.println("3.Xoa sinh vien by id");
		System.out.println("4.Sap xep sinh vien theo ten");
		System.out.println("5.Sap xep sinh vien theo diem");
		System.out.println("6.Show sinh vien");
		System.out.println("0. Exit");
		System.out.println("-----------");
		System.out.println("Ban chon:");
		int chon = sc.nextInt();
		sc.nextLine();
		switch (chon) {
		case 0:
			System.exit(0);
		case 1:
			AddSv(svList, sc);
			break;
		case 2:
			Editbyid(svList, sc);
			break;
		case 3:
			Xoabyid(svList, sc);
			break;
		case 4:
			Sortbyname(svList);
			break;
		case 5:
			Sortbydiem(svList);
			break;
		case 6:
			Show(svList);
			break;
		default:
			System.out.println("Ban chon sai, vui long chon lai");

		}
	}
}
