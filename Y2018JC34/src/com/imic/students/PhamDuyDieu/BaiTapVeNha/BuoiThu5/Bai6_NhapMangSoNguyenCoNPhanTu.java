package com.imic.students.PhamDuyDieu.BaiTapVeNha.BuoiThu5;

import java.util.Scanner;

public class Bai6_NhapMangSoNguyenCoNPhanTu {
	/*
	 * Bài 2. Viết chương trình nhập vào một mảng số nguyên có n phần tử
	 * 
	 * a) Xuất giá trị các phần tử của mảng. b) Tìm phần tử có giá trị lớn nhất,
	 * nhỏ nhất. c) Đếm số phần tử là số chẵn d) Tìm các phần tử là số
	 * nguyên tố. e) Sắp xếp mảng tăng dần f) Tìm phần tử có giá trị x
	 */
	public static void main(String[] args) {
		int n;
		int luachon=0;
		boolean vonglap=true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Bạn vừa tạo mảng a[" + n + "]: ");
		nhapMang(a);
		while(vonglap) {
		System.out.println(
				"Nhập lựa chọn: \n 1) Xuất giá trị các phần tử của mảng. \n 2) Tìm phần tử có giá trị lớn nhất, nhỏ nhất. \n 3) Đếm số phần tử là số chắn. \n 4) Tìm các phần tử là số nguyên tố. \n 5) Sắp xếp mảng tăng dần. \n 6) Tìm phần tử có giá trị x. \n 7) Thoát. \n============================");
		luachon = sc.nextInt();
		
		switch (luachon) {
		case 1:
			mucA(a);
			break;
		case 2:
			timMaxMin(a);
			break;
		case 3:
			demPhanTuChan(a);
			break;
		case 4:
			phanTuNguyenTo(a);
			break;
		case 5:
			sapXepMang(a);
			mucA(a);
			break;
		case 6:
			timPhanTu(a);
			break;
		case 7:
			System.err.println("Tạm Biệt..!");
			System.exit(0);
			break;
		}
	}	
	}
	public static void timPhanTu(int a[]) {
		int x = 0;
		String timKiem = "";
		int dem = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập giá trị x cần tìm: x = ");
		x = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				dem++;
				timKiem += "a[" + i + "]\t";
			}
		}
		if (dem == 0) {
			System.out.println("Trong mảng không có giá trị cần tìm..!");
		} else {
			System.out.println("Giá trị cần tìm thuộc những vị trí: \n" + timKiem+"\n=========================");
		}
	}

	public static void sapXepMang(int a[]) {
		int temp = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}

	public static void phanTuNguyenTo(int a[]) {
		int demUoc = 0;
		String phanTuNguyenTo = "";
		for (int i = 0; i < a.length; i++) {
			demUoc = 0;
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					demUoc++;
				}
			}
			if (demUoc < 3) {
				phanTuNguyenTo += a[i] + "  ";
			}
		}
		System.out.println("Các phần tử là số nguyên tố: " + phanTuNguyenTo);
		System.out.println("=========================");
	}

	public static void demPhanTuChan(int a[]) {
		int dem = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				dem++;
			}
		}
		System.out.println("Số phần tử chẵn của mảng là: " + dem);
		System.out.println("=========================");
	}

	public static void timMaxMin(int a[]) {
		int max = 0;
		int min = 99999;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Giá trị lớn nhất của mảng là: " + max + "\nGía trị nhỏ nhất của mảng là: " + min);
		System.out.println("=========================");
	}

	public static void nhapMang(int a[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập giá trị các phần tử: \n");
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		System.out.println("=========================");
	}

	public static void mucA(int a[]) {
		String giaTriMang = "";
		for (int i = 0; i < a.length; i++) {
			giaTriMang += a[i] + "  ";
		}
		System.out.println("Giá trị các phần tử của mảng là: \n" + giaTriMang);
		System.out.println("=========================");
	}
}
