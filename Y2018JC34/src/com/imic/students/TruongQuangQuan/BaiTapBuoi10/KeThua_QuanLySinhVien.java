package com.imic.students.TruongQuangQuan.BaiTapBuoi10;

import java.util.ArrayList;
import java.util.Scanner;

public class KeThua_QuanLySinhVien {
	public static void input(ArrayList<KeThua_SvPoly> sv) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập thông tin sinh viên : ");
		System.out.println("Ngành : ");
		String nganh = scanner.nextLine();
		if (nganh.equals("Biz")) {
			KeThua_SinhVienBiz svBiz = new KeThua_SinhVienBiz();
			svBiz.setNganh(nganh);
			System.out.println("Họ tên : ");
			svBiz.setHoTen(scanner.nextLine());
			System.out.println("Điểm Sales");
			svBiz.setDiemSales(scanner.nextDouble());
			scanner.nextLine();
			System.out.println("Điểm Marketing");
			svBiz.setDiemMarketing(scanner.nextDouble());
			scanner.nextLine();
			sv.add(svBiz);
		} else {
			KeThua_SinhVienIT svIT = new KeThua_SinhVienIT();
			svIT.setNganh(nganh);
			System.out.println("Họ tên : ");
			svIT.setHoTen(scanner.nextLine());
			System.out.println("Điểm HTML : ");
			svIT.setDiemHTML(scanner.nextDouble());
			scanner.nextLine();
			System.out.println("Điểm CSS : ");
			svIT.setDiemCSS(scanner.nextDouble());
			scanner.nextLine();
			System.out.println("Điểm JAVA : ");
			svIT.setDiemJAVA(scanner.nextDouble());
			scanner.nextLine();
			sv.add(svIT);
		}
	}

	public static void xuat(ArrayList<KeThua_SvPoly> sv) {
		for (int i = 0; i < sv.size(); i++) {
			KeThua_SvPoly svTemp = sv.get(i);
			svTemp.xuat();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<KeThua_SvPoly> sv = new ArrayList<KeThua_SvPoly>();

		while (true) {
			input(sv);
			System.out.println("Nhập tiếp : ");
			String nhapTiep = scanner.nextLine();
			if (nhapTiep.equals("n")) {
				break;
			}
		}
		xuat(sv);
	}
}
